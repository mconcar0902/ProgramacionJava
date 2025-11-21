package capitulo04_array.ejercicios.bloque10;

import java.util.Scanner;

public class Ejercicio03_AñadeUnNumeroEnteroAUnArray {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6};
		muestraArray(array);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEscribe el numero que quieres añadir al array: ");
		int num = sc.nextInt();
		
		int array2[] = addInteger(array, num);
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
	public static int[] addInteger(int array[], int num) {
		int tamaño = array.length + 1;
		int array2[] = new int[tamaño];
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		array2[array.length] = num;
		
		return array2;
	}
}
