package capitulo05_objetos.ejercicios.bloque07_patronSingleton.Ejercicio02;

public class Prueba {

	public Prueba(int num) {
		for (int i = 0; i < num; i++) {
			AccessCounter.getInstance().registerAccess();
		}
	}
}
