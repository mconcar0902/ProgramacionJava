package capitulo04_array.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio06_CambiaLasMayusculasPorMinusculasEnUnaCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();
		System.out.println("La cadena nueva es " + cambiaLasMayusculasPorMinusculas(str));
		
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
	

}
