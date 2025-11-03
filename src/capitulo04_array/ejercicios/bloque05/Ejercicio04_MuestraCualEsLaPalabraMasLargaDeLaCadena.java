package capitulo04_array.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio04_MuestraCualEsLaPalabraMasLargaDeLaCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();

		String palabraMasGrande = cuentaElNumeroDeLetras(str);
		
		
		System.out.print("\nLa palabra mas grande es " + palabraMasGrande);
		System.out.print(" tiene " + palabraMasGrande.length() + " letras.");
		
	}

	/**
	 * 
	 * 
	 */
	public static String cuentaElNumeroDeLetras(String str) {
		String palabraActual = "";
        String palabraMax = "";
        int longMax = 0;

		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (c != ' ' ) {
				palabraActual = palabraActual + c;
			}
			else {
				if (palabraActual.length() > longMax ) {
					longMax = palabraActual.length();
					palabraMax = palabraActual;
				}
				palabraActual = "";
			}
		}
		
		if (palabraActual.length() > longMax) {
            palabraMax = palabraActual;
        }
		return palabraMax;

	}

}
