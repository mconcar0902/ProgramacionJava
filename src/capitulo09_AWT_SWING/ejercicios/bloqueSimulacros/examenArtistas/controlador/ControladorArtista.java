package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Artista;

public class ControladorArtista {
	
	public static List<Artista> encontrarArtista(String nombre) {
		List<Artista> list = new ArrayList<Artista>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			String sql = "SELECT a.* FROM artista a JOIN disciplina d ON a.idDisciplina = d.id "
					+ "WHERE a.nombre LIKE ? OR d.descripcion LIKE ?";
	        PreparedStatement ps = conn.prepareStatement(sql);
	        
	        ps.setString(1, "%" + nombre + "%");
	        ps.setString(2, "%" + nombre + "%");
	        
	        ResultSet rs = ps.executeQuery();
	        
			while (rs.next()) {
				Artista a = new Artista();
				a.setId(rs.getInt("id"));
				a.setNombre(rs.getString("nombre"));
				a.setIdDisciplina(rs.getInt("idDisciplina"));
				a.setIdMunicipio(rs.getInt("idMunicipio"));
				list.add(a);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public static int guardarCambios(Artista a) {
		int filasAfectadas = 0;
		
		String sql = "update artista set nombre= ?, idDisciplina= ? , idMunicipio = ? where id = ?";
		
		try {
			Connection conn = ConnectionManager.getConnection();
	        PreparedStatement ps = conn.prepareStatement(sql);
	        
	        ps.setString(1, a.getNombre());
	        ps.setInt(2, a.getIdDisciplina());
	        ps.setInt(3, a.getIdMunicipio());
	        ps.setInt(4, a.getId());
			
			System.out.println(sql);
			
			filasAfectadas = ps.executeUpdate();
	        ps.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return filasAfectadas;
	}
}
