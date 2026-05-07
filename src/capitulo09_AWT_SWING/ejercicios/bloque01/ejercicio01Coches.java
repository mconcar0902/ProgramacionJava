package capitulo09_AWT_SWING.ejercicios.bloque01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio01Coches extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfIdFabricante;
	private JTextField jtfNumBastidor;
	private JTextField jtfModelo;
	private JTextField jtfColor;
	
	private JButton btnPrimerRegistro;
    private JButton btnRegistroAnterior;
    private JButton btnSiguienteRegistro;
    private JButton btnUltimoRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio01Coches frame = new ejercicio01Coches();
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
	public ejercicio01Coches() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestion de coches");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(10, 0, 15, 0);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
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
		
		JLabel lblNewLabel_2 = new JLabel("Id Fabricante :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfIdFabricante = new JTextField();
		GridBagConstraints gbc_jtfIdFabricante = new GridBagConstraints();
		gbc_jtfIdFabricante.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdFabricante.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdFabricante.gridx = 1;
		gbc_jtfIdFabricante.gridy = 2;
		contentPane.add(jtfIdFabricante, gbc_jtfIdFabricante);
		jtfIdFabricante.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Num Bastidor :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfNumBastidor = new JTextField();
		GridBagConstraints gbc_jtfNumBastidor = new GridBagConstraints();
		gbc_jtfNumBastidor.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNumBastidor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNumBastidor.gridx = 1;
		gbc_jtfNumBastidor.gridy = 3;
		contentPane.add(jtfNumBastidor, gbc_jtfNumBastidor);
		jtfNumBastidor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Modelo :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfModelo = new JTextField();
		GridBagConstraints gbc_jtfModelo = new GridBagConstraints();
		gbc_jtfModelo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfModelo.gridx = 1;
		gbc_jtfModelo.gridy = 4;
		contentPane.add(jtfModelo, gbc_jtfModelo);
		jtfModelo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Color :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfColor = new JTextField();
		GridBagConstraints gbc_jtfColor = new GridBagConstraints();
		gbc_jtfColor.insets = new Insets(0, 0, 5, 0);
		gbc_jtfColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfColor.gridx = 1;
		gbc_jtfColor.gridy = 5;
		contentPane.add(jtfColor, gbc_jtfColor);
		jtfColor.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(10, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		contentPane.add(panel, gbc_panel);
		
		btnPrimerRegistro = new JButton("Cargar primer registro");
		btnPrimerRegistro.setToolTipText("Cargar primer registro");
		btnPrimerRegistro.addActionListener( e -> cargarPrimerRegistro());
		btnPrimerRegistro.setIcon(new ImageIcon(ejercicio01Coches.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/gotostart.png")));
		panel.add(btnPrimerRegistro);
		
		btnRegistroAnterior = new JButton("Cargar registro anterior");
		btnRegistroAnterior.setToolTipText("Cargar registro anterior");
		btnRegistroAnterior.addActionListener( e -> cargarRegistroAnterior());
		btnRegistroAnterior.setIcon(new ImageIcon(ejercicio01Coches.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/previous.png")));
		panel.add(btnRegistroAnterior);
		
		btnSiguienteRegistro = new JButton("Cargar siguiente registro");
		btnSiguienteRegistro.setToolTipText("Cargar siguiente registro");
		btnSiguienteRegistro.addActionListener(e -> cargarSiguienteRegistro());
		btnSiguienteRegistro.setIcon(new ImageIcon(ejercicio01Coches.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/next.png")));
		panel.add(btnSiguienteRegistro);
		
		btnUltimoRegistro = new JButton("Cargar último registro");
		btnUltimoRegistro.setToolTipText("Cargar último registro");
		btnUltimoRegistro.addActionListener( e -> cargarUltimoRegistro());
		btnUltimoRegistro.setIcon(new ImageIcon(ejercicio01Coches.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/gotoend.png")));
		panel.add(btnUltimoRegistro);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 7;
		contentPane.add(panel_1, gbc_panel_1);
		
		JButton btnNuevoRegistro = new JButton("Nuevo registro");
		btnNuevoRegistro.setToolTipText("Nuevo registro");
		btnNuevoRegistro.addActionListener( e -> nuevo());
		btnNuevoRegistro.setIcon(new ImageIcon(ejercicio01Coches.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/nuevo.png")));
		panel_1.add(btnNuevoRegistro);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setToolTipText("Guardar");
		btnGuardar.addActionListener( e -> guardar());
		btnGuardar.setIcon(new ImageIcon(ejercicio01Coches.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/guardar.png")));
		panel_1.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setToolTipText("Eliminar");
		btnEliminar.addActionListener( e -> eliminar());
		btnEliminar.setIcon(new ImageIcon(ejercicio01Coches.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/eliminar.png")));
		panel_1.add(btnEliminar);
		
		cargarPrimerRegistro();
	}
	
	/**
	 * 
	 */
	private void cargarPrimerRegistro() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		  
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from coche order by id asc limit 1");
		   
			if (rs.next()) { 
				jtfId.setText(rs.getString("id"));
				jtfIdFabricante.setText(rs.getString("idfabricante"));
				jtfNumBastidor.setText(rs.getString("bastidor"));
				jtfModelo.setText(rs.getString("modelo"));
				jtfColor.setText(rs.getString("color"));
			}
			
			rs.close();
			s.close();
			conexion.close();

			actualizarEstadoBotones();
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
	
	/**
	 * 
	 */
	private void cargarRegistroAnterior() {
		try {
			
			String id = jtfId.getText();
			int nextId = Integer.parseInt(id) - 1;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		  
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from coche where id = " + nextId);
		   
			if (rs.next()) { 
				jtfId.setText(rs.getString("id"));
				jtfIdFabricante.setText(rs.getString("idfabricante"));
				jtfNumBastidor.setText(rs.getString("bastidor"));
				jtfModelo.setText(rs.getString("modelo"));
				jtfColor.setText(rs.getString("color"));
			}
			
			rs.close();
			s.close();
			conexion.close();
			
			actualizarEstadoBotones();
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
	
	/**
	 * 
	 */
	private void cargarSiguienteRegistro() {
		try {
			
			String id = jtfId.getText();
			int nextId = Integer.parseInt(id) + 1;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		  
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from coche where id = " + nextId);
		   
			if (rs.next()) { 
				jtfId.setText(rs.getString("id"));
				jtfIdFabricante.setText(rs.getString("idfabricante"));
				jtfNumBastidor.setText(rs.getString("bastidor"));
				jtfModelo.setText(rs.getString("modelo"));
				jtfColor.setText(rs.getString("color"));
			}
			
			rs.close();
			s.close();
			conexion.close();
			
			actualizarEstadoBotones();
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
	
	/**
	 * 
	 */
	private void cargarUltimoRegistro() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		  
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from coche order by id desc limit 1");
		   
			if (rs.next()) { 
				jtfId.setText(rs.getString("id"));
				jtfIdFabricante.setText(rs.getString("idfabricante"));
				jtfNumBastidor.setText(rs.getString("bastidor"));
				jtfModelo.setText(rs.getString("modelo"));
				jtfColor.setText(rs.getString("color"));
			}
			
			rs.close();
			s.close();
			conexion.close();
			
			actualizarEstadoBotones();
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
	
	/**
	 * 
	 */
	private void nuevo() {
		jtfId.setText("");
		jtfIdFabricante.setText("");
		jtfNumBastidor.setText("");
		jtfModelo.setText("");
		jtfColor.setText("");
	}
	
	/**
	 * 
	 */
	private void guardar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = conexion.createStatement(); 
			
			int registrosAfectados;
			if (jtfId.getText().trim().equals("")) { 
				int siguienteId = getSiguienteIdValidoFabricante(conexion);
				registrosAfectados = s.executeUpdate(
						"insert into coche (id, idfabricante, bastidor, modelo, color) values "
						+ "(" + siguienteId + ", " + jtfIdFabricante.getText() + ", "
						+ "'" + jtfNumBastidor.getText() + "','"  + jtfModelo.getText() 
						+ "','"  + jtfColor.getText() + "')"
				);
				jtfId.setText("" + siguienteId);
				
			}
			else { 
				registrosAfectados = s.executeUpdate (
						"update coche set idfabricante=" + jtfIdFabricante.getText() + ", "
						+ "bastidor='" + jtfNumBastidor.getText() + "', "
						+ "modelo='" + jtfModelo.getText() + "', "
						+ "color='" + jtfColor.getText() + "' "
						+ "where id = " + jtfId.getText());				
			}
		   
			if (registrosAfectados == 1) { 
				JOptionPane.showMessageDialog(null, "Guardado correctamente");
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
	
	/**
	 * 
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	private int getSiguienteIdValidoFabricante(Connection conn) throws SQLException {
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId from coche");
	
		if (rs.next()) {
			return rs.getInt(1) + 1;
		}
		return 1;
	}
	
	/**
	 * 
	 */
	private void eliminar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = 
					(Connection) DriverManager.getConnection (
					"jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC",
					"root", "1234");
		   
			Statement s = conexion.createStatement(); 
			
			int registrosAfectados = 0;

			String posiblesRespuestas[] = {"Sí","No"};
			
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
		      registrosAfectados = s.executeUpdate(
		    		  "delete from coche where id = " + jtfId.getText()
		    		  );          
		    }

			
			if (registrosAfectados == 1) { 
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
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
		
		cargarRegistroAnterior();
	}

	/**
	 * 
	 */
	private void actualizarEstadoBotones() {
	    try {
	        if (jtfId.getText().trim().isEmpty()) {
	            return;
	        }
	        
	        int currentId = Integer.parseInt(jtfId.getText());
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conexion = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3330/tutorialjavacoches?serverTimezone=UTC", "root", "1234");
	        Statement s = conexion.createStatement(); 
	        
	        ResultSet rsMin = s.executeQuery("SELECT MIN(id) FROM coche");
	        if (rsMin.next()) {
	            int minId = rsMin.getInt(1);
	            boolean esElPrimero = (currentId == minId);
	            btnPrimerRegistro.setEnabled(!esElPrimero);
	            btnRegistroAnterior.setEnabled(!esElPrimero);
	        }
	        rsMin.close();
	        
	        ResultSet rsMax = s.executeQuery("SELECT MAX(id) FROM coche");
	        if (rsMax.next()) {
	            int maxId = rsMax.getInt(1);
	            boolean esElUltimo = (currentId == maxId);
	            btnUltimoRegistro.setEnabled(!esElUltimo);
	            btnSiguienteRegistro.setEnabled(!esElUltimo);
	        }
	        rsMax.close();
	        
	        s.close();
	        conexion.close();
	    } catch (Exception ex) {
	        System.out.println("Error al actualizar botones: " + ex.getMessage());
	    }
	}
}
