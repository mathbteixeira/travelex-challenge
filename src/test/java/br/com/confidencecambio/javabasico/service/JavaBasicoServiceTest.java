package br.com.confidencecambio.javabasico.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JavaBasicoServiceTest {

    private JavaBasicoService service;

    @Before
    public void init(){
         service = new JavaBasicoService();
    }

    @Test
    public void testCalculaImc_OK(){
    	Double peso = 90.0, altura = 1.78;
    	Double imcEsperado = peso / (altura * altura);
        Double valorImc = service.calculaImc(peso, altura);
        assertEquals(imcEsperado, valorImc);
    }

}