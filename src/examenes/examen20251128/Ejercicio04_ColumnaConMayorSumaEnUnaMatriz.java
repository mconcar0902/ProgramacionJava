package examenes.examen20251128;

import javaUtils.JavaUtils;

public class Ejercicio04_ColumnaConMayorSumaEnUnaMatriz {

	public static void main(String[] args) {
		int m[][] = new int[6][6];
		
		JavaUtils.inicializarMatrizAleatoria(m, 0, 50);
		JavaUtils.mostrarMatriz(m);
		System.out.println();
		
		int sumas[] = sumaValoresDeColumnas(m);
		mostrarArray(sumas);
		
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int[] sumaValoresDeColumnas(int m[][]) {
		int suma = 0;
		int array[] = new int[6];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				suma += m[j][i];
			}
			array[i] = suma;
			suma = 0;
		}
		return array;
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray(int array[]) {
		int max = array[0], posMax = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Columna " + i + ":  " + array[i]);
			if(array[i] > max) {
				max = array[i];
				posMax = i;
			}
		}
		System.out.println("\nLa columna que suma mas es "+ posMax + " y suma " + max);
	}
}
