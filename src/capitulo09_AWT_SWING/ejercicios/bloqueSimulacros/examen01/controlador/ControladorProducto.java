package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.modelo.Producto;

public class ControladorProducto {

	public static List<Producto> findAll (int id) {
		List<Producto> list = new ArrayList<Producto>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery("select * from producto where idCategoria = " + id);
			
			while (rs.next()) {
				Producto p = new Producto();
				p.setId(rs.getInt("id"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setCodigo(rs.getString("codigo"));
				p.setPerecedero(rs.getBoolean("perecedero"));
				p.setIdCategoria(rs.getInt("idCategoria"));
				p.setFechaCaducidad(rs.getDate("fechaCaducidad"));
				p.setUnidadesStock(rs.getInt("unidadesStock"));
				list.add(p);
			}
 		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public static int guardarProducto(Producto p) {
		try {
			Connection conn;
			conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String sql ;
			// Si es perecedero guarda la fecha sino guarda null
			if (p.isPerecedero()) {
				sql = ("update productossupermercado.producto set descripcion='" + p.getDescripcion() + "', "
						+ "codigo='" + p.getCodigo() + "', unidadesStock=" + p.getUnidadesStock() 
						+ ", perecedero= " + ((p.isPerecedero())? 1 : 0 ) 
						+ " , fechaCaducidad= '" + sdf.format(p.getFechaCaducidad()) + "' where id = " + p.getId());
			}
			else {
				sql = ("update productossupermercado.producto set descripcion='" + p.getDescripcion() + "', "
						+ "codigo='" + p.getCodigo() + "', unidadesStock=" + p.getUnidadesStock() 
						+ ", perecedero= " + ((p.isPerecedero())? 1 : 0 ) 
						+ " where id = " + p.getId());
			}
			
			System.out.println(sql);
			return s.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
