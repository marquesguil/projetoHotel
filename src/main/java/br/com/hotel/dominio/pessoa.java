/**
 * 
 */
package br.com.hotel.dominio;

/**
 * @author guilherme.de.marques
 *
 */
public class pessoa {
	private int id;
	private String nome, cpf, mail;
	
	public pessoa() {
		
	}

	public pessoa(int id, String nome, String cpf, String mail) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
