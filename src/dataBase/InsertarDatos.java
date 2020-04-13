package dataBase;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class InsertarDatos {

	public static void insertarDatos(Connection connection) {
		try {

			String datos = "INSERT INTO tableName(atributos) VALUES('" + "valor1" + "', '" + "valor2" + "', '"
					+ "valorN" + "')";

			PreparedStatement pStatement = (PreparedStatement) connection.prepareStatement(datos);
			pStatement.executeUpdate();

			System.out.println("Los datos han sido insertados correctamente");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}