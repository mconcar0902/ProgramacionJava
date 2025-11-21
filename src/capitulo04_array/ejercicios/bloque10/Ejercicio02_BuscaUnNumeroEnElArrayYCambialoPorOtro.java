package capitulo04_array.ejercicios.bloque10;

import java.util.Scanner;

public class Ejercicio02_BuscaUnNumeroEnElArrayYCambialoPorOtro {

	public static void main(String[] args) {
		int array[] = new int[] {1,3,3,4,5,3};
		muestraArray(array);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nCual es el numero que quieres eliminar: ");
		int num = sc.nextInt();
		System.out.print("Cual es el numero que va a susutituir al numero " + num + ": ");
		int num1 = sc.nextInt();
		
		findAndReplace(array, num, num1);
		muestraArray(array);
	}

	/**
	 * 
	 * @param array
	 * @param num
	 * @param num1
	 */
	public static void findAndReplace(int array[], int num, int num1) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				array[i] = num1;
			}
		}
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
}
