package capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.modelo.Materia;

public class ControladorMateria {

	public static List<Materia> findAll (int id) {
		List<Materia> list = new ArrayList<Materia>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from materia where idNivel = " + id);
			
			while (rs.next()) {
				Materia m = new Materia();
				m.setId(rs.getInt("id"));
				m.setNombre(rs.getString("nombre"));
				m.setIdNivel(rs.getInt("idNivel"));
				m.setCodigo(rs.getString("codigo"));
				m.setUrlClassroom(rs.getString("urlClassroom"));
				m.setAdmiteMatricula(rs.getBoolean("admiteMatricula"));
				java.util.Date date = rs.getDate("fechaInicio");
				m.setFechaInicio(date);
				list.add(m);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public static int guardarMateria(Materia m) {
		try {
			Connection conn;
			conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String sql = ("update nivelesymaterias.materia set nombre='" + m.getNombre() + "', "
					+ "codigo='" + m.getCodigo() + "', urlClassroom='" + m.getUrlClassroom() 
					+ "', admiteMatricula= " + ((m.isAdmiteMatricula())? 1 : 0 ) 
					+ " , fechaInicio= '" + sdf.format(m.getFechaInicio()) + "' where id = " + m.getId());
			
			System.out.println(sql);
			return s.executeUpdate(sql);		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
