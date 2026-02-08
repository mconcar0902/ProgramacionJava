package capitulo05_objetos.ejercicios.bloque07_patronSingleton.Ejercicio01;

public class Logger {

	private static Logger instance;
	
	public static Logger getInstance() {
		if (instance == null) {
            instance = new Logger();
        }
		return instance;
	}
	
	public void info() {
		System.out.println("Mensaje informativo");
	}
	
	public void warning() {
		System.out.println("Mensaje de alerta");
	}
	
	public void error() {
		System.out.println("Mensaje de error");
	}
}
