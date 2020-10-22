package br.com.confidencecambio.javabasico.model;

public class Nameable {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		validaNome(nome);
		this.nome = nome;
	}

	private void validaNome(String nome) {
		if (nome == null) {
			throw new IllegalArgumentException("Nome não pode ser nulo.");
		}
		if (nome.isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser vazio.");
		}
		if (nome.startsWith(" ")) {
			throw new IllegalArgumentException("Nome não pode começar com espaço.");
		}
		if (nome.endsWith(" ")) {
			throw new IllegalArgumentException("Nome não pode terminar com espaço.");
		}
	}
		
	public String getPrimeiroNome() {
		return this.nome.split(" ")[0];
	}
	
	public String getSobrenomes() {
		String[] nomeStringArray =  this.nome.split(" ");
		String sobrenomes = "";
		for (int i = 1; i <= nomeStringArray.length - 1; i++) {
			sobrenomes = sobrenomes + nomeStringArray[i];
			if (i != nomeStringArray.length - 1) {
				sobrenomes = sobrenomes + " ";
			}
		}
		return sobrenomes;
	}
	
	public String getNomeMaiusculo() {
		return this.nome.toUpperCase();
	}
	
	public String getNomeAbreviado() {
		String[] nomeStringArray =  this.nome.split(" ");
		String nomeAbreviado = "";
		for (int i = 0; i <= nomeStringArray.length - 1; i++) {
			if (i == 0) {
				nomeAbreviado = nomeAbreviado + nomeStringArray[i] + " ";
			}
			else if (i == nomeStringArray.length - 1) {
				nomeAbreviado = nomeAbreviado + nomeStringArray[i];
			}
			else {
				nomeAbreviado = nomeAbreviado + nomeStringArray[i].charAt(0) + "." + " ";
			}
		}
		return nomeAbreviado;
	}
}
