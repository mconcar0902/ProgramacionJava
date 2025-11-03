package capitulo04_array.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio05_InvierteLasPalabrasDeLaCadenaPeroNoCambiaElOrden {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();

		String cadenaInvertida = InvierteLasPalabras(str);
		
		System.out.println("La cadena es: " + str);
		System.out.println("La cadena invertida es: " + cadenaInvertida);
	}
	
	/**
	 * 
	 * 
	 */
	public static String InvierteLasPalabras(String str) {
		String palabrasInvertidas = "" ;
		String palabraActual = "" ;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ') {
				palabraActual += c;
			}
			else {
				for (int j = palabraActual.length() - 1; j >= 0; j--) {
					palabrasInvertidas = palabrasInvertidas + palabraActual.charAt(j);
				}
				palabraActual = "";
				palabrasInvertidas = palabrasInvertidas + " ";
			}
		}
		
		for (int i = palabraActual.length() - 1; i >= 0; i--) {
			palabrasInvertidas = palabrasInvertidas + palabraActual.charAt(i);
		}
		
		return palabrasInvertidas;
	}

}
