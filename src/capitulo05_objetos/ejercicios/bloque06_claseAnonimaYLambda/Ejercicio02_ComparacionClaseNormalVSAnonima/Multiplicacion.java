package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio02_ComparacionClaseNormalVSAnonima;

public class Multiplicacion implements Operacion{

	@Override
	public int ejecutar(int a, int b) {
		return a * b;
	}

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Multiplicacion m1 = new Multiplicacion();
		Operacion o1 = new Operacion() {
			
			@Override
			public int ejecutar(int a, int b) {
				return a / b;
			}
		};
		
		int a = 10; int b = 5;
		
		System.out.println("Multiplicacion: " + a + " * " + b + " = " + m1.ejecutar(a, b));
		System.out.println("Divicion: " + a + " / " + b + " = " + o1.ejecutar(a, b));
		
		
		
	}
	
}
