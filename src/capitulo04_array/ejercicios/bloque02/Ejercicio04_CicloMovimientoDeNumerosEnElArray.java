package capitulo04_array.ejercicios.bloque02;

public class Ejercicio04_CicloMovimientoDeNumerosEnElArray {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		inicializaArray(array);
		muestraArray(array);
		desplazaCiclicoDerecha(array);
		muestraArray(array);

	}
	
	/**
	 * 
	 * 
	 */
	public static void inicializaArray(int array[]) {
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraArray(int array[]) {
		
		System.out.print("El array es: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
	}
	
	/**
	 * 
	 * 
	 */
	public static void desplazaCiclicoDerecha (int array[]) {
		int num , aux;
		
		aux = array[4];
		
		for (int i = 0; i < array.length; i++) {
			num = array[i] ;
			array[i] = aux ;
			
			aux = num ;
		}
	}

}
