package capitulo04_array.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio04_PideCadenaCuentaNumeroPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();

		cuentasNumeroDePalabrasEnUnaCadena(str);
	}
	
	/**
	 * 
	 * 
	 */
	public static void cuentasNumeroDePalabrasEnUnaCadena(String str) {
		int cont = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) != ' ') {
				cont++;
			}
			
			else {
				if(str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
					cont++;
				}
			}
		}
		System.out.println("Numero de palabras " + cont);
	}

}
