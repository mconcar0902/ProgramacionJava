package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.modelo.Categoria;

public class ControladorCategoria {

	public static List<Categoria> findAll () {
		List<Categoria> list = new ArrayList<Categoria>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from categoria");
			
			while (rs.next()) {
				Categoria c = new Categoria();
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
