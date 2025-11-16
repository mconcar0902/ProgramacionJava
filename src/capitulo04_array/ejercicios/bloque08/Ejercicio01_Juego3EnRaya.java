package capitulo04_array.ejercicios.bloque08;

import java.util.Scanner;

public class Ejercicio01_Juego3EnRaya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tablero[][] = new int[3][3];
		
		inicializarTablero(tablero);
		imprimirTablero(tablero);
		
		int turno = 1;
		boolean fin;
		
		do {
			System.out.print("Turno jugador " + turno);
			System.out.print("\nEscribe la fila (entre 0 y 2): ");
			int fila = sc.nextInt();
			System.out.print("Escribe la columna (entre 0 y 2): ");
			int columna = sc.nextInt();
			
			while (esMovimientoValido(tablero, fila, columna) != true) {
				System.out.print("\nTurno jugador " + turno);
				System.out.print("\nEscribe la fila (entre 0 y 2): ");
				fila = sc.nextInt();
				System.out.print("Escribe la columna (entre 0 y 2): ");
				columna = sc.nextInt();
			}
			
			realizarMovimiento(tablero, fila, columna, turno);
			imprimirTablero(tablero);
			
			fin = hayEmpate(tablero);
			if(fin == true) {
				System.out.println("La partida termina en empate.");
			}
			
			fin = haGanadoJugador(tablero, turno);
			if(fin == true) {
				System.out.println("Ha ganado el jugador " + turno);
			}
			turno = cambiarTurno(turno);
		} while (fin == false);
		
	}
	
	/**
	 * 
	 * 
	 */
	public static void inicializarTablero(int tablero[][]) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = 0 ;
			}
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static void imprimirTablero(int tablero[][]) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static boolean esMovimientoValido(int tablero[][], int fila, int columna) {
		if (fila >= 0 && fila <= 2) {
			if (columna >= 0 && columna <= 2) {
				if (tablero[fila][columna] == 0) {
					return true;
				}
				else {
					System.out.println("Esa pocision esta ya ocupada.");
				}
			}
			else {
				System.out.println("La columna que has puesto esta fuera del rango.");
			}
		}
		else {
			System.out.println("La fila que has puesto esta fuera del rango.");
		}
		return false;
	}
	
	/**
	 * 
	 * 
	 */
	public static void realizarMovimiento(int tablero[][], int fila, int columna, int turno) {
					tablero[fila][columna] = turno;
	}
	
	/**
	 * 
	 * 
	 */
	public static int cambiarTurno(int turno) {
		if (turno == 1) {
			turno = 2;
		}
		else {
			turno = 1;
		}
		return turno;
	}
	
	/**
	 * 
	 * 
	 */
	public static boolean hayEmpate(int tabla[][]) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * 
	 */
	public static boolean haGanadoJugador(int tablero[][], int turno) {
		for (int i = 0; i < tablero.length; i++) {
			if(tablero[i][0] == turno && tablero[i][1] == turno && tablero[i][2] == turno) {
				return true;
			}
		}
		
		for (int j = 0; j < tablero.length; j++) {
			if(tablero[0][j] == turno && tablero[1][j] == turno && tablero[2][j] == turno) {
				return true;
			}
		}
		
		if (tablero[0][0] == turno && tablero[1][1] == turno && tablero[2][2] == turno) {
			return true;
		}
		
		if (tablero[0][2] == turno && tablero[1][1] == turno && tablero[2][0] == turno) {
			return true;
		}
		
		return false;
	}
}
