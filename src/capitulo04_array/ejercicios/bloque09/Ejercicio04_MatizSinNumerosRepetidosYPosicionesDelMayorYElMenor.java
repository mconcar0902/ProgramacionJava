package capitulo04_array.ejercicios.bloque09;

public class Ejercicio04_MatizSinNumerosRepetidosYPosicionesDelMayorYElMenor {

	public static void main(String[] args) {
		int m[][] = new int[6][10] ;
		
		inicializaMatriz(m);
		muestraArray(m);
		buscaLaPosiscionDelMayor(m);
		buscaLaPosiscionDelMenor(m);
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void inicializaMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				int num = (int) Math.round(Math.random()* 1000);
				boolean esta = compruebaSiElNumeroEstaEnLaMatriz(m, num);
				if(esta) {
					j -= 1;
				}
				else {
					m[i][j] = num;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param m
	 * @param num
	 * @return
	 */
	public static boolean compruebaSiElNumeroEstaEnLaMatriz(int m[][], int num) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (num == m[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void muestraArray(int m[][]) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void buscaLaPosiscionDelMayor(int m[][]) {
		int numMayor = m[0][0];
		int posI = 0, posJ = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(numMayor < m[i][j]) {
					numMayor = m[i][j];
					posI = i;
					posJ = j;
				}
			}
		}
		System.out.println("\nEl numero mayor es " + numMayor + " en la cordenadas ("+ posI + "," + posJ + ").");
	}
	
	/**
	 * 
	 * @param m
	 */
	public static void buscaLaPosiscionDelMenor(int m[][]) {
		int numMenor = m[0][0];
		int posI = 0, posJ = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(numMenor > m[i][j]) {
					numMenor = m[i][j];
					posI = i;
					posJ = j;
				}
			}
		}
		System.out.println("El numero mayor es " + numMenor + " en la cordenadas ("+ posI + "," + posJ + ").");
	}
}
