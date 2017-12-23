package br.com.treinamento_java.consultorio_medico;

public class Medico {
	private String cpf;
	private String nome;
	private String crm;
	private String fone;
	private String email;
	private String endereco;
	
	public Medico(String cpf, String nome, String crm, String fone) {
		this.cpf = cpf;
		this.nome = nome;
		this.crm = crm;
		this.fone = fone;
	}
	
	public Medico(String cpf, String nome, String crm, String fone, String email, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.crm = crm;
		this.fone = fone;
		this.email = email;
		this.endereco = endereco;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCrm() {
		return crm;
	}

	public String getFone() {
		return fone;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}
	
	
	
}
