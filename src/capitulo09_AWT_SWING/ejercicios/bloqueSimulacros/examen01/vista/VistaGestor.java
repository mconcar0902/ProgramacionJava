package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.controlador.ControladorCategoria;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.controlador.ControladorProducto;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.modelo.Categoria;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen01.modelo.Producto;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaGestor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfCodigo;
	private JTextField jtfNombre;
	private JTextField jtfFechaCaducidad;
	private JTextField jtfUnidadesStock;
	private JComboBox<Categoria> jcbCategoria = new JComboBox<Categoria>();
	private JComboBox<Producto> jcbProducto = new JComboBox<Producto>();
	private JCheckBox checkPerecedero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaGestor frame = new VistaGestor();
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
	public VistaGestor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestión de preoductos de supermercado");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 15, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoria :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		GridBagConstraints gbc_jcbCategoria = new GridBagConstraints();
		gbc_jcbCategoria.insets = new Insets(0, 0, 5, 5);
		gbc_jcbCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbCategoria.gridx = 1;
		gbc_jcbCategoria.gridy = 1;
		contentPane.add(jcbCategoria, gbc_jcbCategoria);
		
		JButton btnCargarProductos = new JButton("Cargar productos");
		btnCargarProductos.addActionListener(e -> cargarProductos());
		GridBagConstraints gbc_btnCargarProductos = new GridBagConstraints();
		gbc_btnCargarProductos.insets = new Insets(0, 0, 5, 0);
		gbc_btnCargarProductos.gridx = 2;
		gbc_btnCargarProductos.gridy = 1;
		contentPane.add(btnCargarProductos, gbc_btnCargarProductos);
		
		JLabel lblNewLabel_2 = new JLabel("Producto :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		
		GridBagConstraints gbc_jcbProducto = new GridBagConstraints();
		gbc_jcbProducto.insets = new Insets(0, 0, 5, 5);
		gbc_jcbProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProducto.gridx = 1;
		gbc_jcbProducto.gridy = 2;
		contentPane.add(jcbProducto, gbc_jcbProducto);
		
		JButton btnVerProductos = new JButton("Ver productos");
		btnVerProductos.addActionListener(e -> verProducto());
		GridBagConstraints gbc_btnVerProductos = new GridBagConstraints();
		gbc_btnVerProductos.insets = new Insets(0, 0, 5, 0);
		gbc_btnVerProductos.gridx = 2;
		gbc_btnVerProductos.gridy = 2;
		contentPane.add(btnVerProductos, gbc_btnVerProductos);
		
		JLabel lblNewLabel_3 = new JLabel("Datos de la materia:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.insets = new Insets(20, 0, 10, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Id :");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 4;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Codigo :");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfCodigo = new JTextField();
		GridBagConstraints gbc_jtfCodigo = new GridBagConstraints();
		gbc_jtfCodigo.gridwidth = 2;
		gbc_jtfCodigo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCodigo.gridx = 1;
		gbc_jtfCodigo.gridy = 5;
		contentPane.add(jtfCodigo, gbc_jtfCodigo);
		jtfCodigo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.gridwidth = 2;
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 6;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		checkPerecedero = new JCheckBox("");
		GridBagConstraints gbc_checkPerecedero = new GridBagConstraints();
		gbc_checkPerecedero.anchor = GridBagConstraints.EAST;
		gbc_checkPerecedero.insets = new Insets(0, 0, 5, 5);
		gbc_checkPerecedero.gridx = 0;
		gbc_checkPerecedero.gridy = 7;
		contentPane.add(checkPerecedero, gbc_checkPerecedero);
		
		JLabel lblNewLabel_7 = new JLabel("Perecedero");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 7;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fecha de caducidad :");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		contentPane.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfFechaCaducidad = new JTextField();
		GridBagConstraints gbc_jtfFechaCaducidad = new GridBagConstraints();
		gbc_jtfFechaCaducidad.gridwidth = 2;
		gbc_jtfFechaCaducidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaCaducidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaCaducidad.gridx = 1;
		gbc_jtfFechaCaducidad.gridy = 8;
		contentPane.add(jtfFechaCaducidad, gbc_jtfFechaCaducidad);
		jtfFechaCaducidad.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Unidades en stock :");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 9;
		contentPane.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		jtfUnidadesStock = new JTextField();
		GridBagConstraints gbc_jtfUnidadesStock = new GridBagConstraints();
		gbc_jtfUnidadesStock.gridwidth = 2;
		gbc_jtfUnidadesStock.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUnidadesStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUnidadesStock.gridx = 1;
		gbc_jtfUnidadesStock.gridy = 9;
		contentPane.add(jtfUnidadesStock, gbc_jtfUnidadesStock);
		jtfUnidadesStock.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(e -> guardar());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(15, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 10;
		contentPane.add(btnGuardar, gbc_btnGuardar);

		cargarCategoria();
	}

	private void cargarCategoria() {
		List<Categoria> list = ControladorCategoria.findAll();
		
		for (Categoria c : list) {
			jcbCategoria.addItem(c);
		}
	}
	
	private void cargarProductos() {
		Categoria c = (Categoria) jcbCategoria.getSelectedItem();
		List<Producto> list = ControladorProducto.findAll(c.getId());
		jcbProducto.removeAllItems();
		for (Producto p : list) {
			jcbProducto.addItem(p);
		}
	}
	
	private void verProducto() {
		Producto p = (Producto) jcbProducto.getSelectedItem();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = null;
		jtfId.setText(Integer.toString(p.getId()));
		jtfCodigo.setText(p.getCodigo());
		jtfNombre.setText(p.getDescripcion());
		checkPerecedero.setSelected(p.isPerecedero());
		
		if (p.isPerecedero() == true) {
			date = sdf.format(p.getFechaCaducidad());
		}
		
		jtfFechaCaducidad.setText(date);
		jtfUnidadesStock.setText(Integer.toString(p.getUnidadesStock()));
		
	}
	
	
	private boolean comprobarCodigo(String s) {
		if (s.length() < 3) {
			return false;
		}
		else {
			for (int i = 0; i < 3; i++) {
		        char letra = s.charAt(i);
		        
		        if (!Character.isUpperCase(letra)) {
		            return false; 
		        }
		    }
		}
		return true;
	}
	
	private boolean comprobarStock(int stock) {
		if (stock <= 0 ) {
			return false;
		}
		return true;
	}
	
	private void guardar() {
		Producto p = new Producto();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			p.setId(Integer.parseInt(jtfId.getText()));
			p.setDescripcion(jtfNombre.getText());
			p.setCodigo(jtfCodigo.getText());
			p.setPerecedero(checkPerecedero.isSelected());
			p.setUnidadesStock(Integer.parseInt(jtfUnidadesStock.getText()));
			
			// Si es perecedero guarda la fecha sino guarda null
			if (checkPerecedero.isSelected()) {
				p.setFechaCaducidad(sdf.parse(jtfFechaCaducidad.getText()));
			} else {
				p.setFechaCaducidad(null);
			}
			
			
			if (comprobarCodigo(p.getCodigo())) {
				if (comprobarStock(p.getUnidadesStock())) {
					
					int resultado = ControladorProducto.guardarProducto(p);
					if (resultado != 0) {
					 	JOptionPane.showMessageDialog(null, "Producto guardada con éxito.");
		            } else {
		            	JOptionPane.showMessageDialog(null, "Error: No se actualizó la base de datos.");
		            }
				}
				else {
					JOptionPane.showMessageDialog(null, "Error: El stock es inferior a 0.");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Error: El codigo no empieza con 3 letras mayusculas.");
			}
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
