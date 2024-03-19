package br.com.cdb.companye.entity.clientes;

import br.com.cdb.companye.entity.ClienteBase;

public class Cliente extends ClienteBase {

	public Cliente(String nome, String endereco , String senha , long cpf, long cep, int nascimento , double renda, String email) {
		super(nome, cpf, nascimento, endereco, cep, senha , renda, email);
	}
	
}
