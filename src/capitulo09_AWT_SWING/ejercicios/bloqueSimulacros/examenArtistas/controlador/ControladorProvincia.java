package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Provincia;

public class ControladorProvincia {

	
	public static List<Provincia> findAll () {
		List<Provincia> list = new ArrayList<Provincia>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from provincia");
			
			while (rs.next()) {
				Provincia d = new Provincia();
				d.setId(rs.getInt("id"));
				d.setNombre(rs.getString("provincia"));
				list.add(d);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
