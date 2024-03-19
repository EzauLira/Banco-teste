package br.com.cdb.companye.DAO.cartoes;

import java.util.ArrayList;

import br.com.cdb.companye.DAO.ICartaoCreditoDAO;
import br.com.cdb.companye.entity.cartoes.CartaoCredito;


public class CartaoCreditoDAO implements ICartaoCreditoDAO {
	ArrayList<CartaoCredito> cartaoDebito = new ArrayList<>();

	public void gerarNumero(CartaoCredito numero) {
		cartaoDebito.add(numero);
	}
	
	public void gerarCvv(CartaoCredito cvv) {
		cartaoDebito.add(cvv);	
	}

}
