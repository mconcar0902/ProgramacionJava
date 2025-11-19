package capitulo04_array.ejercicios.bloque09;

import java.util.Scanner;

public class Ejercicio02_Pide10NumerosCreaSubArrayYRotaUnCiclo {

	public static void main(String[] args) {
		int array[] = new int[10];
		
		inicializaArray(array); 
		muestraArray(array);
		ciclicoDelArray(array);
		muestraArray(array);
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void inicializaArray(int array[]) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Escribe un numero: ");
			array[i] = sc.nextInt();
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void ciclicoDelArray(int array[]) {
		Scanner sc = new Scanner(System.in);
		int inicio , fin;
		
		do {
			System.out.print("\nEscribe el inicio de la subcadena: ");
			inicio = sc.nextInt();
			
			System.out.print("Escribe el fin de la subcadena: ");
			fin = sc.nextInt();
			System.out.println();
		} while (inicio > fin);
		
		int num , aux;
		aux = array[9];
		
		for (int i = 0; i < array.length; i++) {
			if (i != inicio) {
				num = array[i] ;
				array[i] = aux ;
				aux = num ;
			}
			else {
				i += (fin-inicio); 
			}
		}
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void muestraArray(int array[]) {
		System.out.print("Array:    ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print("\nPosicion: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + ", ");
		}
	}

}
