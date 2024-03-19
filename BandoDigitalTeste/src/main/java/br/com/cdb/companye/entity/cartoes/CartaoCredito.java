package br.com.cdb.companye.entity.cartoes;

import java.util.Random;

import br.com.cdb.companye.entity.CartaoBase;

public class CartaoCredito extends CartaoBase {
	
	private double limite;
	private double limite2;
	private double limite3;
	
	Random random = new Random();

	public CartaoCredito(String nome, String numero, int cvv, int validade, boolean ativoDesativo, double limite, double limite2, double limite3) {
		super(nome, numero, cvv, validade, ativoDesativo);
		this.limite = 1500;
		this.limite2 = 3000;
		this.limite3 = 5000;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public double getLimite2() {
		return limite2;
	}
	
	public double getLimite3() {
		return limite3;
	}
	
	@Override
	public String getNumero() {
		int[] numeros = new int[4];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(10000);
			while (numeros[i] < 1000) {
				numeros[i] = random.nextInt(10000);
			}

			if (numeros[i] <= 1000) {
				numeros[i] += 9999;
			}
		}
		numero = numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3];
		return numero;
	}

	@Override
	public int getCvv() {
		int gerarCvv = random.nextInt(999);
		if (gerarCvv < 100) {
			gerarCvv += 100;
		}
		cvv = gerarCvv;
		return cvv;
	}

}
