package examenes.examen20251128;

import javaUtils.JavaUtils;

public class Ejercicio01_FrecuenciaDeValoresEnMatriz {

	public static void main(String[] args) {
		int m[][] = new int[4][4];
		JavaUtils.inicializarMatrizAleatoria(m, 1, 5);
		
		mostrarMatriz(m);
		int array[] = creaArrayConLaFrecuenciaDeLosValoresDeLaMatriz(m);
		System.out.println();
		frecuencia(array);
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int[] creaArrayConLaFrecuenciaDeLosValoresDeLaMatriz(int m[][]) {
		int array[] = new int[5];
		int num = 1, cont = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < m.length; j++) {
				for (int k = 0; k < m[j].length; k++) {
					if(num == m[j][k]) {
						cont++;
					}
				}
			}
				array[i] = cont;
				cont = 0;
				num++;
		}
		return array;
	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
	 }
	 
	/**
	 * 
	 * @param array
	 */
	 public static void frecuencia(int array[]) {
		 int num = 1;
		 for (int i = 0; i < array.length; i++) {
			System.out.println("Numero " + num + " se repite " + array[i] + " veces.");
			num++;
		}
		 
	 }
}
