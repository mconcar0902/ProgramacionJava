package capitulo03_bucles.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio01_PideNumerosCalculaLaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		
		System.out.print("Escribe de cuantos numeros quieres hacer la media: ");
		int repeticiones = sc.nextInt();
		
		for (int i = 0 ; i < repeticiones; i++) {
			System.out.print("Escribe el numero "+ (i + 1) + ": ");
			int num = sc.nextInt();
			
			num1 = num + num1;
		}
		
		System.out.println("La media de los numeros es " + (num1/repeticiones));

	}

}
