package capitulo04_array.ejercicios.bloque10;

import java.util.Scanner;

public class Ejercicio04_CuentaCuantasVecesApareceUnNumeroEnUnArray {

	public static void main(String[] args) {
		int array[] = new int[] {1,3,3,4,5,3};
		muestraArray(array);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEscribe que numero quieres saber las veces que aparece: ");
		int num = sc.nextInt();
		
		int rep = countOccurrences(array, num);
		System.out.println("El numero " + num + " se repite " + rep + " veces.");
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
}
