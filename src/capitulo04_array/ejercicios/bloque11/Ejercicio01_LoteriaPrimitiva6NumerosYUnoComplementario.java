package capitulo04_array.ejercicios.bloque11;

import java.util.Random;

public class Ejercicio01_LoteriaPrimitiva6NumerosYUnoComplementario {

	public static void main(String[] args) {
		Random rand = new Random(); 
		int array[] = new int[7];
		
		for (int i = 0; i < array.length; i++) {
			int num = rand.nextInt(1,49);
			array[i] = num;
		}
		compruebaSiElNumeroSePuedeUsar(array);
		muestarArray(array);
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int[] compruebaSiElNumeroSePuedeUsar(int array[]) {
		Random rand = new Random(); 
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					int num = rand.nextInt(1,49);
					array[j] = num;
				}
			}
		}
		return array;
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void muestarArray(int array[]) {
		System.out.println("Loteria Primitiva.");
		System.out.print("Combinacion: ");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\nComplementario: " + array[6]);
	}
}
