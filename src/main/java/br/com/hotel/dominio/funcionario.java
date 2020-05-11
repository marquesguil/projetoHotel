/**
 * 
 */
package br.com.hotel.dominio;

/**
 * @author guilherme.de.marques
 *
 */
public class funcionario extends pessoa {
	private String user, senha, nivelAcesso;
	/**
	 * 
	 */
	public funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public funcionario(String user, String senha, String nivelAcesso) {
		super();
		this.user = user;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

}
