package br.com.modelo.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;

	private String numero;

	private List<Agencia> agencias = new ArrayList<>();

	public Banco(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	public Agencia getAgencia(String numero) {
		for (Agencia agencia : agencias) {
			if (numero.equals(agencia.getNumero())) {
				return agencia;
			}
		}
		return null;
	}
}