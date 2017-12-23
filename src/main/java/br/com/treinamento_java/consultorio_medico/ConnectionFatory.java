package br.com.treinamento_java.consultorio_medico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ConnectionFatory {
	
	protected String url;
	protected String user;
	protected String password;
	protected Connection con;
	protected Statement stmt; 
	
	
	public ConnectionFatory(ConfigDB config) throws SQLException {
		this.url = config.getUrl();
		this.user = config.getUser();
		this.password = config.getPassword();
		this.con = this.getConection();
	}
	
	

	public Connection getConection() throws SQLException {		
		return DriverManager.getConnection(this.url, this.user, this.password);		
	}
	
	public ResultSet getQuery(String sql) throws SQLException {   
		this.stmt = con.createStatement();
    	return this.stmt.executeQuery(sql);  	
    			
	}
	
	

}
