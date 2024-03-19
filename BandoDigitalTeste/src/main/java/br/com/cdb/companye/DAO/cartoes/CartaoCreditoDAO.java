package br.com.cdb.companye.DAO.cartoes;

import java.util.ArrayList;

import br.com.cdb.companye.DAO.ICartaoCreditoDAO;
import br.com.cdb.companye.entity.cartoes.CartaoCredito;


public class CartaoCreditoDAO implements ICartaoCreditoDAO {
	ArrayList<CartaoCredito> cartaoCredito = new ArrayList<>();

	public void gerarNumero(CartaoCredito numero) {
		cartaoCredito.add(numero);
	}
	
	public void gerarCvv(CartaoCredito cvv) {
		cartaoCredito.add(cvv);	
	}
	
	public void gerarLimite(CartaoCredito limite) {
		cartaoCredito.add(limite);
	}
	
	public void gerarLimite2(CartaoCredito limite2) {
		cartaoCredito.add(limite2);
	}
	
	public void gerarLimite3(CartaoCredito limite3) {
		cartaoCredito.add(limite3);
	}
	
	

}
