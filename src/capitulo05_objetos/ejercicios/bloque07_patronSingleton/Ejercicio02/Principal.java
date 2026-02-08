package capitulo05_objetos.ejercicios.bloque07_patronSingleton.Ejercicio02;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Crea distintos accesos
		 */
		Prueba p1 = new Prueba(5);
		Prueba p2 = new Prueba(15);
		Prueba p3 = new Prueba(50);
		
		/**
		 * Simulacion de accesos
		 */
		for (int i = 0; i < 50; i++) {
			AccessCounter.getInstance().registerAccess();
		}
		
		
		System.out.println("Ha habido " + AccessCounter.getInstance().getContador() + " accesos.");
			
	}

}
