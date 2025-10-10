package capitulo03_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio01_PideNumeroMuestraSiEsPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe cual es el numero que quieres que se compruebe: ");
		int num = sc.nextInt();
		
		int divisor = 2;
		
		Boolean esprimo = true;
		
		if (num <= 1) {
			System.out.println("Este numero no es primo.");
		}
		else {
			
			while (divisor <= Math.sqrt(num)) {
				
				if (num % divisor == 0) {
						esprimo = false ;
						break;
				}
				divisor++ ;  
			}
		}
		
		if (esprimo) {
			System.out.println("El numero " + num + " es primo.");
		}
		else {
			System.out.println("El numero " + num + " es compuesto.");
		}
		
		
		
	}

}
