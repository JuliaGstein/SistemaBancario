package br.com.modelo.banco;

import java.util.ArrayList;
import java.util.List;


public class Agencia {
	private String nome;
	private String numero;
	private List<Conta> conta = new ArrayList<>();
	
	public Agencia(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}
		
	
}

	

