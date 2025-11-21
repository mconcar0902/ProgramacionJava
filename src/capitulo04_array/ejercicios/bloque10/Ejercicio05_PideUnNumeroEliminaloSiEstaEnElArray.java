package capitulo04_array.ejercicios.bloque10;

import java.util.Scanner;

public class Ejercicio05_PideUnNumeroEliminaloSiEstaEnElArray {

	public static void main(String[] args) {
		int array[] = new int[] {1,3,3,4,5,3};
		muestraArray(array);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEscribe que numero quieres eliminar: ");
		int num = sc.nextInt();

		int array2[] = removeInteger(array, num);
		muestraArray(array2);
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void muestraArray(int array[]) {
		System.out.print("El array es: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}	
	
	/**
	 * 
	 * @param array
	 * @param num
	 * @return
	 */
	public static int countOccurrences(int array[], int num) {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				cont += 1;
			}
		}
		return cont;
	}

	/**
	 * 
	 * @param array
	 * @param num
	 * @return
	 */
	public static int[] removeInteger(int array[], int num) {
		int veces = countOccurrences(array, num);

		if(veces != 0) {
			int tamaño = array.length - veces; 
			int array2[] = new int[tamaño];
			int cont = 0;
			for (int i = 0; i < array.length; i++) {
				if(array[i] != num) {
					array2[cont] = array[i];
					cont += 1;
				}	
			}
			return array2;
		}
		else {
			System.out.print("El numero no esta en el array.\n");
		}
		return array;
	}
}
