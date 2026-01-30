package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio07_LambdaBasica;

public class Principal {

	public static void main(String[] args) {
		
		Saludo s = nombre -> System.out.println("Saludar a " + nombre);
	
		s.saludar("Manolo");
		s.saludar("Paco");
	}
}
