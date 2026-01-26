package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio02;

public class Dispositivo {

	protected String nombre;
	
	/**
	 * 
	 * @param nombre
	 */
	public Dispositivo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/**
	 * 
	 */
	public void mostrarNombre() {
		System.out.println("El nombre del dispositivo es " + nombre);
	}
	
}
