package com.josepajaro.pruebabj.controlador;

import com.josepajaro.pruebabj.servicio.ServicioNota;
import com.josepajaro.pruebabj.modelo.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ControladorNota {

    @Autowired
    private ServicioNota sercivioNota;

    @PostMapping
    @NonNull
    public Nota crearNota(@RequestBody Nota nota){
        return sercivioNota.crearNota(nota);
    }

    @GetMapping("/Notas")
    public List<Nota> mostrarNotas(){
        return sercivioNota.mostrarNotas();
    }

    @GetMapping("/Nota/{id}")
    public Nota mostrarNotaPorId(@PathVariable("id") Long id){
        return sercivioNota.mostrarNotaPorId(id);
    }

    @DeleteMapping("/Nota/{id}")
    public void eliminarNota(@PathVariable("id") Long id){
        sercivioNota.eliminarNota(id);
    }

    @PutMapping("/Nota")
    public void actualizarNota(@RequestBody Nota nota){
        sercivioNota.actualizarNota(nota);
    }
}
