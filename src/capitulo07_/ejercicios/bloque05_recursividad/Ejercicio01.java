package capitulo07_.ejercicios.bloque05_recursividad;

public class Ejercicio01 {

	/**
	 * 
	 * @param num
	 * @return
	 */
	public static int fibonacci(int num) {
		if (num <= 1) {
			return num;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("El decimo numero de Fibonacci es " + fibonacci(10));

		System.out.println("El quinto numero de Fibonacci es " + fibonacci(5));
	}

}
