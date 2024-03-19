package br.com.cdb.companye.DAO;

import br.com.cdb.companye.entity.cartoes.CartaoDebito;

public interface iCartaoDebitoDAO {
	
	public  void gerarNumero(CartaoDebito numero);
	public  void gerarCvv(CartaoDebito cvv);
	

}
