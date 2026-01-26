package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio02;

public class Principal {

	public static void main(String[] args) {

		Reproductor CD = new ReproductorCD("ReproductorCD");
		Reproductor MP3 = new ReproductorMP3("ReproductorMP3");
		
		((Dispositivo) MP3).mostrarNombre();
		MP3.reproducir();
		
		System.out.println();
		
		((Dispositivo) CD).mostrarNombre();
		CD.reproducir();

	}

}
