package capitulo04_array.ejercicios.bloquePrueba;

import java.util.Random;

public class Ejercicio01_RotaLaMatrizEnSentidoHorario {

	public static void main(String[] args) {
	int m[][] = new int[][] {{1, 2, 3, 4},
							{3, 1, 2, 5},
							{2, 4, 3, 6},
							{1, 9, 8, 7}};
							
		System.out.println("Matriz original");
		muestraMatriz(m);
		System.out.println();
		int rep = m.length / 2;
		
		for (int contador = 0; contador < rep; contador++) {
			int limite = m.length - contador - 1;
			rotaLaMatriz(m, contador, limite);
			
			muestraMatriz(m);
			System.out.println();
		}
			
	}
	
	public static void rotaLaMatriz(int m[][], int contador, int limite) {
		int num, aux, aux4, aux1, aux2, aux3;
		aux2 = m[contador][limite];
		aux1 = m[contador+1][contador];   //Son las posiciones de las esquinas
		aux4 = m[limite][contador];
		aux3 = m[limite-1][limite];
		
		aux = m[contador][limite];
		for (int i = contador; i <= limite; i++) {
			for (int j = contador; j <= limite; j++) {
				if (i == contador) {
					for (int k = contador; k <= limite; k++) {
						num = m[i][j] ;
						m[i][j] = aux ;
						
						aux = num ;
					}
					break;
				}
				else if(i == limite) {
					for (int k = limite; k >= 0; k--) {
						num = m[i][limite-j] ;
						m[i][j] = aux ;
						
						aux = num ;
					}
					break;
				}
				else if(j == contador || j == limite){
					num = m[i][j] ;
					m[i][j] = aux ;
					
					aux = num ;
				}
			}
		}
		m[contador+1][limite] = aux2;
		m[contador][contador] = aux1;
		m[limite][limite] = aux3;      //Rotan su posicion
		m[limite-1][contador] = aux4;
	}
	
	public static void inicializaMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) Math.round(Math.random() * 9);
			}
			
		}
	}
	
	public static void muestraMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
