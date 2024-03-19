package br.com.cdb.companye.service.clientes;

import br.com.cdb.companye.DAO.clientes.ClienteDAO;
import br.com.cdb.companye.entity.ClienteBase;

public class ClienteService {
	
	ClienteDAO clienteDao = new ClienteDAO();
	
	public void addCliente(String nome, long cpf, int nascimento, String endereco, long cep, String senha , double renda, String email) {
		 	
		ClienteBase cliente = new ClienteBase(nome, cpf,nascimento, endereco, cep, senha, renda, email);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setCep(cep);
		cliente.setEndereco(endereco);
		cliente.setNascimento(nascimento);
		cliente.setRenda(renda);
		cliente.setEmail(email);
		cliente.setSenha(senha);
		
		clienteDao.addCliente(cliente);
	}
	
	public void verCliente() {
		
		clienteDao.verCliente();
	}
}
