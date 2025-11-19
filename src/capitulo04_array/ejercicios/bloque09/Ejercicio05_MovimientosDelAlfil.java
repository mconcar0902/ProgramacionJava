package capitulo04_array.ejercicios.bloque09;

import java.util.Scanner;

public class Ejercicio05_MovimientosDelAlfil {

	public static void main(String[] args) {
		int m[][] = new int[8][8];	
		System.out.println("Movimientos de un alfil.\n");
		inicializaMatriz(m);
		muestraMatriz(m);
		posicionDelAlfil(m);
		System.out.println();
		muestraMatriz(m);
	}
	
	/**
	 * @param m
	 * 
	 */
	public static void inicializaMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 0;
			}
		}
	}

	/**
	 * @param m
	 *
	 */
	public static void muestraMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * @param m
	 * 
	 */
	public static void posicionDelAlfil(int m[][]) {
		Scanner sc = new Scanner(System.in);
		
		boolean valido = false;
		int posI ,posJ;
		do {
			System.out.print("Escribe una fila (de 0 a 7): ");
			posI = sc.nextInt();
			System.out.print("Escribe una columna (de 0 a 7): ");
			posJ = sc.nextInt();
			
			if (posI >= 0 && posI < 8) {
				if(posJ >= 0 && posJ < 8) {
					valido = true;
				}
			}
		} while (!valido);
		
		m[posI][posJ] = 1;
		
		movimientosDelAlfil(m, posI, posJ);
	}
	
	/**
	 * 
	 * @param m
	 * @param posI
	 * @param posJ
	 */
	public static void movimientosDelAlfil(int m[][], int posI, int posJ) {
		int I = posI , J = posJ;
		
		while (I > 0 && J > 0) {    //diagonal hacia 0,0
			I = I - 1;
			J = J - 1;
			m[I][J] = 2;
		}
		I = posI ;
		J = posJ;
		
		while (I > 0 && J < 7 ) {   //diagonal hacia 0,7
			I = I - 1;
			J = J + 1;
			m[I][J] = 2;
		}
		I = posI ;
		J = posJ;
		
		while (I < 7 && J > 0 ) {    //diagonal hacia 7,0
			I = I + 1;
			J = J - 1;
			m[I][J] = 2;
		}
		I = posI ;
		J = posJ;
		
		while (I < 7 && J < 7 ) {    //diagonal hacia 7,7
			I = I + 1;
			J = J + 1;
			m[I][J] = 2;
		}
	}
}
