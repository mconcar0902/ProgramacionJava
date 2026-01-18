package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio02;

public class Perro extends Animal{
	
	public Perro() {
		super();
	}

	/**
	 * 
	 * @param nombre
	 */
	public Perro(String nombre) {
		super(nombre);
		this.nombre = nombre;
	}
	
	/**
	 * 
	 */
	@Override
	public String emitirSonido() {
		return "Guau Guau";
	}


}
