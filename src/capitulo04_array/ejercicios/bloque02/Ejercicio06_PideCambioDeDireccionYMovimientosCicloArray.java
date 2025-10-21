package capitulo04_array.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio06_PideCambioDeDireccionYMovimientosCicloArray {

	public static void main(String[] args) {

		int[] array = new int[5];
		
		inicializaArray(array);
		muestraArray(array);
		desplazaCiclico(array,0,0);
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
	public static void desplazaCiclico (int array[] , int posiciones, int direccion) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Cuantas veces quieres mover las posiciones del array: ");
		posiciones = sc.nextInt();
		System.out.print("Y en que direccion (derecha = 0 , izquierda = 1): ");
		direccion = sc.nextInt();
		int num , aux;
		
		for (int i = 0; i < posiciones; i++) {
			if (direccion == 0) {
				aux = array[4];
				for (int j = 0; j < array.length; j++) {
					num = array[j] ;
					array[j] = aux ;
					
					aux = num ;
				}
			}
			else if (direccion == 1) {
				aux = array[0];
				for (int j = array.length; j > 0; j--) {
					num = array[j-1] ;
					array[j-1] = aux ;
					
					aux = num ;
				}
			}
		}
		
	}

}
