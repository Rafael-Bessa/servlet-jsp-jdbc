package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
	
	public void inserir(Usuario u) {

		String SQL = "INSERT INTO usuario (login, email, nome, senha, pontos) VALUES (?, ?, ?, ?, ?);";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;
		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.setString(1, u.getLogin());
			stm.setString(2, u.getEmail());
			stm.setString(3, u.getNome());
			stm.setString(4, u.getSenha());
			stm.setInt(5, u.getPontos());

			stm.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public Usuario recuperar(String login) {

		String SQL = "SELECT * FROM usuario WHERE login = ?";

		ConnectionFactory connectionFactory = new ConnectionFactory();

		Connection con = null;
		Usuario u = null;

		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.setString(1, login);
			stm.execute();

			ResultSet rst = stm.getResultSet();

			if (rst.next()) {
				String log = rst.getString(1);
				String email = rst.getString(2);
				String nome = rst.getString(3);
				String senha = rst.getString(4);
				Integer pontos = rst.getInt(5);

				u = new Usuario(log, email, nome, senha, pontos);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return u;
	}

	public void adicionarPontos(String login, int pontos) {

		String SQL = "UPDATE usuario SET pontos = pontos + ? WHERE login = ?;";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;

		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.setInt(1, pontos);
			stm.setString(2, login);
			stm.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		}

		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<Usuario> ranking() {

		List<Usuario> lista = new ArrayList<>();

		String SQL = "SELECT * FROM usuario ORDER BY pontos DESC;";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;
		Usuario u = null;

		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.execute();

			ResultSet rst = stm.getResultSet();

			while (rst.next()) {
				String log = rst.getString(1);
				String email = rst.getString(2);
				String nome = rst.getString(3);
				String senha = rst.getString(4);
				Integer pontos = rst.getInt(5);

				u = new Usuario(log, email, nome, senha, pontos);
				lista.add(u);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}

	public String autentificacao(String login, String senha) {

		String SQL = "SELECT nome FROM usuario WHERE login = ? AND senha = ?;";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;

		con = connectionFactory.recuperarConexao();

		PreparedStatement stm;
		try {
			stm = con.prepareStatement(SQL);

			stm.setString(1, login);
			stm.setString(2, senha);
			stm.execute();

			ResultSet rst = stm.getResultSet();

			if (rst.next()) {
				return rst.getString("nome");
			} else {
				return "TelaloginAposErro.html";
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;

	}

}
