package br.com.treinamento_java.consultorio_medico;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface TableFatory {
	
	ResultSet incluirRegistro(Medico medico) throws SQLException;
	
	ResultSet deletarRegistro();
	
	ResultSet alterarRegistro();
	
	ResultSet localizarRegistro();	

}
