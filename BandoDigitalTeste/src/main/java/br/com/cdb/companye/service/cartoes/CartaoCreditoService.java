package br.com.cdb.companye.service.cartoes;

import br.com.cdb.companye.DAO.cartoes.CartaoCreditoDAO;
import br.com.cdb.companye.entity.cartoes.CartaoCredito;

public class CartaoCreditoService {

	CartaoCreditoDAO cartaoCreditoDao = new CartaoCreditoDAO();

	public void gerarNumero() {

		CartaoCredito numero = new CartaoCredito(null, null, 0, 0, false, 0, 0, 0);
		System.out.println("Número do cartao: " + numero.getNumero());

		cartaoCreditoDao.gerarNumero(numero);
	}

	public void gerarCvv() {

		CartaoCredito cvv = new CartaoCredito(null, null, 0, 0, false, 0, 0, 0);
		System.out.println("Código de seguraça: "+ cvv.getCvv());

		cartaoCreditoDao.gerarCvv(cvv);
	}

	public void gerarLimite() {

		CartaoCredito limite = new CartaoCredito(null, null, 0, 0, false, 0, 0, 0);
		System.out.println("Limite de crédito: "+limite.getLimite());

		cartaoCreditoDao.gerarLimite(limite);
	}

	public void gerarLimite2() {

		CartaoCredito limite = new CartaoCredito(null, null, 0, 0, false, 0, 0, 0);
		System.out.println(limite.getLimite2());

		cartaoCreditoDao.gerarLimite2(limite);
	}

	public void gerarLimite3() {

		CartaoCredito limite = new CartaoCredito(null, null, 0, 0, false, 0, 0, 0);
		System.out.println(limite.getLimite3());

		cartaoCreditoDao.gerarLimite3(limite);
	}

}
