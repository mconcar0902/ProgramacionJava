package capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.modelo.CentroEducativo;

public class ControladorCentroEducativo {

	public static List<CentroEducativo> findAll () {
		List<CentroEducativo> list = new ArrayList<CentroEducativo>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from centroeducativo");
			
			while (rs.next()) {
				CentroEducativo c = new CentroEducativo();
				c.setId(rs.getInt("id"));
				c.setDescripcion(rs.getString("descripcion"));
				list.add(c);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
