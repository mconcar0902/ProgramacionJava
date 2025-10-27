package capitulo04_array.ejercicios.bloque03;

public class Ejercicio04_OrdenacionPorSeleccion {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		
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
			array[i] = (int) Math.round(Math.random() * 10);
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
		for (int i = 0; i < array.length; i++) {
			int numPos = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[numPos] > array[j]) {
					numPos = j;
				}
			}
			 int aux = array[numPos];
	            array[numPos] = array[i];
	            array[i] = aux;
		}
		
	}

}
