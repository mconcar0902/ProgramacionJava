package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio02;

public class Gato extends Animal{
	
	public Gato() {
		super();
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public Gato(String nombre) {
		super(nombre);
		this.nombre = nombre;
	}
	
	/**
	 * 
	 */
	@Override
	public String emitirSonido() {
		return  "Miau Miau";
	}

}
