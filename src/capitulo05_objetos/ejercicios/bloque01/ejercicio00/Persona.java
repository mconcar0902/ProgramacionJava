package capitulo05_objetos.ejercicios.bloque01.ejercicio00;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String telefono;
	
	public Persona () {
		
	}
	
	public Persona (String nombre, String apellidos, String dni,
					String direccion, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Persona: nombre: " + nombre + " , apellidos: " + apellidos +
				" , dni: " + dni + " , direccion: " + direccion + " , telefono: " + telefono;
	}
	
	
}
