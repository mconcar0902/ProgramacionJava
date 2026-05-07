package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	private static Connection conn = null;
	
	public static Connection getConnection() throws Exception {
		if (conn == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			conn = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/artistas?serverTimezone=UTC",
					"root", "1234");
		}
		return conn;
	}

}
