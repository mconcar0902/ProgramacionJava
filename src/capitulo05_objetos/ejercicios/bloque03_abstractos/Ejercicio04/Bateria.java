package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio04;

public class Bateria extends Instrumento {

	public Bateria() {
		super();
	}
	
	public Bateria(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/**
	 * 
	 */
	@Override
	public String tocar() {
		return "Pon Pon Pum";
	}
}
