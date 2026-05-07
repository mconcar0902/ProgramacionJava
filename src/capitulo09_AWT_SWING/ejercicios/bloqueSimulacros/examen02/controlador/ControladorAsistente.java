package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.modelo.Asistente;

public class ControladorAsistente {

	public static List<Asistente> buscarAsistintePorApellido(String apellidos) {
		List<Asistente> listaFiltrada = new ArrayList<Asistente>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from asistente where upper(apellidos) like upper('%" + apellidos +"%')");
			
			while (rs.next()) {
				Asistente asistente = new Asistente();
				asistente.setId(rs.getInt("id"));
				asistente.setIdGimnasio(rs.getInt("idGimnasio"));
				asistente.setDniNiePasaporte(rs.getString("dniNiePasaporte"));
				asistente.setIdLocalidad(rs.getInt("idLocalidad"));
				asistente.setActivo(rs.getBoolean("activo"));
				asistente.setNombre(rs.getString("nombre"));
				asistente.setApellidos(rs.getString("apellidos"));
				asistente.setFechaNacimiento(rs.getDate("fechaNacimiento"));
				asistente.setCuotaMensual(rs.getFloat("cuotaMensual"));
				listaFiltrada.add(asistente);
			}
			
			
			
 		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaFiltrada;
	}
	
	public static int guardarCambios(Asistente a) {
		
		try {
			Connection conn;
			conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String sql ;
			
			if (a.getFechaNacimiento() != null){
				sql = ("update asistente set dniNiePasaporte='" + a.getDniNiePasaporte() + "', "
						+ "idLocalidad=" + a.getIdLocalidad() + ", nombre='" + a.getNombre() 
						+ "', apellidos='" + a.getApellidos() + "', activo= " + ((a.isActivo())? 1 : 0 ) 
						+ " , fechaNacimiento= '" + sdf.format(a.getFechaNacimiento())
						+ "', cuotaMensual= " + a.getCuotaMensual()
						+ " where id = " + a.getId());
			}
			else {
				sql = ("update asistente set dniNiePasaporte='" + a.getDniNiePasaporte() + "', "
						+ "idLocalidad=" + a.getIdLocalidad() + ", nombre='" + a.getNombre() 
						+ "', apellidos='" + a.getApellidos() + "', activo= " + ((a.isActivo())? 1 : 0 ) 
						+ " , fechaNacimiento= NULL"
						+ ", cuotaMensual= " + a.getCuotaMensual()
						+ " where id = " + a.getId());
			}
			
			System.out.println(sql);
			return s.executeUpdate(sql);
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return 0;
	}
}
