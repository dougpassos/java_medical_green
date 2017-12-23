package br.com.treinamento_java.consultorio_medico;

public class ConfigDB {
	protected String url;
	protected String user;
	protected String password;
	
	public ConfigDB(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	

}
