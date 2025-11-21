package capitulo04_array.ejercicios.bloque11;

import java.util.Random;

public class Ejercicio02_DibujaEnPantallaOndasAleatoriasDeAsteriscos {

	public static void main(String[] args) {
		char m[][] = new char[10][30];

		inicializaMatriz(m);
		muestarMatriz(m);
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void inicializaMatriz(char m[][]) {
		Random rand = new Random();
		
		int num = rand.nextInt(0,30);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(j < num) {
					m[i][j] = '*';
				}
				else {
					m[i][j] = ' ';
				}
			}
			num = rand.nextInt(0,30);
		}
	}
	
	public static void muestarMatriz(char m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}
