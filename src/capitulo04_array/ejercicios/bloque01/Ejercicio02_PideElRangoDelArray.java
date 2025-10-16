package capitulo04_array.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio02_PideElRangoDelArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el rango inferior de los numeros aleatorios: ");
		int inf = sc.nextInt();
		
		System.out.print("Escribe el rango superior de los numeros aleatorios: ");
		int sup = sc.nextInt();

		int[] numeros = new int[150]; ;
		
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = (int) (Math.random() * (sup - inf + 1) + inf) ;
			 
		}
		
		System.out.print("Los numeros son: ");
		
		for (int i = 0 ; i < numeros.length ; i++) {
			System.out.print(numeros[i] + ", ");
			
		}

	}

}
