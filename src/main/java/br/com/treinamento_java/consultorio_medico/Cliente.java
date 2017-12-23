package br.com.treinamento_java.consultorio_medico;

public class Cliente {
	private String cpf;
	private String nome;
	private String fone;
	private String email;
	private String endereco;
	
	public Cliente(String cpf, String nome, String fone, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;		
		this.endereco = endereco;		
	}
	
	public Cliente(String cpf, String nome, String fone, String endereco, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.fone = fone;		
		this.endereco = endereco;
		this.email = email;		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getFone() {
		return fone;
	}

	public String getEndereco() {
		return endereco;
	}
	
	
	

}
