package com.josepajaro.pruebabj;

import com.josepajaro.pruebabj.modelo.Nota;
import com.josepajaro.pruebabj.repositorio.RepositorioNota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Component
public class ServicioNota {
    @Autowired
    private RepositorioNota repositorioNota;

    public Nota crearNota(Nota nota){
        return repositorioNota.save(nota);
    }

    public Nota getNotaById(Long id){
        Optional<Nota> optionalNota = repositorioNota.findById(id);
        return optionalNota.get();
    }

    public List<Nota> getNotas(){
        return repositorioNota.findAll();
    }

    public void eliminarNota(Long id){
        repositorioNota.deleteById(id);
    }

    public void actualizarNota(Nota nota){
        Optional<Nota> notaAlmacenada = repositorioNota.findById(nota.getId());
        if(notaAlmacenada.isPresent()){
            repositorioNota.save(nota);
        }


    }

}
