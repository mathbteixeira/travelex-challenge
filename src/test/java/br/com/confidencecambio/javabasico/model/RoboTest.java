package br.com.confidencecambio.javabasico.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class RoboTest {

	final String NOME = "João Paulo Flores Alves Cunha";
	
	@Test
	public void testRoboConstructor() {
		Robo robo =  new Robo(NOME);
		assertEquals(NOME, robo.getNome());
	}
}
