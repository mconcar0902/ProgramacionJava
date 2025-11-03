package capitulo04_array.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio01_EliminaLosEspaciosDeLaCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();
		
		System.out.println(eliminaLosEspacios(str));

	}
	
	/**
	 * 
	 * 
	 */
	public static String eliminaLosEspacios(String str) {
		String cadenaSinEspacios = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				cadenaSinEspacios = cadenaSinEspacios + str.charAt(i);
			}
		}
		return cadenaSinEspacios;
	}

}
