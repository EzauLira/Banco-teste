package br.com.cdb.companye.entity.cartoes;

import java.util.Random;

import br.com.cdb.companye.entity.CartaoBase;

public class CartaoDebito extends CartaoBase {

	Random random = new Random();

	public CartaoDebito(String nome, String numero, int cvc, int validade, boolean ativoDesativo) {
		super(nome, numero, cvc, validade, ativoDesativo);
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
