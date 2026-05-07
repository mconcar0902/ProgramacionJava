package capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	private static Connection conn = null;
	
	public static Connection getConnection() throws Exception {
		if (conn == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			conn = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/nivelesymaterias?serverTimezone=UTC",
					"root", "1234");
		}
		return conn;
	}

}
