package br.com.confidencecambio.javabasico.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ClienteTest {

	final String NOME = "João Paulo Flores Alves Cunha";
	
	@Test
	public void testClienteConstructor() {
		Cliente cliente =  new Cliente(NOME);
		assertEquals(NOME, cliente.getNome());
	}
}
