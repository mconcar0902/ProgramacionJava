package capitulo09_AWT_SWING.ejercicios.bloqueEjemplos.ej02GestionMVCCliente.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import capitulo09_AWT_SWING.ejercicios.bloqueEjemplos.ej02GestionMVCCliente.controlador.ControladorCliente;
import capitulo09_AWT_SWING.ejercicios.bloqueEjemplos.ej02GestionMVCCliente.modelo.Cliente;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VentanaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfApellidos;
	private JTextField jtfLocalidad;
	private JTextField jtfDNI;
	private JTextField jtfFechaNac;
	private JCheckBox checkActivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente frame = new VentanaCliente();
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
	public VentanaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestion de Clientes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 15, 0);
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
		jtfId.setEditable(false);
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
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfApellidos = new JTextField();
		GridBagConstraints gbc_jtfApellidos = new GridBagConstraints();
		gbc_jtfApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellidos.gridx = 1;
		gbc_jtfApellidos.gridy = 3;
		contentPane.add(jtfApellidos, gbc_jtfApellidos);
		jtfApellidos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Localidad :");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 4;
		contentPane.add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("DNI :");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfDNI = new JTextField();
		GridBagConstraints gbc_jtfDNI = new GridBagConstraints();
		gbc_jtfDNI.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDNI.gridx = 1;
		gbc_jtfDNI.gridy = 5;
		contentPane.add(jtfDNI, gbc_jtfDNI);
		jtfDNI.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha Nacimiento :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfFechaNac = new JTextField();
		GridBagConstraints gbc_jtfFechaNac = new GridBagConstraints();
		gbc_jtfFechaNac.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaNac.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaNac.gridx = 1;
		gbc_jtfFechaNac.gridy = 6;
		contentPane.add(jtfFechaNac, gbc_jtfFechaNac);
		jtfFechaNac.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Activo :");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		checkActivo = new JCheckBox("");
		GridBagConstraints gbc_checkActivo = new GridBagConstraints();
		gbc_checkActivo.insets = new Insets(0, 0, 5, 0);
		gbc_checkActivo.anchor = GridBagConstraints.WEST;
		gbc_checkActivo.gridx = 1;
		gbc_checkActivo.gridy = 7;
		contentPane.add(checkActivo, gbc_checkActivo);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 8;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(e -> cargarPrimerRegistro());
		btnNewButton.setIcon(new ImageIcon(VentanaCliente.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/gotostart.png")));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(e -> cargarRegistroAnterior());
		btnNewButton_1.setIcon(new ImageIcon(VentanaCliente.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/previous.png")));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(e -> cargarSiguienteRegistro());
		btnNewButton_2.setIcon(new ImageIcon(VentanaCliente.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/next.png")));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener( e -> cargarUltimoRegistro());
		btnNewButton_3.setIcon(new ImageIcon(VentanaCliente.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/gotoend.png")));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener( e -> nuevo());
		btnNewButton_4.setIcon(new ImageIcon(VentanaCliente.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/nuevo.png")));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(e -> guardar());
		btnNewButton_5.setIcon(new ImageIcon(VentanaCliente.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/guardar.png")));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(VentanaCliente.class.getResource("/capitulo09_AWT_SWING/ejercicios/res/eliminar.png")));
		panel.add(btnNewButton_6);

		cargarPrimerRegistro();
	}
	
	/**
	 * 
	 */
	private void cargarPrimerRegistro() {
		cargarRegistro(ControladorCliente.getPrimero());
	}
	private void cargarRegistroAnterior() {
		cargarRegistro(ControladorCliente.getAnterior(Integer.parseInt(jtfId.getText())));
	}
	private void cargarSiguienteRegistro() {
		cargarRegistro(ControladorCliente.getSiguiente(Integer.parseInt(jtfId.getText())));
	}
	private void cargarUltimoRegistro() {
		cargarRegistro(ControladorCliente.getUltimo());
	}
	
	
	
	/**
	 * 
	 * @param c
	 */
	private void cargarRegistro(Cliente c) {
		if (c != null) {
			jtfId.setText("" + c.getId());
			jtfNombre.setText(c.getNombre());
			jtfApellidos.setText(c.getApellidos());
			jtfLocalidad.setText(c.getLocalidad());
			jtfDNI.setText(c.getDni());
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			jtfFechaNac.setText(sdf.format(c.getFechaNacimiento()));
			checkActivo.setSelected(c.isActivo());
		}
	}
	
	/**
	 * 
	 */
	private void nuevo() {
		jtfId.setText("");
		jtfNombre.setText("");
		jtfApellidos.setText("");
		jtfLocalidad.setText("");
		jtfDNI.setText("");
		jtfFechaNac.setText("");
		checkActivo.setSelected(false);
	}
	
	/**
	 * 
	 * @param c
	 */
	private void guardar() {
		Cliente c  = getClienteFromPantalla();
		int registrosAfectados = ControladorCliente.guardarCliente(c);
		
		if (registrosAfectados == 1) {
			JOptionPane.showMessageDialog(null, "Guardado correctamente");
		}
		else {
			int registros = ControladorCliente.crearCliente(c);
			if (registros == 1) {
				JOptionPane.showMessageDialog(null, "Guardado correctamente");
			}
			else {
				JOptionPane.showMessageDialog(null, "Error en guardado");
			}
		}
		
		
	}
	
	
	private Cliente getClienteFromPantalla() {
		Cliente c = new Cliente();

		c.setId(getEnteroFromJTextField(jtfId));
		c.setNombre(jtfNombre.getText());
		c.setApellidos(jtfApellidos.getText());
		c.setLocalidad(jtfLocalidad.getText());
		c.setDni(jtfDNI.getText());
		c.setFechaNacimiento(getDateFromJTextField(jtfFechaNac));
		c.setActivo(checkActivo.isSelected());
		
		return c;
	}
	
	private Date getDateFromJTextField(JTextField jtf) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(jtf.getText());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private int getEnteroFromJTextField(JTextField jtf) {
		try {
			return Integer.parseInt(jtf.getText());
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	
	
	
	
}















