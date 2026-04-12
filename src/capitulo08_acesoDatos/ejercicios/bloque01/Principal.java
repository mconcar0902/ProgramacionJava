package capitulo08_acesoDatos.ejercicios.bloque01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		
		do {
			menu();
			opc = sc.nextInt();
			
			switch (opc) {
			case 1:
				registosDeLaTabla();
				break;
			case 2:
				crearFabricante();
				break;
			case 3:
				modificarFabricante();
				break;
			case 4:
				eliminarFabricante();
				break;
			case 0:
				System.out.println("Saliendo del programa.");		
				break;
			default:
				System.out.println("Esa opcion no es posible.");
				break;
			}
		} while (opc != 0);
		
	}

	/**
	 * 
	 */
	public static void menu() {
		System.out.print("\nMenu"
				+ "\n----"
				+ "\n1 - Listar todos los registros de la tabla."
				+ "\n2 - Crear un nuevo Fabricante."
				+ "\n3 - Modificar un Fabricante."
				+ "\n4 - Eliminar un Fabricante."
				+ "\n0 - Salir del programa."
				+ "\nElije una opcion: ");
	}
	
	
	/**
	 * 
	 */
	public static void registosDeLaTabla() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
			
			Statement s = (Statement) conexion.createStatement();
			
			ResultSet rs = s.executeQuery("select * from fabricante");
			
			System.out.println("\nId\tCif\t\tNombre"
						   + "\n----------------------------------");
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + "\t" + rs.getString ("cif")+ 
						"\t" + rs.getString("nombre")); 
			}
			
			rs.close();
			s.close();
			conexion.close();
			
		}catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	public static void crearFabricante() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nCrear un nuevo fabricante."
				+ "\n----------------------"
				+ "\nEscribe el cif del fabricante: ");
		String cif = sc.nextLine();
		System.out.print("\nEscribe el nombre del fabricante: ");
		String nombre = sc.nextLine();
		int id = numFabricantes() + 1;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
			
			Statement s = (Statement) conexion.createStatement();
			
			int nuevaFila = s.executeUpdate("insert into tutorialjavacoches.fabricante(id,cif,nombre)"
					+ " values(" + id + ",'" + cif + "','"+ nombre + "')");
			
			s.close();
			conexion.close();
			
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 */
	public static void modificarFabricante() {
		Scanner sc = new Scanner(System.in);
		registosDeLaTabla();
		
		System.out.print("\nModificar un fabricante."
				+ "\n------------------------"
				+ "\nEscribe el id del fabricante: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("\nEscribe el cif del fabricante: ");
		String cif = sc.nextLine();
		
		System.out.print("\nEscribe el nombre del fabricante: ");
		String nombre = sc.nextLine();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
			
			Statement s = (Statement) conexion.createStatement();
			
			int modificarFila = s.executeUpdate("UPDATE tutorialjavacoches.fabricante SET cif = '" + cif + 
					"', nombre = '" + nombre + "' WHERE id = " + id + ";");
			
			s.close();
			conexion.close();
			
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 */
	public static void eliminarFabricante() {
		Scanner sc = new Scanner(System.in);
		registosDeLaTabla();
		
		System.out.print("\nElimina un fabricante."
				+ "\n----------------------"
				+ "\nEscribe el id del fabricante: ");
		int id = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
			
			Statement s = (Statement) conexion.createStatement();
			
			int eliminarFila = s.executeUpdate("delete from tutorialjavacoches.fabricante where fabricante.id = " + id + ";");
			 
			s.close();
			conexion.close();
			
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static int numFabricantes() {
		int cont = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
			
			Statement s = (Statement) conexion.createStatement();
			
			ResultSet rs = s.executeQuery("select * from fabricante");

			while (rs.next()) {
				cont++;
			}
			
			rs.close();
			s.close();
			conexion.close();
			
		}catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	
		return cont;
	}
}


