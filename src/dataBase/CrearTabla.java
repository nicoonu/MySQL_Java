package dataBase;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CrearTabla {

	public static void crearTabla(Connection conexion) {
		try {

			String crearTabla = "CREATE TABLE IF NOT EXISTS ";
			String nombreTabla = "nombreTabla";
			String atributos = "()";

			PreparedStatement pStatement = (PreparedStatement) conexion
					.prepareStatement(crearTabla + nombreTabla + atributos);
			pStatement.executeUpdate();

			System.out.println("La tabla " + nombreTabla + " se ha creado correctamente");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}