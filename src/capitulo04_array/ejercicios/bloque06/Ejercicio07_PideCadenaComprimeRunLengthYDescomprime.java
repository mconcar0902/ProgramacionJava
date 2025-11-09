package capitulo04_array.ejercicios.bloque06;

import java.util.Scanner;

public class Ejercicio07_PideCadenaComprimeRunLengthYDescomprime {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
		 System.out.print("Escribe una cadena sin espacios: ");
		 String str = sc.nextLine();
		 
		 String codificada = comprimirRunLength(str);
		 System.out.println("La cadena codificada por Run-Length es:  " + codificada);
		 
		 String descodificada = descomprimirRunLength(codificada);
		 System.out.println("La cadena descodificada es: " + descodificada);
	}
	
	/**
	 * 
	 * 
	 */
	public static String comprimirRunLength(String str) {
		int num = 1;
		String codificada = "";
		
		for (int i = 0; i < str.length() -1; i++) {
			
			if (str.charAt(i) == str.charAt(i + 1)) {
				num += 1;
			}
			else {
				codificada += num;
				codificada += str.charAt(i);
				num = 1;
			}
		}
		codificada += num;
		codificada += str.charAt(str.length() -1);
				
		return codificada;
	} 
	
	/**
	 * 
	 * 
	 */
	public static String descomprimirRunLength(String codificada) {
		String descodificada = "";
		
		for (int i = 0; i < codificada.length(); i += 2) {
			int rep = codificada.charAt(i) - '0';
			char letra = codificada.charAt(i + 1);
			
			for (int j = 0; j < rep; j++) {
				descodificada += letra;
			}
		}
		return descodificada; 
	}
}
