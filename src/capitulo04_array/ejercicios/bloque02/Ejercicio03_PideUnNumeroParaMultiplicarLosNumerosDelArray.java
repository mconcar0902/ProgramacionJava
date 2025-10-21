package capitulo04_array.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio03_PideUnNumeroParaMultiplicarLosNumerosDelArray {

	public static void main(String[] args) {
		
		int[] array = new int[150];
		
		inicializaArray(array);
		muestraArray(array);
		multiplicaValoresPorFactor(array, 0);
		muestraArray(array);
		
	}
		
	/**
	 * 
	 * 
	 * @param array
	 */
	public static void inicializaArray(int array[]) {
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraArray(int array[]) {
		
		System.out.print("El array es: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
	}
	
	/**
	 * 
	 * 
	 */
	public static void multiplicaValoresPorFactor (int array[], int factor) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cual es el numero por el que quieres multiplicar el array: ");
		factor = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * factor ;
		}
		
		
	}
	
}
