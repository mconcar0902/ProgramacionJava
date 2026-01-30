package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio04_ClaseAnonimaComoAtributo;

public class Principal {

	public static void main(String[] args) {
		
		Validador v = new Validador() {

			@Override
			public boolean validar(String texto) {
				return texto.length() > 5;
			}
			
		};
		
		System.out.println("Validar palabra: " + v.validar("validador"));
	
	}

}
