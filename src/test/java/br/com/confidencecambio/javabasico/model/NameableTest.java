package br.com.confidencecambio.javabasico.model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NameableTest {

	Nameable nameable =  new Nameable();
	final String NOME = "João Paulo Flores Alves Cunha";
	
	@Before
	public void init() {
		nameable =  new Nameable();
		nameable.setNome(NOME);
	}
	
	@Test
	public void testGetNome() {
		assertEquals(NOME, nameable.getNome());
	}
	
	@Test
	public void testGetPrimeiroNome() {
		String primeiroNome = "João";
		assertEquals(primeiroNome, nameable.getPrimeiroNome());
	}
	
	@Test
	public void testGetSobrenomes() {
		String sobrenome = "Paulo Flores Alves Cunha";
		assertEquals(sobrenome, nameable.getSobrenomes());
	}
	
	@Test
	public void testGetNomeMaiusculo() {
		String nomeUpper = NOME.toUpperCase();
		assertEquals(nomeUpper, nameable.getNomeMaiusculo());
	}
	
	@Test
	public void testGetNomeAbreviado() {
		String nomeAbreviado = "João P. F. A. Cunha";
		assertTrue(nomeAbreviado.contentEquals(nameable.getNomeAbreviado()));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValidaNome_Null() {
		nameable.setNome(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValidaNome_Empty() {
		nameable.setNome("");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValidaNome_EspacoNoInicio() {
		nameable.setNome(" " + NOME);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testValidaNome_EspacoNoFinal() {
		nameable.setNome(NOME + " ");
	}
}
