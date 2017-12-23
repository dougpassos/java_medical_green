package br.com.treinamento_java.consultorio_medico;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TabelaMedico extends ConnectionFatory implements TableFatory {
	
	public Medico medico;

	public TabelaMedico(ConfigDB config) throws SQLException {
		super(config);
		// TODO Auto-generated constructor stub
	}

	public ResultSet incluirRegistro(Medico medico) throws SQLException {
	
		String sql = "INSERT INTO medicos(cpf, nome, crm, fone, email, endereco) VALUES ('" + medico.getCpf() + "','" + medico.getNome() + "','" + medico.getCrm() + "','" + medico.getFone() + "','" + medico.getEmail() + "','" + medico.getEndereco()+ "')"; 
		return super.getQuery(sql);
	}

	public ResultSet deletarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet alterarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultSet localizarRegistro() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
