package capitulo04_array.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio03_PideCadenaCompruebaSiEsPalindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.next();
		muestraLaCadenaInversa(str);
		
		if (compruebaSiEsPalindromo(str)) {
			System.out.println("\nLa palabra " + str + " es un palindromo.");
		}
		else {
			System.out.println("\nLa palabra " + str + " no es un palindromo.");
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static void muestraLaCadenaInversa(String str) {
		System.out.print("La palabra del reves es: ");
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}	
	}
	
	/**
	 * 
	 * @param str
	 */
	public static boolean compruebaSiEsPalindromo(String str) {
		int pos = 0;
		boolean palindromo = true;
		
		for (int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(pos) != str.charAt(i)) {
				palindromo = false;
			}
			pos = pos + 1 ;
		}
		return palindromo;
	}
		

}
