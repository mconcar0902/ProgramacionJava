package capitulo04_array.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio01_LeeStringInvierteLaCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();
		
		muestraLaCadena(str);
		invierteLaCadena(str);
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraLaCadena(String str) {
		
		System.out.println("La cadena es : " + str);
	}
	
	/**
	 * 
	 * 
	 */
	public static void invierteLaCadena(String str) {

		System.out.print("La cadena es: ");
		for (int i = str.length()-1 ; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
