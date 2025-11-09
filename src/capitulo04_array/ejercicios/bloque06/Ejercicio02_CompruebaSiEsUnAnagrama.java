package capitulo04_array.ejercicios.bloque06;

import java.util.Scanner;

public class Ejercicio02_CompruebaSiEsUnAnagrama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str1 = sc.nextLine();
		System.out.print("Escribe una cadena de caracteres: ");
		String str2 = sc.nextLine();
		
		str1 = cambiaLasMayusculasPorMinusculas(str1);
		str2 = cambiaLasMayusculasPorMinusculas(str2);
		
		boolean esAnagrama = compruebaSiEsAnagrama(str1, str2);
		if (esAnagrama) {
			System.out.println(str1 + " y " + str2 + ", son un anagrama.");
		}
		else {
			System.out.println(str1 + " y " + str2 + ", no son un anagrama.");
		}
	}
	
	/**
	 * 
	 * 
	 */
	 public static String cambiaLasMayusculasPorMinusculas(String str) {
			String str2 = "";
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'  ) {
					 str2 += (char) (str.charAt(i) + 32);
				}
				else {
					str2 += str.charAt(i);
				}
			}
			return str2;
		}

	 /**
	 * 
	 * 
	 */
	 public static boolean compruebaSiEsAnagrama(String str1 , String str2) {
		
		boolean esAnagrama = true;
		for (int i = 0; i < str1.length(); i++) {
			char actual = str1.charAt(i);
			
			if (str2.indexOf(actual) == -1) {
				esAnagrama = false;
				break;
			}
		} 
		 
		return esAnagrama;	 
		}
}
