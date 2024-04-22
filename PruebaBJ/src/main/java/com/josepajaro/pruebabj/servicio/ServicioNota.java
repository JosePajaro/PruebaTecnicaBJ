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
        if (repositorioNota.findById(nota.getId()).isPresent())
            throw new NullPointerException("El id que está intentado utilizar ya se encuentra registrado");

        return repositorioNota.save(nota);
    }

    public Nota mostrarNotaPorId(Long id) {
        if (repositorioNota.findById(id).isPresent()){
            return repositorioNota.findById(id).get();
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
        if(repositorioNota.findById(nota.getId()).isEmpty())
            throw new NullPointerException("La nota que inteta actualizar no está existe");
        if (nota.getNota().isEmpty())
            throw new NullPointerException("La tarea debe tener un asunto para ser actualizada");
        if (nota.getEstado()<0 || nota.getEstado()>1)
            throw new NullPointerException("La tarea debe tener un estado entre 0 y 1 para ser actualizada");

        repositorioNota.save(nota);
    }

}
