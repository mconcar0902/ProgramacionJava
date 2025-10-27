package examenes.examen20251024;

public class Ejercicio03 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		inicializacionArrays(array1, array2, 0, 10);
		muestraArrays(array1, array2);
		compruebaCoincidencias(array1, array2);
		

	}
	
	/**
	 * 
	 * 
	 */
	public static void inicializacionArrays(int array1[], int array2[], int max , int min) {

		for (int i = 0; i < array1.length; i++) {
			array1[i] =  (int) Math.round(Math.random()* (max - min) + min);
		}
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] =  (int) Math.round(Math.random()* (max - min) + min);
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraArrays(int array1[], int array2[]) {
		System.out.print("Array1: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + ", ");
		}
		 System.out.println();
		 System.out.print("Array2: ");
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i] + ", ");
			}
			 System.out.println();
	}
	
	/**
	 * 
	 * 
	 */
	public static void compruebaCoincidencias(int array1[], int array2[]) {
		int cont = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i]) {
				cont = cont + 1;
			}
		}
		System.out.println("Las veces que se repite un numero en la misma posicion son " + cont);
	}

}
