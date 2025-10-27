package examenes.examen20251024;

public class Ejercicio02 {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		inicializacionArray(array);
		muestraArray(array);//muestra el array original
		ordenaArray(array);
		muestraArray(array); //muestra el array ya ordenado para no contra el menor y el mayor
		calculaMedia(array);

	}
	
	/**
	 * 
	 */
	public static void inicializacionArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			array[i] =  (int) Math.round(Math.random()*100);
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static void ordenaArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux ;
				}
				
			}
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void calculaMedia(int array[]) {
		double media ;
		int suma = 0;
		
		for (int i = 1; i < array.length - 1; i++) {
			suma = suma + array[i];
		}
		media = suma / (array.length - 2f);
		
		System.out.println("La media del array es " + media);
	}
	
	/**
	 * 
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

}
