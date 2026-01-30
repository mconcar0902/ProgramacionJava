package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio09_LambdaComoParametro;

public class Principal {
	
	public static void main(String[] args) {
		
		Calculadora calc = (a , b) -> a + b; 
		
		procesar(143, 5, calc);
		
	}

	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param calc
	 */
	public static void procesar(int a, int b, Calculadora calc) {
		int resultado = calc.operar(a, b);
		System.out.println("El resultado es " + resultado);
	}
	
}
