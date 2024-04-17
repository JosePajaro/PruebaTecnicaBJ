package com.josepajaro.pruebabj.endpoint.unit.servicio;

import com.josepajaro.pruebabj.modelo.Nota;
import com.josepajaro.pruebabj.repositorio.RepositorioNota;
import com.josepajaro.pruebabj.servicio.ServicioNota;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ServiciosNotaTests {
@Mock
    private RepositorioNota repositorioNota;
@InjectMocks
    private ServicioNota servicioNota;
@Test
    public void Caso_ServicioCrearNota(){
        Nota nota = new Nota();
        nota.setEstado((byte)0);

        when(repositorioNota.save(ArgumentMatchers.any(Nota.class))).thenReturn(nota);
        Nota notaCreada = servicioNota.crearNota(nota);
        assertThat(notaCreada.getEstado()).isSameAs(nota.getEstado());
        verify(repositorioNota).save(nota);
    }
}
