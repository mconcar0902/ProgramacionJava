package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.modelo.Gimnasio;


public class ControladorGimnasio {
	
	public static List<Gimnasio> findAll () {
		List<Gimnasio> list = new ArrayList<Gimnasio>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from gimnasio");
			
			while (rs.next()) {
				Gimnasio g = new Gimnasio();
				g.setId(rs.getInt("id"));
				g.setDescripcion(rs.getString("descripcion"));
				list.add(g);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
