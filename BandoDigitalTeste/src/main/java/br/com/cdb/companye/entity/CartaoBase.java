package br.com.cdb.companye.entity;

import java.util.Random;

public class CartaoBase {
	
	Random random = new Random();
	
	protected String nome;
	protected String numero;
	protected int cvv, validade;
	protected boolean ativoDesativo;
	

	public CartaoBase(String nome, String numero, int cvv, int validade, boolean ativoDesativo) {
		this.nome = nome;
		this.numero = numero;
		this.cvv = cvv;
		this.validade = validade;
		this.ativoDesativo = ativoDesativo;
	}


	public boolean isAtivoDesativo() {
		return ativoDesativo;
	}

	public void setAtivoDesativo(boolean ativoDesativo) {
		this.ativoDesativo = ativoDesativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}
}
