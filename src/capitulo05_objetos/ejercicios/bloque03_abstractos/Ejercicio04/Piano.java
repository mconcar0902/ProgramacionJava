package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio04;

public class Piano extends Instrumento {
	
	public Piano() {
		super();
	}
	
	public Piano(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/**
	 * 
	 */
	@Override
	public String tocar() {
		return "tin tin tin";
	}

	
}
