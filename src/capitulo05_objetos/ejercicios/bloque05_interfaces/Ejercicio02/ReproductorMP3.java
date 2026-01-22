package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio02;

public class ReproductorMP3 extends Dispositivo implements Reproductor {

	public ReproductorMP3(String nombre) {
		super(nombre);
	}

	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo archivo MP3");
		
	}

}
