package capitulo04_array.ejercicios.bloque03;

public class Ejercicio02_OrdenacionInsercionDirecta {

	public static void main(String[] args) {
		
		int array[] = new int[150];
		
		inicializaArray(array);
		muestraArray(array);
		ordenaArray(array);
		muestraArray(array);

	}
	
	/**
	 * 
	 * 
	 */
	public static void inicializaArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraArray(int array[]) {
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * 
	 */
	public static void ordenaArray(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int num = array[i];
			int j = i - 1;
			while( j >= 0 && num < array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j+1] = num;
		}
		
	}

}
