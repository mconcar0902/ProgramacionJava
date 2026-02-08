package capitulo05_objetos.ejercicios.bloque07_patronSingleton.Ejercicio02;

public class AccessCounter {
	
	private static AccessCounter instance;
	
	private int contador;
	
	/**
	 * 
	 */
	private AccessCounter() {
		this.contador = 0;
	}
	
	public static AccessCounter getInstance() {
		if (instance == null) {
            instance = new AccessCounter();
        }
		return instance;
	}
	
	/**
	 * 
	 * @return
	 */
	public void registerAccess() {
		contador++;
	}

	/**
	 * 
	 * @return
	 */
	public int getContador() {
		return contador;
	}
	
	
}
