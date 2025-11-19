package capitulo04_array.ejercicios.bloque07;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio01_MetodosMatrices {

	public static void main(String[] args) {
		int m[][] = new int[5][5];
		
		inicializaMatrizValoresAlAzar(m);  // Crea un método que rellena la matriz con valores creados al azar.
		muestraLaMatriz(m);                // Crea un método que imprima la matriz en pantalla.
		
//		Crea un método que compruebe si la matriz es positiva.
		
//		boolean esPositiva = compruebaSiLaMatrizEsPositiva(m);
//		if(esPositiva) {
//			System.out.println("todos los valores de la matriz son positivos.");
//		}
//		else {
//			System.out.println("No todos los valores de la matriz son positivos.");
//		}
		
		//  Crea un método que compruebe si la matriz es diagonal
		
//		 boolean es = comprobarLaDiagonalDeLaMatriz();
//		if (es == true) {
//			System.out.println("Esta matriz es diagonal.");
//		}
//		else {
//			System.out.println("Esta matriz no es diagonal.");
//		}
		
		// Crea un método que compruebe si la matriz es triangular superior.
		
//		 boolean es = compruebaLaTriangularSuperior();
//			if (es == true) {
//				System.out.println("Esta matriz es triangular.");
//			}
//			else {
//				System.out.println("Esta matriz no es triangular.");
//			}
		
//		compruebaLaMatrizSiEsDispersa();      //  Crea un método que compruebe si la matriz es dispersa.
		
//		creaArrayConValoresDeLaMatriz(m);    // Crea un método que construya un array unidimensional con todos los elementos de la matriz.
		
//		compruebaSiLaMatrizEsSimetrica(m);    // Crea un método que compruebe si la matriz es simétrica. 
		
//		int m2[][] = cambiaLaMatrizASuTraspuesta(m);    // Crea un método que realice la matriz traspuesta de la que recibe.
//		muestraLaMatriz(m2);
		
//		int m2[][] = cambiaLaMatrizASuOpuesta(m);     // Crea un método que realice la matiz opuesta de la que recibe.
//		muestraLaMatriz(m2);
		
		int m2[][] = eliminaUnaFilaDeLaMatriz(m);   // Crea un método que pida al usuario un número de fila sobre la matriz.
		muestraLaMatriz(m2);                        // Debes crear una matriz igual a la original pero eliminando
													// el número de fila que el usuario ha especificado.
	} 
	
	/**
	 * 
	 * 
	 */
	public static void inicializaMatrizValoresAlAzar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) Math.round(Math.random()*100);
			}
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraLaMatriz(int m[][]) {
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * 
	 * 
	 */
	public static boolean compruebaSiLaMatrizEsPositiva(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0) {
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
	public static boolean comprobarLaDiagonalDeLaMatriz() {
		int m[][] = new int[][] {{1, 0, 0, 0}, 
			 					{0, 9, 0, 0}, 
			 					{0, 0, 9, 0}, 
			 					{0, 0, 0, 1}};
			 					
		int posDia = 0;
			 					
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(posDia == j && m[i][j] == 0) {
					return false;
				}
				else if (posDia != j && m[i][j] != 0) {
					return false;
				}
			}
			posDia += 1;
		}
		return true;	 							 					
	}
	
	/**
	 * 
	 * 
	 */
	public static boolean compruebaLaTriangularSuperior() {
		int m[][] = new int[][] {{1, 6, 5, 1}, 
								{0, 5, 8, 1}, 
								{0, 0, 9, 9}, 
								{0, 0, 0, 1}};
				
		int posActual = 0;
						
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(posActual <= j && m[i][j] == 0) {
					return false;
				}
				else if (posActual > j && m[i][j] != 0) {
					return false;
				}
			}
			posActual += 1;
		}
		return true;	 					
	}
	
	/**
	 * 
	 * 
	 */
	public static boolean compruebaLaMatrizSiEsDispersa() {
		int m[][] = new int[][] {{1, 0, 5, 8}, 
								{4, 5, 0, 1}, 
								{6, 8, 9, 0}, 
								{0, 7, 5, 1}};
				
								
		for (int i = 0; i < m.length; i++) {
			boolean hayCero = false;
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] == 0) {
					hayCero = true;
				}
			}
			if (!hayCero) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 
	 * 
	 */
	 public static void creaArrayConValoresDeLaMatriz(int m[][]) {
		 int tamaño = 0;
		 for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				tamaño += 1;
			}
		}
		 
		int[] numeros = new int[tamaño];
		int pos = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				numeros [j + pos] = m[i][j];
			}
			pos += m[i].length;
		}
		System.out.println("\nEste es el array de los numeros de la matriz.");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
	 
	 }
	 
	 /**
	  * 
	  * 
	  */
	 public static void compruebaSiLaMatrizEsSimetrica(int m[][]) {
		 int tamañoJ = 0;
		 int tamañoI = 0;
		 
		 for (int i = 0; i < m.length; i++) {
			 tamañoI += 1;
			for (int j = 0; j < m[i].length; j++) {
				tamañoJ += 1;
			}
		 }

		 if ((tamañoJ / tamañoI) == tamañoI) {
			 System.out.println("\nEs una matriz simetrica.");
		 }
		 else {
			 System.out.println("\nEsta matriz no es simetrica.");
		 }
	 }
	 
	 /**
	  * 
	  * 
	  */
	 public static int[][] cambiaLaMatrizASuTraspuesta(int m[][]) {
		int fila = 0;
		int columna = 0;
		
		for (int i = 0; i < m.length; i++) {
			fila += 1;
			for (int j = 0; j < m[i].length; j++) {
				columna += 1;
			}
		}
		columna = columna / fila ;
		
		int m2[][] = new int[columna][fila] ;

				
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m2[j][i] = m[i][j];
			}
		}
		return m2;
	 }
		 
	 /**
	  * 
	  * 
	  */
	 public static int[][] cambiaLaMatrizASuOpuesta(int m[][]) {
		 int fila = m.length;
		 int columna = m[0].length;
		 
		 int m2[][] = new int[fila][columna];
		 
		 for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m2[i][j] = (-m[i][j]);
			}
		} 
		 return m2;
	 }
	 
	 /**
	  * 
	  * 
	  */
	 public static int[][] eliminaUnaFilaDeLaMatriz(int m[][]) {
		 Scanner sc = new Scanner(System.in);
	
		 System.out.print("Escribe la fila que quieres eliminar: ");
		 int num = sc.nextInt();
			
		 int fila = m.length;
		 int columna = m[0].length;
			 
		 int m2[][] = new int[fila -1][columna];
			
		 int nuevaFila = 0;
		 for (int i = 0; i < m.length; i++) {
			if(i != num) {
				for (int j = 0; j < m[i].length; j++) {
					m2[nuevaFila][j] = m[i][j];
				}
					nuevaFila++;
			}
		}
			return m2;
	 }
}
