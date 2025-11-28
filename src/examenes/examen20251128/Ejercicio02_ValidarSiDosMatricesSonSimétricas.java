package examenes.examen20251128;

public class Ejercicio02_ValidarSiDosMatricesSonSimétricas {

	public static void main(String[] args) {
		int m1[][] = new int[][] {{1,2,3},
								{4,5,6},
								{7,8,9}};
								
		int m2[][] = new int[][] {{1,4,7},
								{2,5,8},
								{3,6,9}};
		

		System.out.println("Matriz A: ");
		mostrarMatriz(m1);
		System.out.println("\nMatriz B: ");
		mostrarMatriz(m2);
		
		if(sonDelMismoTamaño(m1, m2)) {
			if(sonTraspuestas(m1, m2)) {
				System.out.println("Las dos matrices son traspuestas.");
			}
			else {
				System.out.println("Las matrices no son traspuestas.");
			}
		}
		else {
			System.out.println("Las dos matrices no son del mismo tamaño.");
		}
	}
	
	/**
	 * 
	 * @param m1
	 * @param m2
	 * @return
	 */
	public static boolean sonDelMismoTamaño(int m1[][], int m2[][]) {
		int tamañoI = m1.length;
		
		for (int i = 0; i < m1.length; i++) {
			int tamañoJ = m1[i].length;
			if(tamañoI != m2.length) {
				if(tamañoJ != m2[i].length) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param m1
	 * @param m2
	 * @return
	 */
	public static boolean sonTraspuestas(int m1[][], int m2[][]) {
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if(m1[i][j] != m2[j][i]) {
					return false;
				}
			}
		}
		return true;
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

}
