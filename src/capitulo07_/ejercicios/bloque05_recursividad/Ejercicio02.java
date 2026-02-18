package capitulo07_.ejercicios.bloque05_recursividad;

public class Ejercicio02 {

	/**
	 * 
	 * @param base
	 * @param exponente
	 * @return
	 */
	public static int potencia(int base, int exponente) {
		if (exponente == 1) {
			return base;
		}
		return base * potencia(base, exponente - 1);
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Potencia de 5 elevado a 4: " + potencia(5, 4));
		
		System.out.println("Potencia de 2 elevado a 8: " + potencia(2, 8));

	}

}
