package capitulo05_objetos.ejercicios.bloque05_interfaces.Ejercicio02;

public class Principal {

	public static void main(String[] args) {

		ReproductorCD reproductorCD = new ReproductorCD("ReproductorCD");
		ReproductorMP3 reproductorMP3 = new ReproductorMP3("ReproductorMP3");
		
		reproductorMP3.mostrarNombre();
		reproductorMP3.reproducir();
		System.out.println();
		reproductorCD.mostrarNombre();
		reproductorCD.reproducir();

	}

}
