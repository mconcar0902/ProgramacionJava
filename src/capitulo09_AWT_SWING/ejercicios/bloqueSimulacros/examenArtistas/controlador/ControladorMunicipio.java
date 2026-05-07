package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Municipio;

public class ControladorMunicipio {

	public static List<Municipio> findAll () {
		List<Municipio> list = new ArrayList<Municipio>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from municipio");
			
			while (rs.next()) {
				Municipio m = new Municipio();
				m.setId(rs.getInt("id"));
				m.setNombre(rs.getString("nombre"));
				m.setIdProvicia(rs.getInt("idProvincia"));
				list.add(m);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
