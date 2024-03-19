package br.com.cdb.companye.entity;


public class ClienteBase {
	
	private String nome, endereco, email, senha;
	private long cpf, cep;
	private int nascimento;
	private double renda;
	
	public ClienteBase(String nome, long cpf, int nascimento , String endereco, long cep, String senha , double renda, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.cep = cep;
		this.endereco = endereco;
		this.senha = senha;
		this.renda = renda;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return "\nNome: "+nome+"\nCPF: "+ cpf +"\nNascimento: "+ nascimento +"\nEndereço: "+ endereco +"\nCEP: "+ cep 
				+"\nE-mail: " + email + "\nSenha: "+senha +"\nRenda: " + renda;
	}
}
