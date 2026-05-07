package capitulo09_AWT_SWING.ejercicios.bloqueEjemplos.ej02GestionMVCCliente.modelo;

import java.util.Date;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String localidad;
	private String dni;
	private Date fechaNacimiento;
	private boolean activo;
	
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nombre, String apellidos, String localidad, String dni, Date fechaNacimiento,
			boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.activo = activo;
	}

	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad
				+ ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", activo=" + activo + "]";
	}
	
	
	
}
