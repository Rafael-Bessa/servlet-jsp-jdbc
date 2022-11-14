package model;

public class Comentario {

	private Integer id;
	private String comentario;
	private String login;
	private String id_topico;

	public Comentario(String comentario, String login, String id_topico) {
		this.comentario = comentario;
		this.login = login;
		this.id_topico = id_topico;
		
	}

	public String getComentario() {
		return comentario;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getId_topico() {
		return id_topico;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
