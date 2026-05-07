package capitulo09_AWT_SWING.ejercicios.bloqueEjemplos.ej02GestionMVCCliente.controlador;

import capitulo09_AWT_SWING.ejercicios.bloqueEjemplos.ej02GestionMVCCliente.modelo.Cliente;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorCliente {
	
	
	public static Cliente getPrimero() {
		return getCliente("select * from tutorialjavacoches.cliente order by id asc limit 1");
	}
	
	public static Cliente getUltimo() {
		return getCliente("select * from tutorialjavacoches.cliente order by id desc limit 1");
	}
	
	public static Cliente getSiguiente(int idActual) {
		return getCliente("select * from tutorialjavacoches.cliente where id > " + idActual + " order by id asc limit 1");
	}
	
	public static Cliente getAnterior(int idActual) {
		return getCliente("select * from tutorialjavacoches.cliente where id < " + idActual + " order by id desc limit 1");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Cliente getCliente(String sql) {
		Cliente c = null;
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(sql);
			
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellidos(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDni(rs.getString("dniNie"));
				java.sql.Date sqlDate = rs.getDate("fechaNac");
				java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
				c.setFechaNacimiento(utilDate);
				c.setActivo(rs.getBoolean("activo"));
			}
			
 		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	
	public static int guardarCliente(Cliente c) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			String sql = "update tutorialjavacoches.cliente set nombre='" + c.getNombre() + "', apellidos='"
					+ c.getApellidos() + "', dniNie='" + c.getDni() + "', localidad='" + c.getLocalidad() 
					+ "', fechaNac='" + sdf.format(c.getFechaNacimiento()) + "', activo=" + ((c.isActivo())? 1 : 0) +
					" where id=" + c.getId();
			
			System.out.println(sql);
			return s.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public static int crearCliente(Cliente c){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			String sql = "insert into tutorialjavacoches.cliente(id,nombre,apellidos,dniNie,localidad,fechaNac,activo)"
					+ " values(" + maximoId() + ", '" + c.getNombre() + "', '"
					+ c.getApellidos() + "', '" + c.getDni() + "', '" + c.getLocalidad() 
					+ "', '" + sdf.format(c.getFechaNacimiento()) + "', " + c.isActivo() +
					" )";
			
			System.out.println(sql);
			return s.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
		
	}
	
	
	public static int maximoId() {
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select max(id) from tutorialjavacoches.cliente");
			
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
	
	
	
}
