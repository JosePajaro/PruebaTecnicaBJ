package com.josepajaro.pruebabj.servicio;

import com.josepajaro.pruebabj.modelo.Nota;
import com.josepajaro.pruebabj.repositorio.RepositorioNota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ServicioNota {
    @Autowired
    private RepositorioNota repositorioNota;

    public Nota crearNota(Nota nota) throws NullPointerException{
        if (nota == null)
            throw new NullPointerException("La tarea debe tener un asunto y un estado para poder ser creada");
        if (nota.getNota().isEmpty())
            throw new NullPointerException("La tarea debe tener un asunto para ser creada");
        if (nota.getEstado()<0 || nota.getEstado()>1)
            throw new NullPointerException("La tarea debe tener un estado entre 0 y 1 para poder ser creada");
        return repositorioNota.save(nota);
    }

    public Nota mostrarNotaPorId(Long id) {
        Optional<Nota> optionalNota = repositorioNota.findById(id);
        if (optionalNota.isPresent()){
            return optionalNota.get();
        }else throw new NullPointerException("La tarea consultada no existe");
    }

    public List<Nota> mostrarNotas(){
        return repositorioNota.findAll();
    }

    public void eliminarNota(Long id){
        if (repositorioNota.findById(id).isPresent())
            repositorioNota.deleteById(id);
        else throw new NullPointerException("La nota que desea eliminar no existe");
    }

    public void actualizarNota(Nota nota){
        Optional<Nota> notaAlmacenada = repositorioNota.findById(nota.getId());
        if(notaAlmacenada.isPresent()){
            repositorioNota.save(nota);
        }else throw new NullPointerException("La nota que inteta actualizar no está presente");
    }

}
