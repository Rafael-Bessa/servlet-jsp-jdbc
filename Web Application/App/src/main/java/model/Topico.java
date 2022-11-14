package model;

public class Topico {

	private Integer id;
	private String titulo;
	private String corpo;
	private String login;
	
	public Topico(String titulo, String corpo, String login) {
		this.titulo = titulo;
		this.corpo = corpo;
		this.login = login;
		

	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCorpo() {
		return corpo;
	}
	
	
	public String getLogin() {
		return login;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

}
