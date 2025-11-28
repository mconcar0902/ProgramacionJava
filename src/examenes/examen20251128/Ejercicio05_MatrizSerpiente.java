package examenes.examen20251128;

import javaUtils.JavaUtils;

public class Ejercicio05_MatrizSerpiente {

	public static void main(String[] args) {
		int array[] = new int[25];
		JavaUtils.inicializarArrayAleatorio(array, 0, 100);
		JavaUtils.mostrarArray(array);
		
		int m[][] = creaMatrizSerpiente(array);
		System.out.println("\nMatriz Serpiente:\n");
		JavaUtils.mostrarMatriz(m);
		

	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int[][] creaMatrizSerpiente(int array[]) {
		int m[][] = new int[5][5];
		int pos = 0;
		
		for (int i = 0; i < m.length; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = array[pos];
					pos++;
				}
			}
			else if(i % 2 == 1){
				for (int j = m[i].length-1; j >= 0; j--) {
					m[i][j] = array[pos];
					pos++;
				}
			}
		}
		return m;
	}
}
