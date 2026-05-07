package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.controlador.ControladorAsistente;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.controlador.ControladorGimnasio;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.controlador.ControladorLocalidad;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.modelo.Asistente;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.modelo.Gimnasio;
import capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examen02.modelo.Localidad;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.Date;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class VistaGimnasio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtfFiltroApellido;
	private JTextField jtfId;
	private JTextField jtfDni;
	private JTextField jtfNombre;
	private JTextField jtfApellidos;
	private JTextField jtfFechaNacimiento;
	private JTextField jtfCuotaMensual;
	private JComboBox<Gimnasio> jcbGimnasio = new JComboBox<Gimnasio>();
	private JComboBox<Asistente> jcbAsistentesFiltrados = new JComboBox<Asistente>();
	private JComboBox<Localidad> jcbLocalidad = new JComboBox<Localidad>();
	private JCheckBox checkActivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaGimnasio frame = new VistaGimnasio();
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
	public VistaGimnasio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gestión de asistentes al gimnasio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 15, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gimnasio :");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		GridBagConstraints gbc_jcbGimnasio = new GridBagConstraints();
		gbc_jcbGimnasio.gridwidth = 2;
		gbc_jcbGimnasio.insets = new Insets(0, 0, 5, 0);
		gbc_jcbGimnasio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbGimnasio.gridx = 1;
		gbc_jcbGimnasio.gridy = 1;
		contentPane.add(jcbGimnasio, gbc_jcbGimnasio);
		
		JLabel lblNewLabel_2 = new JLabel("Filtro apellidos asistente :");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfFiltroApellido = new JTextField();
		GridBagConstraints gbc_jtfFiltroApellido = new GridBagConstraints();
		gbc_jtfFiltroApellido.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFiltroApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFiltroApellido.gridx = 1;
		gbc_jtfFiltroApellido.gridy = 2;
		contentPane.add(jtfFiltroApellido, gbc_jtfFiltroApellido);
		jtfFiltroApellido.setColumns(10);
		
		JButton btnFiltrarAsistente = new JButton("Filtrar asistentes");
		btnFiltrarAsistente.addActionListener(e -> buscarAsistente());
		GridBagConstraints gbc_btnFiltrarAsistente = new GridBagConstraints();
		gbc_btnFiltrarAsistente.insets = new Insets(0, 0, 5, 0);
		gbc_btnFiltrarAsistente.gridx = 2;
		gbc_btnFiltrarAsistente.gridy = 2;
		contentPane.add(btnFiltrarAsistente, gbc_btnFiltrarAsistente);
		
		JLabel lblNewLabel_3 = new JLabel("Asistentes filtrados :");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		
		GridBagConstraints gbc_jcbAsistentesFiltrados = new GridBagConstraints();
		gbc_jcbAsistentesFiltrados.gridwidth = 2;
		gbc_jcbAsistentesFiltrados.insets = new Insets(0, 0, 5, 0);
		gbc_jcbAsistentesFiltrados.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbAsistentesFiltrados.gridx = 1;
		gbc_jcbAsistentesFiltrados.gridy = 3;
		jcbAsistentesFiltrados.addActionListener(e -> cargarAsistente());
		contentPane.add(jcbAsistentesFiltrados, gbc_jcbAsistentesFiltrados);
		
		JLabel lblNewLabel_4 = new JLabel("Datos del asistente");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 3;
		gbc_lblNewLabel_4.insets = new Insets(15, 0, 10, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Id :");
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
		
		JLabel lblNewLabel_6 = new JLabel("DNI/NIE/Pasaporte :");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		contentPane.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfDni = new JTextField();
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.gridwidth = 2;
		gbc_jtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 6;
		contentPane.add(jtfDni, gbc_jtfDni);
		jtfDni.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Localidad :");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		contentPane.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		
		GridBagConstraints gbc_jcbLocalidad = new GridBagConstraints();
		gbc_jcbLocalidad.gridwidth = 2;
		gbc_jcbLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_jcbLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbLocalidad.gridx = 1;
		gbc_jcbLocalidad.gridy = 7;
		contentPane.add(jcbLocalidad, gbc_jcbLocalidad);
		
		JLabel lblNewLabel_8 = new JLabel("Nombre :");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		contentPane.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.gridwidth = 2;
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 8;
		contentPane.add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Apellidos :");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 9;
		contentPane.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		jtfApellidos = new JTextField();
		GridBagConstraints gbc_jtfApellidos = new GridBagConstraints();
		gbc_jtfApellidos.gridwidth = 2;
		gbc_jtfApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_jtfApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellidos.gridx = 1;
		gbc_jtfApellidos.gridy = 9;
		contentPane.add(jtfApellidos, gbc_jtfApellidos);
		jtfApellidos.setColumns(10);
		
		checkActivo = new JCheckBox("");
		GridBagConstraints gbc_checkActivo = new GridBagConstraints();
		gbc_checkActivo.anchor = GridBagConstraints.EAST;
		gbc_checkActivo.insets = new Insets(0, 0, 5, 5);
		gbc_checkActivo.gridx = 0;
		gbc_checkActivo.gridy = 10;
		contentPane.add(checkActivo, gbc_checkActivo);
		
		JLabel lblNewLabel_10 = new JLabel("Activo");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_10.gridwidth = 2;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 10;
		contentPane.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha nacimiento :");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 0;
		gbc_lblNewLabel_11.gridy = 11;
		contentPane.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		jtfFechaNacimiento = new JTextField();
		GridBagConstraints gbc_jtfFechaNacimiento = new GridBagConstraints();
		gbc_jtfFechaNacimiento.gridwidth = 2;
		gbc_jtfFechaNacimiento.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFechaNacimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaNacimiento.gridx = 1;
		gbc_jtfFechaNacimiento.gridy = 11;
		contentPane.add(jtfFechaNacimiento, gbc_jtfFechaNacimiento);
		jtfFechaNacimiento.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Cuota mensual (€) :");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 0;
		gbc_lblNewLabel_12.gridy = 12;
		contentPane.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		jtfCuotaMensual = new JTextField();
		GridBagConstraints gbc_jtfCuotaMensual = new GridBagConstraints();
		gbc_jtfCuotaMensual.gridwidth = 2;
		gbc_jtfCuotaMensual.insets = new Insets(0, 0, 5, 5);
		gbc_jtfCuotaMensual.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCuotaMensual.gridx = 1;
		gbc_jtfCuotaMensual.gridy = 12;
		contentPane.add(jtfCuotaMensual, gbc_jtfCuotaMensual);
		jtfCuotaMensual.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(e -> guardar());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(10, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 13;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		cargarGimnasio();

	}

	private void cargarGimnasio() {
		List<Gimnasio> list = ControladorGimnasio.findAll();
		
		for (Gimnasio c : list) {
			jcbGimnasio.addItem(c);
		}
	}
	
	private void buscarAsistente() {
		String apellidos = jtfFiltroApellido.getText();
		
		List<Asistente> lista = ControladorAsistente.buscarAsistintePorApellido(apellidos);
		
		jcbAsistentesFiltrados.removeAllItems();

		if (lista.isEmpty()) {
			JOptionPane.showMessageDialog(this, "No hay nadie con esos apellidos.");
		} else {
            for(Asistente a : lista) {
                jcbAsistentesFiltrados.addItem(a);
            }
		}	
	}
	
	
	
	private void cargarAsistente() {
		List<Localidad> list = ControladorLocalidad.findAll();
		
		for (Localidad l : list) {
			jcbLocalidad.addItem(l);
		}
		
		try {
			Asistente a = (Asistente) jcbAsistentesFiltrados.getSelectedItem();
			
			for (int i = 0; i < jcbLocalidad.getItemCount(); i++) {
			    Localidad locCombo = jcbLocalidad.getItemAt(i);
			    
			    if (locCombo.getId() == a.getIdLocalidad()) {
			        jcbLocalidad.setSelectedIndex(i); 
			        break; 
			    }
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			jtfId.setText(Integer.toString(a.getId()));
			jtfDni.setText(a.getDniNiePasaporte());
			jtfNombre.setText(a.getNombre());
			jtfApellidos.setText(a.getApellidos());
			checkActivo.setSelected(a.isActivo());
			jtfCuotaMensual.setText(Float.toString(a.getCuotaMensual()));
			
			if (a.getFechaNacimiento() == null) {
				jtfFechaNacimiento.setText("");
			}
			else {
				jtfFechaNacimiento.setText(sdf.format(a.getFechaNacimiento()));
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Float obtenerCuotaValidada() {
		String textoCuota = jtfCuotaMensual.getText().trim();
		
		
		if (textoCuota.isEmpty()) {
			JOptionPane.showMessageDialog(this, "El campo 'Cuota mensual' no puede estar vacío.", "Error de validación", JOptionPane.ERROR_MESSAGE);
			return null; // Devolvemos null para indicar fallo
		}

		try {
			float cantidad =  Float.parseFloat(textoCuota);;
			if ( cantidad > 0) {
				return cantidad;
			} else {
				JOptionPane.showMessageDialog(null,"No se puede poner una cuota de 0 o menos");
				return null;
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "La 'Cuota mensual' debe ser un número válido (ej: 30.50).", "Error de validación", JOptionPane.ERROR_MESSAGE);
			return null; // Si falla la conversión, devolvemos null
		}
	}
	
	private String obtenerDniValidado() {
		String textoDni = jtfDni.getText().trim();
		
		if (textoDni.isEmpty()) {
			JOptionPane.showMessageDialog(this, "El campo 'DNI/NIE/Pasaporte' no puede estar vacío.", "Error de validación", JOptionPane.ERROR_MESSAGE);
			return null;
		}

		// Usamos Expresiones Regulares (Regex)
		// .* significa "cualquier texto antes o después"
		// \\d{8} significa "8 números seguidos"
		if (!textoDni.matches(".*\\d{8}.*")) {
			JOptionPane.showMessageDialog(this, "El DNI/NIE/Pasaporte no es válido. Debe contener al menos 8 números seguidos.", "Error de validación", JOptionPane.ERROR_MESSAGE);
			return null; // Fallo rápido
		}

		return textoDni; // Si pasa las comprobaciones, devolvemos el texto validado
	}
	
	private boolean isFechaNacimientoValida() {
        String textoFecha = jtfFechaNacimiento.getText().trim();
        
        // 1. Si está vacía, es válida (no es obligatoria)
        if (textoFecha.isEmpty()) {
            return true;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // No permite fechas como "32/01/2024"

        try {
            Date fechaEntrada = sdf.parse(textoFecha);
            Date hoy = new Date(); // Fecha y hora actual

            // 2. Comprobar que sea anterior a hoy
            if (!fechaEntrada.before(hoy)) {
                JOptionPane.showMessageDialog(this, 
                    "La fecha de nacimiento debe ser anterior a hoy.", 
                    "Error de fecha", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            return true; // Es una fecha válida y en el pasado

        } catch (ParseException e) {
            // 3. Si el formato no es dd/MM/yyyy o es una fecha inválida
            JOptionPane.showMessageDialog(this, 
                "Formato de fecha incorrecto. Use dd/MM/yyyy (ej: 20/05/1990).", 
                "Error de formato", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
	
	private void guardar() {
		if (obtenerDniValidado() == null) {
			return; 
		}
		
		if (obtenerCuotaValidada() == null) {
			return;
		}
		
		if (!isFechaNacimientoValida()) {
			return;
		}
		
		Asistente a = new Asistente();
		Localidad l = (Localidad) jcbLocalidad.getSelectedItem();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {

			a.setId(Integer.parseInt(jtfId.getText()));
			a.setDniNiePasaporte(jtfDni.getText());
			a.setIdLocalidad(l.getId());
			a.setNombre(jtfNombre.getText());
			a.setApellidos(jtfApellidos.getText());
			a.setActivo(checkActivo.isSelected());
			a.setCuotaMensual(Float.parseFloat(jtfCuotaMensual.getText()));
			
			String textoFecha = jtfFechaNacimiento.getText().trim();
			if (textoFecha.isEmpty()) {
				jtfFechaNacimiento.setText(null);
			}
			else {
				a.setFechaNacimiento(sdf.parse(jtfFechaNacimiento.getText()));			}
			
			
			int result = ControladorAsistente.guardarCambios(a);
			
			if (result != 0) {
			 	JOptionPane.showMessageDialog(null, "Asistente guardada con éxito.");
            } else {
            	JOptionPane.showMessageDialog(null, "Error: No se actualizó la base de datos.");
            }
		
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
		
		
}
