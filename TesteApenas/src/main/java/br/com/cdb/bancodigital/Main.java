package br.com.cdb.bancodigital;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ContaCorrenteComum gerar = new ContaCorrenteComum(0, 0, 0, null, null, 0);
		
		System.out.println("Agência: "+gerar.getAgencia() + " conta: " + gerar.getConta());
		System.out.println("Saldo: "+gerar.getSaldo());
		System.out.println("Número do cartão: "+gerar.getCartaoCredito());
		System.out.println("Código de segutança: "+gerar.getCvv());
		
		

	}
}
