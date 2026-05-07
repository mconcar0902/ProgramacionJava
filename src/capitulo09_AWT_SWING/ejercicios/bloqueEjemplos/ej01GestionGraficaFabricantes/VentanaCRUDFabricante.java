package capitulo09_AWT_SWING.ejercicios.bloqueEjemplos.ej01GestionGraficaFabricantes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class VentanaCRUDFabricante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfCif;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCRUDFabricante frame = new VentanaCRUDFabricante();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCRUDFabricante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestion de Fabricante");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 20, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 2;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CIF :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfCif = new JTextField();
		GridBagConstraints gbc_jtfCif = new GridBagConstraints();
		gbc_jtfCif.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCif.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCif.gridx = 1;
		gbc_jtfCif.gridy = 3;
		contentPane.add(jtfCif, gbc_jtfCif);
		jtfCif.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		contentPane.add(panel, gbc_panel);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(e -> nuevo());
		btnNuevo.setIcon(new ImageIcon(VentanaCRUDFabricante.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/nuevo.png")));
		panel.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener( e -> guardar());
		btnGuardar.setIcon(new ImageIcon(VentanaCRUDFabricante.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/guardar.png")));
		panel.add(btnGuardar);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.addActionListener(e -> eliminar());
		btnNewButton_2.setIcon(new ImageIcon(VentanaCRUDFabricante.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/eliminar.png")));
		panel.add(btnNewButton_2);

		
		cargarPrimerRegistro();
	}

	
	private void nuevo() {
		jtfId.setText("");
		jtfNombre.setText("");
		jtfCif.setText("");
	}
	
	private void cargarPrimerRegistro() {
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante order by id asc limit 1");
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
				jtfId.setText(rs.getString("id"));
				jtfNombre.setText(rs.getString("nombre"));
				jtfCif.setText(rs.getString("cif"));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public void guardar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = (Statement) conexion.createStatement(); 
			
			int registroAfectados;
			
			if (jtfId.getText().equals("")) {  // insercion 
				int siguienteId = getSiguienteIdValidoConcesionario(conexion);
				registroAfectados = s.executeUpdate("insert into fabricante(id,nombre,cif) values ("
						+ siguienteId + ", '" + jtfNombre.getText() + "','" 
						+ jtfCif.getText() + "')");
				jtfId.setText("" + siguienteId);
			}
			else {  // update
				registroAfectados = s.executeUpdate("update fabricante set nombre='" + jtfNombre.getText() + 
						"', cif='" + jtfCif.getText() + "' where id= " + jtfId.getText());
				
			}
			
			if (registroAfectados == 1) {
				JOptionPane.showMessageDialog(null, "Guardado Correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
			
			
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	
	public void eliminar() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = (Statement) conexion.createStatement(); 
			
			int registroAfectados;
			
			String posiblesRespuestas[] = {"Sí","No"};
			// En esta opción se utiliza un showOptionDialog en el que personalizo el icono mostrado
			int opcionElegida = JOptionPane.showOptionDialog(
					null, 
					"¿Realmente desea eliminar?", 
					"Eliminar registro", 
			        JOptionPane.DEFAULT_OPTION, 
			        JOptionPane.WARNING_MESSAGE, 
			        null, 
			        posiblesRespuestas, 
			        posiblesRespuestas[1]);
		    if(opcionElegida == 0) {
		    	registroAfectados = s.executeUpdate(
		    		  "delete from fabricante where id = " + jtfId.getText()
		    		  );          
		    }
			
			
			if (jtfId.getText().equals("")) {  // insercion 
				int siguienteId = getSiguienteIdValidoConcesionario(conexion);
				registroAfectados = s.executeUpdate("insert into fabricante(id,nombre,cif) values ("
						+ siguienteId + ", '" + jtfNombre.getText() + "','" 
						+ jtfCif.getText() + "')");
				jtfId.setText("" + siguienteId);
			}
			else {  // update
				registroAfectados = s.executeUpdate("update fabricante set nombre='" + jtfNombre.getText() + 
						"', cif='" + jtfCif.getText() + "' where id= " + jtfId.getText());
				
			}
			
			if (registroAfectados == 1) {
				JOptionPane.showMessageDialog(null, "Guardado Correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
			}
			
			
			
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	
	private int getSiguienteIdValidoConcesionario(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId "
				+ "from fabricante");
	
		if (rs.next()) {
			return rs.getInt(1) + 1;
		}
		
		return 1;
	}
	
}
