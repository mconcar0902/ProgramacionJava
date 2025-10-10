package capitulo03_bucles.ejercicios.bloque04;

public class Ejercicio03_TablasDeMutiplicarDel1Al15 {

	public static void main(String[] args) {
		
		int num = 0;
		int factor = 1;
	
		do {
			num++;
			System.out.println("Tabla de multiplicar del " + num);
			System.out.println();
			factor = 1;
			
			do {
				System.out.println(num + " x " + factor + " = " + (num * factor));
				factor++;
			} while (factor <= 10);
			
		} while (num < 15);
			
				
	}

}

