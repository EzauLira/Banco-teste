package br.com.cdb.companye.service.cartoes;

import br.com.cdb.companye.DAO.cartoes.CartaoDebitoDAO;
import br.com.cdb.companye.entity.cartoes.CartaoDebito;

public class CartaoDebitoService {

	CartaoDebitoDAO cartaoDebitoDao = new CartaoDebitoDAO();

	public void gerarNumero() {

		CartaoDebito numero = new CartaoDebito(null, null, 0, 0, false);
		System.out.println(numero.getNumero());

		cartaoDebitoDao.gerarNumero(numero);
	}

	public void gerarCvv() {

		CartaoDebito cvv = new CartaoDebito(null, null, 0, 0, false);
		System.out.println(cvv.getCvv());

		cartaoDebitoDao.gerarCvv(cvv);
	}

}
