package capitulo04_array.ejercicios.bloque02;

public class Ejercicio01_CambiaLosSignosDelArray {

	public static void main(String[] args) {
		
		int[] array = new int[150];
		
		inicializaArray(array);
		muestraArray(array);
		cambiaSignoEnValores(array);
		muestraArray(array);
		
	}
	
	/**
	 * 
	 * @param array
	 */
	
	public static void inicializaArray(int array[]) {
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100) + 1) + (-100));
		}
	}

	/**
	 * 
	 */
	
	public static void cambiaSignoEnValores(int array[]) {
		
		for (int i = 0 ; i < array.length ; i++) {
			if (array[i] % 2 == 0) {
				array[i] = - array[i];
			}
		}
	}
	
	/**
	 * 
	 */
	
	public static void muestraArray(int array[]) {
		
		System.out.print("Este es el array: ");
		
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
}
