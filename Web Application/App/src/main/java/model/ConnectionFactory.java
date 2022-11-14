package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection recuperarConexao() {

		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/webapplication", "root", "Rafaelbessa1");
		} catch (SQLException e) {
			throw new RuntimeException("Algo deu errado na conexão com o banco de dados", e);
		}

	}

}
