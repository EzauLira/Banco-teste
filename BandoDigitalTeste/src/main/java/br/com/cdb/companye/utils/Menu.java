package br.com.cdb.companye.utils;

import java.util.Scanner;



public class Menu {

	public static void MenuInicio() {

		Scanner input = new Scanner(System.in);

		System.out.println(
				"***AMAN BANK***\n" + "Seja muito bem-vndo!!!\n" + "Escolha uma opção para começar a usar seu banco:");
		System.out.println("1 - Cadastro;\n" + "2 - login");

		int menu = input.nextInt();

		if (menu == 1) {
			EscolhaConta();
		} else if (menu == 2) {
//			Login();
		}
		input.close();
	}
	
	//Escolha do tipo de conta
	public static void EscolhaConta() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha seu tipo de conta:\n" + "1 - Conta Corrente e poupança;\n" 
					      + "2 - Conta Corrente;\n" + "3 - Conta poupança");
		
		int escolha = input.nextInt();
		
		if (escolha == 1) {
			MenuCP.ContaCP();
		}else if(escolha == 2) {
			System.out.println("escolheu conta corrente;");
		}else {
			System.out.println("Escolheu conta poupança;");
		}
		input.close();
	}

	
//	//Login
//	public static void Login() {
//
//		ClienteService clienteService = new ClienteService();
//
//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Digite seu nome:");
//		String nome = input.next();
//	
//
//		System.out.println("Digite uma senha: ");
//		int senha = input.nextInt();
//		
//		
//		input.close();
//	}

}