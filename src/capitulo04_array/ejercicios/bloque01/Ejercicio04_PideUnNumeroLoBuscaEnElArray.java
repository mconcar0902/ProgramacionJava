package capitulo04_array.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio04_PideUnNumeroLoBuscaEnElArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[150];	
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100 ) ;
		}
		
		System.out.print("Introduce un numero entre 0 y 100: ");
		int num = sc.nextInt();
		boolean esta = false ;
		
		for (int i = 0 ; i < numeros.length ; i++) {
			if (num == numeros[i]) {
				System.out.println("El numero " + num + " se encuentra en la posiscion " + i);
				esta = true;
			}
		}
		
		if (esta == false) {
			System.out.println("El numero " + num + " no esta entre los 150 numeros aleatorios.");
		}
		
	}

}
