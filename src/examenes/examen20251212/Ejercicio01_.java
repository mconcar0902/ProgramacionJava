package examenes.examen20251212;

import javaUtils.JavaUtils;

public class Ejercicio01_ {

	public static void main(String[] args) {
		int m[][] = new int[6][6];
		JavaUtils.inicializarMatrizAleatoria(m, 1, 9);
		JavaUtils.mostrarMatriz(m);
		
		System.out.println("\nLa suma del borde es: " + sumaBordes(m));
		System.out.println("La suma del interior es: " +sumaInterior(m));
		System.out.println("La suma de la diagonal principal es: " + diagonalPrincipal(m));
		System.out.println("La suma de la diagonal secundaria es: " + diagonalSecundaria(m));
		porcentajeDelBorde(m);
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int sumaBordes(int m[][]) {
		int total = 0;
		
		for (int i = 1; i < m.length; i++) {
			total += m[0][i];
			total += m[i][0];
			
			total += m[m.length -1][i];
			total += m[i][m.length -1];
		}
		return total;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int sumaInterior(int m[][]) {
		int total = 0;
		
		for (int i = 1; i < m.length-1; i++) {
			for (int j = 1; j < m.length-1; j++) {
				total += m[i][j];
			}
		}
		return total;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int diagonalPrincipal(int m[][]) {
		int total = 0;
		for (int i = 0; i < m.length; i++) {
			total += m[i][i];
		}
		return total;
	}
	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int diagonalSecundaria(int m[][]) {
		int total = 0;
		for (int i = 0; i < m.length; i++) {
			total += m[i][(m.length -1) -i];
		}
		return total;
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void porcentajeDelBorde(int m[][]) {
		float borde = sumaBordes(m);
		int total = sumaBordes(m) + sumaInterior(m);
		float porcentaje = (borde/total)*100;
		System.out.println("El porcentage de borde es: " + porcentaje + "%");
	}

}
