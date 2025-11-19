package capitulo04_array.ejercicios.bloque09;

public class Ejercicio01_Genera20NumerosAleatoriosOrdenaLosParesPrimero {

	public static void main(String[] args) {
		int array[] = new int[20];
		
		inicializaArray(array); 
		muestraArray(array);
		ordenaParesImpares(array);
		muestraArray(array);
		
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void inicializaArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
	}
	
	/**
	 * 
	 * @param array
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
	 * @param array
	 */
	public static void ordenaParesImpares(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] % 2 == 0) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}
}