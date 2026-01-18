package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio02;

public class Pajaro extends Animal{

	public Pajaro() {
		super();
	}
	
	public Pajaro(String nombre) {
		super(nombre);
		this.nombre = nombre;
	}
	
	@Override
	public String emitirSonido() {
		return "Pio Pio";
	}

}
