package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio01_InterfaceAnonimaSimple;

public class Principal {

	public static void main(String[] args) {
		
		Mensaje m1 = new Mensaje() {
			
			@Override
			public void mostrar() {
				System.out.println("Mensaje desde clase anonima.");
				
			}
		};
		
		m1.mostrar();
		
	}

}
