package br.com.confidencecambio.javabasico.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GerenteTest {

	final String NOME = "João Paulo Flores Alves Cunha";
	
	@Test
	public void testGerenteConstructor() {
		Gerente gerente =  new Gerente(NOME);
		assertEquals(NOME, gerente.getNome());
	}
}
