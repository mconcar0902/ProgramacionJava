package capitulo03_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio02_PideUnLimiteCompruebaSiSonPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe cual es el limite inferior: ");
		int limInf = sc.nextInt();
		
		System.out.print("Escribe cual es el limite superior: ");
		int limSup = sc.nextInt();

		int num = limInf;
		
		while (num <= limSup) {
			Boolean esprimo = true;
			
			if (num <= 1) {
				System.out.println("Este numero no es primo.");
			}
			else if (num > 1 ){
				int divisor = 2;
				while (divisor <= Math.sqrt(num)) {
				
					if (num % divisor == 0) {
							esprimo = false ;
							System.out.println("El numero " + num + " es compuesto.");
							break;
					}
					divisor++;  
				}
			}
			if (esprimo) {
				System.out.println("El numero " + num + " es primo.");
			}
			
			num++;
		}
			
	}

}
