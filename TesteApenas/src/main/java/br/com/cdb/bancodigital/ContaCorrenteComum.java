package br.com.cdb.bancodigital;

import java.util.Random;

public class ContaCorrenteComum {
	Random random = new Random();

	private int agencia, conta, cvv;
	private double saldo;
	String cartaoCredito, cartaoDebito;

	
	public ContaCorrenteComum(int agencia, int conta, double saldo, String cartaoCredito, String cartaoDebito, int cvv) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cartaoCredito = cartaoCredito;
		this.cartaoDebito = cartaoDebito;
		this.cvv = cvv;
	}

	public int getAgencia() {
		int Gagencia = random.nextInt(9999);
		if(Gagencia <= 1000) {
			Gagencia += 1000;
		}
		agencia = Gagencia;
		return agencia;
	}

	public int getConta() {
		int Gconta = random.nextInt(9999-9);
		if(Gconta <= 1000) {
			Gconta += 1000;
		}
		conta = Gconta;
		return conta;
	}


	public int getCvv() {
		int Gcvv = random.nextInt(999);
		if(Gcvv <= 100) {
			Gcvv += 100;
		}
		cvv = Gcvv;
		return cvv;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCartaoCredito() {
		
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
		cartaoCredito = numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3];
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public String getCartaoDebito() {
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
		cartaoDebito = numeros[0] + " " + numeros[1] + " " + numeros[2] + " " + numeros[3];
		return cartaoDebito;
	}

	public void setCartaoDebito(String cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}
	
}
