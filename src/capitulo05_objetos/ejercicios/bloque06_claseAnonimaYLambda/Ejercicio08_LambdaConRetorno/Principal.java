package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio08_LambdaConRetorno;

public class Principal {

	public static void main(String[] args) {
		
		Calculadora suma = (a, b) -> a + b;
		Calculadora restar = (a, b) -> a - b;
		Calculadora multiplicar = (a, b) -> a * b;

		
		int a = 10;
		int b = 5;
		
		System.out.println("Suma: " + a + " + " + b + " = " +  suma.operar(a, b));
		System.out.println("Resta: " + a + " - " + b + " = " + restar.operar(a, b));
		System.out.println("Multiplicacion: " + a + " * " + b + " = " + multiplicar.operar(a, b));
				
	}

}
