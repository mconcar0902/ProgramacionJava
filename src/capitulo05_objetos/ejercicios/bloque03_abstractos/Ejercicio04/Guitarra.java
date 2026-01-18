package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio04;

public class Guitarra extends Instrumento {

	public Guitarra() {
		super();
	}
	
	public Guitarra(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/**
	 * 
	 */
	@Override
	public String tocar() {
		return "ran ran ran";
	}
	
}
