package br.com.cdb.companye.utils;

import java.util.Scanner;

import br.com.cdb.companye.service.clientes.ClienteService;

public class MenuCP {

	// Conta Corrente e Poupança.
	public static void ContaCP() {

		ClienteService clienteService = new ClienteService();

		Scanner input = new Scanner(System.in);
		String conf;

		do {

			System.out.println("Digite seu nome:");

			String nome = input.next();

			System.out.println("Dgite seu CPF: ");
			long cpf = input.nextLong();

			System.out.println("Dgite seu ano de nascimento: ");
			int nascimento = input.nextInt();

			System.out.println("Dgite seu CEP: ");
			long cep = input.nextLong();

			input.nextLine();

			System.out.println("Digite seu endereço:");
			String endereco = input.nextLine();

			System.out.println("Digite sua renda:");
			double renda = input.nextDouble();
			input.nextLine();
			if(renda <= 1500) {
				getInfo();
			}else if(renda >= 1500 && renda <= 3000) {
				getInfo();
			}else {
				getInfo();
			}

			System.out.println("Digite se email:");
			String email = input.nextLine();

			System.out.println("Digite sua senha:");
			String senha = input.nextLine();

			clienteService.addCliente(nome, cpf, nascimento, endereco, cep, senha, renda, email);

			clienteService.verCliente();

			System.out.println("\nConfirma seus dados?" + "(S/N):");
			conf = input.nextLine();
			
			

		} while (conf.equals("n") || conf.equals("n"));
		

		System.out.println("AGUARDE.... CADASTRANDO SUA CONTA..." + "\nCONTA CRIADA COM SUCESSO!!!");

		input.close();
		
		

	}
}
	
