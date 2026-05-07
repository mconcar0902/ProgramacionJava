package capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.modelo.Nivel;

public class ControladorNivel {

	public static List<Nivel> findAll (int id) {
		List<Nivel> list = new ArrayList<Nivel>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from nivel where idCentro = " + id);
			
			while (rs.next()) {
				Nivel n = new Nivel();
				n.setId(rs.getInt("id"));
				n.setDescripcion(rs.getString("descripcion"));
				n.setIdCentro(rs.getInt("idCentro"));
				list.add(n);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
