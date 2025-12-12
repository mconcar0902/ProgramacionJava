package examenes.examen20251212;

import javaUtils.JavaUtils;

public class Ejercicio02_ {

	public static void main(String[] args) {
		int array[] = new int[20];

		JavaUtils.inicializarArrayAleatorio(array, 1, 10);
		System.out.print("Original - ");
		JavaUtils.mostrarArray(array);
		int cont[] = contarApariciones(array);
		System.out.print("Frecuencia - ");
		JavaUtils.mostrarArray(cont);
		ordenarYMuestraArray(cont);
		
	}
	
	public static int[] contarApariciones(int array[]) {
		int array1[] = new int[10];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = JavaUtils.contarOcurrencias(array, i + 1);
		}
		return array1;
	}
	
	public static void ordenarYMuestraArray(int array[]) {
		int pos[] = new int[10];
		for (int i = 0; i < pos.length; i++) {
			pos[i] = (i + 1);
		}
		
		boolean hayCambios;
		do {
			hayCambios = false;
			for (int i = 0; i < array.length -1; i++) {
				if (array[i] > array[i + 1]) {
					int aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
					
					int aux1 = pos[i];
					pos[i] = pos[i + 1];
					pos[i + 1] = aux1;
					hayCambios = true;
				}
			}
		} while (hayCambios);
		
		System.out.println("\nTop 3 numeros con mas frecuencia.");
		System.out.println("1º- Numero " + pos[pos.length - 1] + " con " + array[pos.length -1] + " apariciones.");
		System.out.println("2º- Numero " + pos[pos.length - 2] + " con " + array[pos.length -2]+ " apariciones.");
		System.out.println("3º- Numero " + pos[pos.length - 3] + " con " + array[pos.length -3]+ " apariciones.");
	}

}
