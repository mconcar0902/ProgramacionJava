package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.modelo.Localidad;


public class ControladorLocalidad {

	public static List<Localidad> findAll () {
		List<Localidad> list = new ArrayList<Localidad>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from localidad");
			
			while (rs.next()) {
				Localidad l = new Localidad();
				l.setId(rs.getInt("id"));
				l.setLocalidad(rs.getString("localidad"));
				list.add(l);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
