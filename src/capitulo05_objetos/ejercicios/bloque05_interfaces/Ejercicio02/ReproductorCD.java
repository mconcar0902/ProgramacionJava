package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio02;

public class ReproductorCD extends Dispositivo implements Reproductor {

	public ReproductorCD(String nombre) {
		super(nombre);
	}

	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo un CD");
	}

}
