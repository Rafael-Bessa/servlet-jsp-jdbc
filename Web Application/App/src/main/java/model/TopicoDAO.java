package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TopicoDAO {

	public void inserir(Topico t) {

		String SQL = "INSERT INTO topico (titulo, corpo, login) VALUES (?, ?, ?);";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;
		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.setString(1, t.getTitulo());
			stm.setString(2, t.getCorpo());
			stm.setString(3, t.getLogin());

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
	
	public ArrayList<Topico> topicosCriados() {

		ArrayList<Topico> lista = new ArrayList<>();

		String SQL = "SELECT * FROM topico;";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;
		Topico t = null;

		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.execute();

			ResultSet rst = stm.getResultSet();

			while (rst.next()) {
				Integer id = rst.getInt(1);
				String titulo = rst.getString(2);
				String corpo = rst.getString(3);
				String login = rst.getString(4);
				
				t = new Topico(titulo, corpo, login);
				t.setId(id);
				lista.add(t);

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
	
	
	public Topico recuperar(String id) {

		String SQL = "SELECT * FROM topico WHERE id_topico = ?";

		ConnectionFactory connectionFactory = new ConnectionFactory();

		Connection con = null;
		Topico t = null;

		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.setString(1, id);
			stm.execute();

			ResultSet rst = stm.getResultSet();

			if (rst.next()) {
				String titulo = rst.getString(2);
				String corpo = rst.getString(3);
				String login  = rst.getString(4);
				
				t = new Topico(titulo, corpo, login);
				t.setId(Integer.parseInt(id));
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
		return t;
	}
	
	
	
	
	
	
	
}
