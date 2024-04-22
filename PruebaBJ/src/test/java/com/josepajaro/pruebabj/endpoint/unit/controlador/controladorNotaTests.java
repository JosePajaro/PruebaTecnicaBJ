package com.josepajaro.pruebabj.endpoint.unit.controlador;

import com.josepajaro.pruebabj.controlador.ControladorNota;
import com.josepajaro.pruebabj.modelo.Nota;
import com.josepajaro.pruebabj.servicio.ServicioNota;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;


@RunWith(SpringRunner.class)
@WebMvcTest(ControladorNota.class)
public class controladorNotaTests {
@Autowired
    //private MockBean mockMvc;
@MockBean
    private ServicioNota servicio;
@Test
    public void Caso_ControladorCrearNota() throws Exception{
        Nota nota = new Nota();

        //given(servicio.crearNota(nota)).willReturn(nota);
        //mockMvc.perform(post(""));
    }
}
