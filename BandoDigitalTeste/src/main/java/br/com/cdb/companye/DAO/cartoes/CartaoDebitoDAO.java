package br.com.cdb.companye.DAO.cartoes;

import java.util.ArrayList;

import br.com.cdb.companye.DAO.iCartaoDebitoDAO;
import br.com.cdb.companye.entity.cartoes.CartaoDebito;

public class CartaoDebitoDAO implements iCartaoDebitoDAO {
	
	ArrayList<CartaoDebito> cartaoDebito = new ArrayList<>();

	public void gerarNumero(CartaoDebito numero) {
		cartaoDebito.add(numero);
	}
	
	public void gerarCvv(CartaoDebito cvv) {
		cartaoDebito.add(cvv);	
	}

}
