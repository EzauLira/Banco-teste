
package br.com.cdb.companye.View;

import java.util.Scanner;

import br.com.cdb.companye.service.cartoes.CartaoCreditoService;
import br.com.cdb.companye.utils.Menu;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Menu.MenuInicio();
		
		CartaoCreditoService gerar = new CartaoCreditoService();
		
		System.out.println("Conta Criada com sucesso!!!" + "\nSeu Dados do cartão são: ");
		gerar.gerarNumero();
		gerar.gerarCvv();
		gerar.gerarLimite();
		
		


	}
}