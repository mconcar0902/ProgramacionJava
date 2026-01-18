package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio02;

public class Raton extends Animal{

	public Raton() {
		super();
	}
	
	public Raton(String nombre) {
		super(nombre);
		this.nombre = nombre;
	}
	
	
	@Override
	public String emitirSonido() {
		return "iii iii";
	}

}
