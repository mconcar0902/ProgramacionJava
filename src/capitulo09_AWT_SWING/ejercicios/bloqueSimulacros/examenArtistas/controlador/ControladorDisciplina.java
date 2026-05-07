package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Disciplina;


public class ControladorDisciplina {
	
	public static List<Disciplina> findAll () {
		List<Disciplina> list = new ArrayList<Disciplina>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from disciplina");
			
			while (rs.next()) {
				Disciplina d = new Disciplina();
				d.setId(rs.getInt("id"));
				d.setDescripcion(rs.getString("descripcion"));
				list.add(d);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
