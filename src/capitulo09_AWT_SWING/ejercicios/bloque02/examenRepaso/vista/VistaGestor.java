package capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador.ConnectionManager;
import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador.ControladorCentroEducativo;
import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador.ControladorMateria;
import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.controlador.ControladorNivel;
import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.modelo.CentroEducativo;
import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.modelo.Materia;
import capitulo09_AWT_SWING.ejercicios.bloque02.examenRepaso.modelo.Nivel;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class VistaGestor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfCodigo;
	private JTextField jtfUrl;
	private JTextField jtfFechaIni;
	private JCheckBox checkAdimteMatricula;
	private JComboBox<CentroEducativo> jcbCentro = new JComboBox<CentroEducativo>();
	private JComboBox<Nivel> jcbNivel = new JComboBox<Nivel>();
	private JComboBox<Materia> jcbMateria = new JComboBox<Materia>();

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
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestión de Matrerias");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 15, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Centro :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		GridBagConstraints gbc_jcbCentro = new GridBagConstraints();
		gbc_jcbCentro.gridwidth = 2;
		gbc_jcbCentro.insets = new Insets(0, 0, 5, 5);
		gbc_jcbCentro.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbCentro.gridx = 1;
		gbc_jcbCentro.gridy = 1;
		jcbCentro.addActionListener(e -> cargarNiveles());
		contentPane.add(jcbCentro, gbc_jcbCentro);
		
		JLabel lblNewLabel_2 = new JLabel("Nivel :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		
		GridBagConstraints gbc_jcbNivel = new GridBagConstraints();
		gbc_jcbNivel.gridwidth = 2;
		gbc_jcbNivel.insets = new Insets(0, 0, 5, 5);
		gbc_jcbNivel.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbNivel.gridx = 1;
		gbc_jcbNivel.gridy = 2;
		jcbNivel.addActionListener(e -> cargarMaterias());
		contentPane.add(jcbNivel, gbc_jcbNivel);
		
		JLabel lblNewLabel_3 = new JLabel("Materia :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		
		GridBagConstraints gbc_jcbMateria = new GridBagConstraints();
		gbc_jcbMateria.gridwidth = 2;
		gbc_jcbMateria.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMateria.gridx = 1;
		gbc_jcbMateria.gridy = 3;
		jcbMateria.addActionListener(e -> verMateria());
		contentPane.add(jcbMateria, gbc_jcbMateria);
		
		JLabel lblNewLabel_4 = new JLabel("Datos de la materia");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 3;
		gbc_lblNewLabel_4.insets = new Insets(10, 0, 10, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Id :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfId = new JTextField();
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 5;
		contentPane.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
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
		
		JLabel lblNewLabel_7 = new JLabel("Código :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jtfCodigo = new JTextField();
		GridBagConstraints gbc_jtfCodigo = new GridBagConstraints();
		gbc_jtfCodigo.gridwidth = 2;
		gbc_jtfCodigo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCodigo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCodigo.gridx = 1;
		gbc_jtfCodigo.gridy = 7;
		contentPane.add(jtfCodigo, gbc_jtfCodigo);
		jtfCodigo.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("URL Classroom :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		contentPane.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfUrl = new JTextField();
		GridBagConstraints gbc_jtfUrl = new GridBagConstraints();
		gbc_jtfUrl.gridwidth = 2;
		gbc_jtfUrl.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUrl.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUrl.gridx = 1;
		gbc_jtfUrl.gridy = 8;
		contentPane.add(jtfUrl, gbc_jtfUrl);
		jtfUrl.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Fecha inicio :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 9;
		contentPane.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		jtfFechaIni = new JTextField();
		GridBagConstraints gbc_jtfFechaIni = new GridBagConstraints();
		gbc_jtfFechaIni.gridwidth = 2;
		gbc_jtfFechaIni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaIni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaIni.gridx = 1;
		gbc_jtfFechaIni.gridy = 9;
		contentPane.add(jtfFechaIni, gbc_jtfFechaIni);
		jtfFechaIni.setColumns(10);
		
		checkAdimteMatricula = new JCheckBox("");
		GridBagConstraints gbc_checkAdimteMatricula = new GridBagConstraints();
		gbc_checkAdimteMatricula.anchor = GridBagConstraints.EAST;
		gbc_checkAdimteMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_checkAdimteMatricula.gridx = 0;
		gbc_checkAdimteMatricula.gridy = 10;
		contentPane.add(checkAdimteMatricula, gbc_checkAdimteMatricula);
		
		JLabel lblNewLabel_10 = new JLabel("Admite matricula");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 10;
		contentPane.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(e -> guardar());
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 10));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 11;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		cargarCentrosEducativos();
	}

	
	private void cargarCentrosEducativos() {
		List<CentroEducativo> list = ControladorCentroEducativo.findAll();
		
		for (CentroEducativo c : list) {
			jcbCentro.addItem(c);
		}
	}
	
	
	private void cargarNiveles() {
		CentroEducativo c = (CentroEducativo) jcbCentro.getSelectedItem();
		System.out.println("centro educativo seleccionado : " + c.getId());
		
		List<Nivel> list = ControladorNivel.findAll(c.getId());
		jcbNivel.removeAllItems();
		
		for (Nivel n : list) {
			jcbNivel.addItem(n);
		}
	}
	
	private void cargarMaterias() {
		Nivel n = (Nivel) jcbNivel.getSelectedItem();
		System.out.println("Nivel seleccionado : " + n.getId());
		jcbMateria.removeAllItems();
		List<Materia> list = ControladorMateria.findAll(n.getId());
		
		for (Materia m : list) {
			jcbMateria.addItem(m);
		}
	}
	
	private void verMateria() {
		Materia m = (Materia) jcbMateria.getSelectedItem();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		jtfId.setText(Integer.toString(m.getId()));
		jtfNombre.setText(m.getNombre());
		jtfCodigo.setText(m.getCodigo());
		jtfUrl.setText(m.getUrlClassroom());
		jtfFechaIni.setText(sdf.format(m.getFechaInicio()));
		checkAdimteMatricula.setSelected(m.isAdmiteMatricula());
	}
	
	private int comprobarCodigo(String s) {
		if (s.length() < 3) {
			System.out.println("Condigo con menos de 3 caracteres.");
			return 1;
		}
		return 0;
	}
	

	private void guardar() {
		Materia m = new Materia();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			m.setId(Integer.parseInt(jtfId.getText()));
			m.setNombre(jtfNombre.getText());
			m.setCodigo(jtfCodigo.getText());
			m.setUrlClassroom(jtfUrl.getText());
			m.setAdmiteMatricula(checkAdimteMatricula.isSelected());
			m.setFechaInicio(sdf.parse(jtfFechaIni.getText()));
			
			if (comprobarCodigo(jtfCodigo.getText()) != 1) {
	            int lineasAfectadas = ControladorMateria.guardarMateria(m);
	            if (lineasAfectadas > 0) {
	            	JOptionPane.showMessageDialog(null, "Materia guardada con éxito.");
	            } else {
	            	JOptionPane.showMessageDialog(null, "Error: No se actualizó la base de datos.");
	            }
	        }
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		
	}
}
