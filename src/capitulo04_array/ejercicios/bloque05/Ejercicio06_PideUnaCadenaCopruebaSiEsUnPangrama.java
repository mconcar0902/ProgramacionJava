package capitulo04_array.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio06_PideUnaCadenaCopruebaSiEsUnPangrama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();
		
		str = cambiaLasMayusculasPorMinusculas(str);
		
		 boolean es = compruebaSiEsPangrama(str);
		
		if (es) {
			System.out.println(str + " es un pangrama.");
		}
		else {
			System.out.println(str + " no es un pangrama.");
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
	public static boolean compruebaSiEsPangrama(String str) {
		boolean[] encontradas = new boolean[26];
		String letras ="abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			for (int j = 0; j < letras.length(); j++) {
				if (c == letras.charAt(j)) {
                    encontradas[j] = true;
                    break;
				}
			}
		}
		
		for (int i = 0; i < encontradas.length; i++) {
		    if (!encontradas[i]) {
		        return false;
		    }
		}
		return true;	
	}

}
