package br.com.confidencecambio.javabasico.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.confidencecambio.javabasico.service.JavaBasicoService;

@RunWith(MockitoJUnitRunner.class)
public class JavaBasicoControllerTest {

	@InjectMocks 
	private JavaBasicoController controller;
	
	@Mock
	private JavaBasicoService service;

	@Test
	public void testCalculaImc_OK() throws Exception {

		String peso = "90.0", altura = "1.78";
    	Double alturaDouble = (Double.parseDouble(altura));
    	Double pesoDouble = (Double.parseDouble(peso));
    	Double imcEsperado = pesoDouble / (alturaDouble * alturaDouble);

    	when(service.calculaImc(pesoDouble, alturaDouble)).thenReturn(imcEsperado);
    	
    	Double valorImc = controller.calculaImc(peso, altura);
    	assertEquals(imcEsperado, valorImc);
	}
}