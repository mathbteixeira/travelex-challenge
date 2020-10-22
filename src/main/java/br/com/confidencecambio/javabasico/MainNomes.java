package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.model.Cliente;

public class MainNomes {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva Costa Souza Pereira Sampaio");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Primeiro Nome: " + cliente.getPrimeiroNome());
		System.out.println("Sobrenome: " + cliente.getSobrenomes());
		System.out.println("Nome em Maiúsculo: " + cliente.getNomeMaiusculo());
		System.out.println("Nome com Abreviações: " + cliente.getNomeAbreviado());
	}
}
