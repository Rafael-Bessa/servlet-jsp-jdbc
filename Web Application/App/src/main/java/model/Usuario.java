package model;


public class Usuario {

	private String login;
	private String email;
	private String nome;
	private String senha;
	private Integer pontos;

	public Usuario(String login, String email, String nome, String senha, Integer pontos) {
		this.login = login;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.pontos = pontos;
	}

	public String getLogin() {
		return login;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public Integer getPontos() {
		return pontos;
	}

	@Override
	public String toString() {
		return "login=" + login + ", email=" + email + ", nome=" + nome + ", senha=" + senha + ", pontos="
				+ pontos;
	}

}
