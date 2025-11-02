package capitulo04_array.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio02_CuentaLasVocalesYLasConsonantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str1 = sc.nextLine();
		
		cuentaLasVocalesYConsonantes(str1);
		
	}
	
	/**
	 * 
	 * 
	 */
	public static void cuentaLasVocalesYConsonantes(String str1) {
		String str2 = "aeiouAEIOU";
		int numVocal = 0;
		
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < str1.length(); j++) {
				if(str2.charAt(i) == str1.charAt(j)) {
					numVocal = numVocal + 1;
				}
			}
		}
		System.out.println("El numero de vocales es " + numVocal);
		System.out.println("El numero de consonantes es " + (str1.length() - numVocal));
	}

}
