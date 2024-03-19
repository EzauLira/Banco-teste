package br.com.cdb.companye.DAO;

import br.com.cdb.companye.entity.cartoes.CartaoCredito;

public interface ICartaoCreditoDAO {
	
	public void gerarNumero(CartaoCredito numero);
	public void gerarCvv(CartaoCredito cvv);
	

}
