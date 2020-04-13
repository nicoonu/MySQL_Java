package dataBase;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnect=true&useSSL=false";
	private static final String USER = "";
	private static final String PASSWORD = "";

	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador.");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		Connection connection = null;

		try {
			connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion: OK");
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}