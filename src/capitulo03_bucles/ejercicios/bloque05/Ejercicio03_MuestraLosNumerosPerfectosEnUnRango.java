package capitulo03_bucles.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio03_MuestraLosNumerosPerfectosEnUnRango {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el numero inferior del rango: ");
		int inf = sc.nextInt();	
		
		System.out.print("Escribe el numero superior del rango: ");
		int sup = sc.nextInt();
		
		System.out.println("Los numeros perfectos entre " + inf + " y " + sup + " son:");
		
		for (int num = inf ; num <= sup ; num++) {
			int suma = 0;
			
			for(int div = 1 ; div <= num / 2 ; div++) {
				
				if (num % div == 0) {
					suma = suma + div;
				}
			}
			
			if (suma == num) {
				System.out.println("El numero es perfecto " + num);
			}
				
		}

	}

}
