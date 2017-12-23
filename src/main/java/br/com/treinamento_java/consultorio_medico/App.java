package br.com.treinamento_java.consultorio_medico;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException 
    {
    	ConfigDB confDB = new ConfigDB("jdbc:postgresql://localhost:5432/medical_green","postgres", "" );
		Medico medico = new Medico("122333", "DR. teste", "123", "(11)987651234", "teste@teste.com", "rua hum");
		TabelaMedico tabela_medico = new TabelaMedico(confDB);
    	
    	System.out.println("Conectado!");
    	tabela_medico.incluirRegistro(medico);
    	tabela_medico.con.close();
    	
    }
}
