package examenes.examen20251024;

import java.util.Scanner;

public class Ejercicio05 {

		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
		int limSup = sc.nextInt();

		int num = 0;
		int suma = 0;
		
		while (num <= limSup) {
			Boolean esprimo = true;

			if (num > 1 ){
				int divisor = 2;
				while (divisor <= Math.sqrt(num)) {
					if (num % divisor == 0) {
							esprimo = false ;
							break;
					}
					divisor++;  
				}
			}
			if (esprimo ) {
				System.out.print("Los primos son: ");
				System.out.println(num + " ");

					suma = suma + num ;					
			}
			
			num++;
			
		}
		System.out.println();
		System.out.println("La suma de los primos es " + suma);
		
		
		
	}
}