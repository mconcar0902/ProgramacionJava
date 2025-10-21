package capitulo04_array.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio05_PideCuantasVecesSeRepiteElCicloDelArray {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		inicializaArray(array);
		muestraArray(array);
		desplazaCiclicoDerecha(array,0);
		muestraArray(array);

	}
	
	/**
	 * 
	 * 
	 */
	public static void inicializaArray(int array[]) {
		
		for (int i = 0 ; i < array.length ; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraArray(int array[]) {
		
		System.out.print("El array es: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(" ");
	}
	
	/**
	 * 
	 * 
	 */
	public static void desplazaCiclicoDerecha (int array[] , int posiciones) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Cuantas veces quieres mover las posiciones del array a la derecha: ");
		posiciones = sc.nextInt();
		int num , aux;
		
		for (int i = 0; i < posiciones; i++) {
			
			aux = array[4];
			for (int j = 0; j < array.length; j++) {
				num = array[j] ;
				array[j] = aux ;
				
				aux = num ;
			}
		}
		
	}

}
