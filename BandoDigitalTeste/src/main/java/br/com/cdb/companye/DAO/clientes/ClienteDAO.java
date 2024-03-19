package br.com.cdb.companye.DAO.clientes;

import java.util.ArrayList;

import br.com.cdb.companye.DAO.IClienteDAO;
import br.com.cdb.companye.entity.ClienteBase;

public class ClienteDAO implements IClienteDAO {
	
	ArrayList<ClienteBase> listaDeCliente = new ArrayList<>();
	
	public void addCliente(ClienteBase cliente) {
		listaDeCliente.add(cliente);
		
	}
	
	public void verCliente() {
		for ( ClienteBase c : listaDeCliente ) {
			System.out.println(c);
		}
	}
}
