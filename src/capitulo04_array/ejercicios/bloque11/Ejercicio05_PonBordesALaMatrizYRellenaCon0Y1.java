package capitulo04_array.ejercicios.bloque11;

import java.util.Random;

public class Ejercicio05_PonBordesALaMatrizYRellenaCon0Y1 {

	public static void main(String[] args) {
		char m[][] = new char[10][20];

		inicializaMatriz(m);
		muestraMatriz(m);
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void inicializaMatriz(char m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				Random rand = new Random();
				int num = rand.nextInt(0,2);
				
				if (i == 0 || i == 9) {
					m[i][j] = '*';
				}
				else if(j == 0 || j == 19){
					m[i][j] = '*';
				}
				else if(num == 1){
					m[i][j] = '1';
				}
				else if(num == 0){
					m[i][j] ='0';
				}
			}
		}
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void muestraMatriz(char m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}
