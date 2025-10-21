package capitulo04_array.ejercicios.bloque02;

public class Ejercicio02_CreaDosArraysIncluyeEnUnTercerArrayInicesParesEImparesDeLosOtrosDosArrays {

	public static void main(String[] args) {
		
		int[] array1 = new int[150];
		int[] array2 = new int[150];
		
		inicializaArrays(array1, array2);
		int array3[] = creaTercerArray(array1, array2);
		muestraArrays(array1, array2, array3);

	}
	/**
	 * 
	 */
	public static void inicializaArrays(int array1[] , int array2[]) {
		
		for (int i = 0 ; i < array1.length ; i++) {
			array1[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int i = 0 ; i < array2.length ; i++) {
			array2[i] = (int) Math.round(Math.random() * 100);
		}
	}
	
	/**
	 * 
	 */
	public static int[]  creaTercerArray(int array1[], int array2[]) {
		
		int[] array3 = new int[150];
		
		for(int i = 0 ; i < array1.length ; i++) {
			if (i % 2 == 1) {
				array3[i] = array1[i]; 
			}
		}
		for(int i = 0 ; i < array2.length ; i++) {
			if (i % 2 == 0) {
				array3[i] = array2[i]; 
			}
		}
		
		return array3;
	}
	
	/**
	 * 
	 */
	public static void  muestraArrays(int array1[], int array2[] , int array3[]) {
		
		System.out.print("Array 1: ");
		for(int i = 0 ; i < array1.length ; i++) {
			System.out.print(array1[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Array 2: ");
		for(int i = 0 ; i < array2.length ; i++) {
			System.out.print(array2[i] + ", ");
		}
		
		System.out.println();
		System.out.print("Array 3: ");
		for(int i = 0 ; i < array3.length ; i++) {
			System.out.print(array3[i] + ", ");
		}
	}
}
