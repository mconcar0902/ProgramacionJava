package examenes.examen20251128;

import javaUtils.JavaUtils;

public class Ejercicio03_OrdenarPalabrasPorSuNumeroDeVocales {

	public static void main(String[] args) {
		String array[] = new String[]   {"Rafael", "Mari Carmen", "Juanito", "Pablo", "Pedrito", "Federica"};
		int conadores[] = contarVocales(array);
		
		mostrarArray(array);
		JavaUtils.mostrarArray(conadores);
		
		ordenaArray(conadores, array);
		
		System.out.println();
		mostrarArray(array);
		JavaUtils.mostrarArray(conadores);
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int[] contarVocales(String array[]) {
		String vocales = "aeiou";
		int cont = 0;
		int contadores[] = new int[6];
		
		String str = "";
		
		for (int i = 0; i < array.length; i++) {
			str = array[i];
			cont = cuentaLasVocales(str);
			contadores[i] = cont;
			cont = 0;	
		}
		return contadores;
	}
	
	/**
	 * 
	 * @param str1
	 * @return
	 */
	public static int cuentaLasVocales(String str1) {
		String str2 = "aeiouAEIOU";
		int numVocal = 0;
		
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				if(str2.charAt(i) == str1.charAt(j)) {
					numVocal = numVocal + 1;
				}
			}
		}
		return numVocal;
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray(String array[]) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
	 }
	 
	/**
	 * 
	 * @param array
	 * @param palabras
	 */
	 public static void ordenaArray(int array[], String palabras[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
					
					String aux2 = palabras[i];
					palabras[i] = palabras[j];
					palabras[j] = aux2;
				}
			}
		}
	}
}
