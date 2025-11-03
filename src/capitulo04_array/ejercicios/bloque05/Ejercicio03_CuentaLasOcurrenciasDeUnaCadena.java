package capitulo04_array.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio03_CuentaLasOcurrenciasDeUnaCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str1 = sc.nextLine();
		
		System.out.print("Escribe una subcadena: ");
		String str2 = sc.nextLine();
		
		buscaLasOcurrenciasEnLaCadena(str1, str2);
	}
	
	/**
	 * 
	 * 
	 */
	public static void buscaLasOcurrenciasEnLaCadena(String str1 , String str2) {
		boolean ocurrencia ;
		int cont = 0 ;
		
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				for (int j = 1; j < str2.length(); j++) {
					if (str1.charAt(i + j) == str2.charAt(j)) {
						ocurrencia = true ;
					}
					else {
						ocurrencia = false;
						break;
					}
				}
				if(ocurrencia = true) {
					cont = cont + 1;
					i = i + str2.length();
				}
			}
		}
		System.out.println(str2 + " aparece " + cont + " veces.");
	}
	

}
