package capitulo04_array.ejercicios.bloque06;

import java.util.Scanner;

public class Ejercicio06_SubcadenaMasLargaSinCaracteresRepetidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena: ");
		String str = sc.nextLine();
		
		String mayor = buscarSubcadenaMayor(str);
		System.out.println("La cadena mayor es " + mayor + " y tiene " + mayor.length() + " caracteres sin repetirse.");

	}
	/**
	 * 
	 * 
	 */
	public static String buscarSubcadenaMayor(String str) {
		String mayor = "";
		String actual = "";
 		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (actual.indexOf(c) != -1) {
				if (actual.length() > mayor.length()) {
					mayor = actual;
				}
				actual = "" + c ;
			}
			else {
				actual += c;
			}
		}
		if (actual.length() > mayor.length()) {
			mayor = actual;
		}
		return mayor;
	}
}
