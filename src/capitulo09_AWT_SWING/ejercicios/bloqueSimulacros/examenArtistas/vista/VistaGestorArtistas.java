package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador.ControladorArtista;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador.ControladorDisciplina;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador.ControladorMunicipio;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.controlador.ControladorProvincia;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Artista;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Disciplina;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Municipio;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo.Provincia;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;


public class VistaGestorArtistas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfBuscarArtista;
	private JTextField jtfNombre;
	private JComboBox<Municipio> jcbMunicipio;
	private JComboBox<Artista> jcbArtistasEncontrados;
	private JComboBox<Disciplina> jcbDisciplina;
	private JComboBox<Provincia> jcbProvincia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaGestorArtistas frame = new VistaGestorArtistas();
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
	public VistaGestorArtistas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestión de artistas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 10, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Búsqueda de artistas :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfBuscarArtista = new JTextField();
		GridBagConstraints gbc_jtfBuscarArtista = new GridBagConstraints();
		gbc_jtfBuscarArtista.insets = new Insets(0, 0, 5, 5);
		gbc_jtfBuscarArtista.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfBuscarArtista.gridx = 1;
		gbc_jtfBuscarArtista.gridy = 1;
		contentPane.add(jtfBuscarArtista, gbc_jtfBuscarArtista);
		jtfBuscarArtista.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(e -> buscarArtista());
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 0);
		gbc_btnBuscar.gridx = 2;
		gbc_btnBuscar.gridy = 1;
		contentPane.add(btnBuscar, gbc_btnBuscar);
		
		JLabel lblNewLabel_2 = new JLabel("Artistas encontrados :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jcbArtistasEncontrados = new JComboBox<Artista>();
		GridBagConstraints gbc_jcbArtistasEncontrados = new GridBagConstraints();
		gbc_jcbArtistasEncontrados.insets = new Insets(0, 0, 5, 5);
		gbc_jcbArtistasEncontrados.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbArtistasEncontrados.gridx = 1;
		gbc_jcbArtistasEncontrados.gridy = 2;
		contentPane.add(jcbArtistasEncontrados, gbc_jcbArtistasEncontrados);
		
		JButton btnCargarDatos = new JButton("Cargar datos");
		btnCargarDatos.addActionListener(e -> cargarDatos());
		GridBagConstraints gbc_btnCargarDatos = new GridBagConstraints();
		gbc_btnCargarDatos.insets = new Insets(0, 0, 5, 0);
		gbc_btnCargarDatos.gridx = 2;
		gbc_btnCargarDatos.gridy = 2;
		contentPane.add(btnCargarDatos, gbc_btnCargarDatos);
		
		JLabel lblNewLabel_3 = new JLabel("Artista encontrado");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.insets = new Insets(10, 0, 10, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre artistico :");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.gridwidth = 2;
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 4;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Disciplina :");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jcbDisciplina = new JComboBox<Disciplina>();
		GridBagConstraints gbc_jcbDisciplina = new GridBagConstraints();
		gbc_jcbDisciplina.gridwidth = 2;
		gbc_jcbDisciplina.insets = new Insets(0, 0, 5, 5);
		gbc_jcbDisciplina.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbDisciplina.gridx = 1;
		gbc_jcbDisciplina.gridy = 5;
		contentPane.add(jcbDisciplina, gbc_jcbDisciplina);
		
		JLabel lblNewLabel_6 = new JLabel("Provincia :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jcbProvincia = new JComboBox<Provincia>();
		jcbProvincia.addActionListener(e -> cargarMunicipiosPorIdProvincia());
		GridBagConstraints gbc_jcbProvincia = new GridBagConstraints();
		gbc_jcbProvincia.gridwidth = 2;
		gbc_jcbProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_jcbProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProvincia.gridx = 1;
		gbc_jcbProvincia.gridy = 6;
		contentPane.add(jcbProvincia, gbc_jcbProvincia);
		
		JLabel lblNewLabel_7 = new JLabel("Municipio :");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jcbMunicipio = new JComboBox<Municipio>();
		GridBagConstraints gbc_jcbMunicipio = new GridBagConstraints();
		gbc_jcbMunicipio.gridwidth = 2;
		gbc_jcbMunicipio.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMunicipio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMunicipio.gridx = 1;
		gbc_jcbMunicipio.gridy = 7;
		contentPane.add(jcbMunicipio, gbc_jcbMunicipio);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(e -> guardar());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 8;
		contentPane.add(btnGuardar, gbc_btnGuardar);

	}
	private void buscarArtista() {
		String nombre = jtfBuscarArtista.getText();
		
		List<Artista> list = ControladorArtista.encontrarArtista(nombre);
		jcbArtistasEncontrados.removeAllItems();
		for (Artista a : list) {
			jcbArtistasEncontrados.addItem(a);
		}
	}
	
	
	private void cargarDisciplinas() {
		List<Disciplina> list = ControladorDisciplina.findAll();
		
		jcbDisciplina.removeAllItems();
		
		for (Disciplina d : list) {
			jcbDisciplina.addItem(d);
		}
	}
	private void cargarProvincias() {
		List<Provincia> list = ControladorProvincia.findAll();
		
		jcbProvincia.removeAllItems();
		
		for (Provincia p : list) {
			jcbProvincia.addItem(p);
		}
	}
	
	private void cargarMunicipios() {
		List<Municipio> list = ControladorMunicipio.findAll();
		
		jcbMunicipio.removeAllItems();
		
		for (Municipio m : list) {
			jcbMunicipio.addItem(m);
		}
	}
	
	private void cargarMunicipiosPorIdProvincia() {
		Artista a = (Artista) jcbArtistasEncontrados.getSelectedItem();
		Provincia p = (Provincia) jcbProvincia.getSelectedItem();
		
		if (p == null) {
	        return; 
	    }
		
		List<Municipio> list = ControladorMunicipio.findAll();
		
		jcbMunicipio.removeAllItems();
		
		for (Municipio m : list) {
			if (m.getIdProvicia() == p.getId()) {
				jcbMunicipio.addItem(m);
			}
		}
		
		for (int i = 0; i < jcbMunicipio.getItemCount(); i++) {
		    Municipio m1 = jcbMunicipio.getItemAt(i);
		    
		    if (m1.getId() == a.getIdMunicipio()) {
		    	jcbMunicipio.setSelectedIndex(i); 
		    	break; 
		    }
        }
	}
	
	private void ordenarProvinciasMunicipios(Artista a) {
		cargarProvincias();
		cargarMunicipios();
		
		for (int i = 0; i < jcbMunicipio.getItemCount(); i++) {
		    Municipio m = jcbMunicipio.getItemAt(i);
		    
		    if (m.getId() == a.getIdMunicipio()) {
		        for (int j = 0; j < jcbProvincia.getItemCount(); j++) {
				    Provincia p = jcbProvincia.getItemAt(j);
				    
				    if (p.getId() == m.getIdProvicia()) {
				        jcbProvincia.setSelectedIndex(j); 
				        break; 
				    }
				}
		        cargarMunicipiosPorIdProvincia();
		        
		        break; 
		    }
		}
	}
	
	private void ordenarDisciplina(Artista a) {
		cargarDisciplinas();
		for (int i = 0; i < jcbDisciplina.getItemCount(); i++) {
		    Disciplina d = jcbDisciplina.getItemAt(i);
		    
		    if (d.getId() == a.getIdDisciplina()) {
		        jcbDisciplina.setSelectedIndex(i); 
		        break; 
		    }
		}
	}
	
	private void cargarDatos() {
		limpiar();
		Artista a = (Artista) jcbArtistasEncontrados.getSelectedItem();
		
		jtfNombre.setText(a.getNombre());
		ordenarDisciplina(a);
		ordenarProvinciasMunicipios(a);
	
	}
	
	private void limpiar() {
		jtfNombre.setText("");
	}

	
	private void guardar() {
		Artista a = (Artista) jcbArtistasEncontrados.getSelectedItem();
		Disciplina d = (Disciplina) jcbDisciplina.getSelectedItem();
		Municipio m = (Municipio) jcbMunicipio.getSelectedItem();
		
		a.setNombre(jtfNombre.getText());
		a.setIdDisciplina(d.getId());
		a.setIdMunicipio(m.getId());
		
		int result = ControladorArtista.guardarCambios(a);
		
		if (result != 0) {
		 	JOptionPane.showMessageDialog(null, "Asistente guardada con éxito.");
		} else {
			JOptionPane.showMessageDialog(null, "Error: No se actualizó la base de datos.");
		}
		
	}
	
	
	
	
}
