package br.com.cdb.companye.service.cartoes;

import br.com.cdb.companye.DAO.cartoes.CartaoCreditoDAO;
import br.com.cdb.companye.entity.cartoes.CartaoCredito;

public class CartaoCreditoService {
	

	CartaoCreditoDAO cartaoCreditoDao = new CartaoCreditoDAO();

	public void gerarNumero() {

		CartaoCredito numero = new CartaoCredito(null, null, 0, 0, false);
		System.out.println(numero.getNumero());

		cartaoCreditoDao.gerarNumero(numero);
	}

	public void gerarCvv() {

		CartaoCredito cvv = new CartaoCredito(null, null, 0, 0, false);
		System.out.println(cvv.getCvv());

		cartaoCreditoDao.gerarCvv(cvv);
	}

}
