package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio02;

public abstract class Animal {

	public abstract String emitirSonido();
	protected String nombre;
	
	/**
	 * 
	 */
	public Animal() {
		super();
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}
	

}
