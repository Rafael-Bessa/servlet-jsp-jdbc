package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComentarioDAO {
	
	
	public void inserir(Comentario c) {

		String SQL = "INSERT INTO comentario (comentario, login, id_topico) VALUES (?, ?, ?);";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;
		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.setString(1, c.getComentario());
			stm.setString(2, c.getLogin());
			stm.setString(3, c.getId_topico());

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
	
	public ArrayList<Comentario> ComentariosCriados(String idTopico) {

		ArrayList<Comentario> lista = new ArrayList<>();

		String SQL = "SELECT * FROM comentario WHERE id_topico = ?;";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = null;
		Comentario c = null;

		try {
			con = connectionFactory.recuperarConexao();

			PreparedStatement stm = con.prepareStatement(SQL);
			stm.setString(1, idTopico);
			stm.execute();

			ResultSet rst = stm.getResultSet();

			while (rst.next()) {
				Integer id = rst.getInt(1);
				String comentario = rst.getString(2);
				String login = rst.getString(3);
				String id_topico = rst.getString(4);
				
				c = new Comentario(comentario, login, id_topico);
				c.setId(id);
				lista.add(c);

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
	

}
