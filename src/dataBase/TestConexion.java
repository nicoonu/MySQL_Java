package dataBase;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class TestConexion {
	public static void main(String[] args) throws SQLException {

		Connection conexion = Conexion.getConnection();
		BusquedaElementos.buscarElementos(conexion);
		CrearTabla.crearTabla(conexion);
		InsertarDatos.insertarDatos(conexion);
	}
}