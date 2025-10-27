package capitulo04_array.ejercicios.bloque03;

public class Ejercicio03_OrdenacionShell {

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
		
		int salto = (array.length / 2);
		
		while(salto > 0) {
			for(int i = salto ; i < array.length ; i++) {
				int num = array[i];
                int j = i;
				 while (j >= salto && array[j - salto] > num) {
	                    array[j] = array[j - salto];
	                    j -= salto;
	                }
	                array[j] = num;
			}
			salto = salto / 2;
		}
	
	}

}
