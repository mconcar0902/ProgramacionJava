package capitulo03_bucles.ejercicios.bloque05;

import java.util.Scanner;


public class Ejercicio04_AdivinaElNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el numero inferior del rango :");
		int min = sc.nextInt();
		
		System.out.print("Escribe el numero inferior del rango :");
		int max = sc.nextInt();
		
		System.out.println("Debes adivinar un numero aleatorio entre el " + min + " y el " + max);
		
		int n = (int) Math.round(Math.random() * (max - min + 1) + min);
		
		int num = 0;
		
		
		do {
			System.out.print("Escribe un numero :");
			num = sc.nextInt() ;
		
			if (num < n) {
				System.out.println(num + " es menor que el numero que buscas.");
			}
			else if (num > n) {
				System.out.println(num + " es mayor que el numero que buscas.");
			}
			
		} while (num != n);
		
		System.out.println("Muy bien el numero era " + n );

	}

}
