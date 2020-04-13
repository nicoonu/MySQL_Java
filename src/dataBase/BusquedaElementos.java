package dataBase;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class BusquedaElementos {

	static Statement statement = null;
	static ResultSet resultado = null;

	public static void buscarElementos(Connection connection) throws SQLException {

		try {

			statement = (Statement) connection.createStatement();
			String consulta = "SELECT * FROM tableName";
			resultado = statement.executeQuery(consulta);

			while (resultado.next()) {
				int atr1 = resultado.getInt("atributo1");
				String atr2 = resultado.getString("atributo2");

				System.out.println("atributo1: " + atr1 + "\n" + "atributo2: " + atr2 + "\n");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}