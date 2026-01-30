package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio03_ClaseAbstractaAnonima;

public abstract class Empleado {

	abstract void calcularSalario();
	
	public void mostrarInfo() {
		System.out.println("Calculando salario del empleado.");
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado e1 = new Empleado() {

			@Override
			void calcularSalario() {
				System.out.println("El salario del empleado es 3000 euros.");
			}
		};
		
		e1.mostrarInfo();
		e1.calcularSalario();
	}
}
