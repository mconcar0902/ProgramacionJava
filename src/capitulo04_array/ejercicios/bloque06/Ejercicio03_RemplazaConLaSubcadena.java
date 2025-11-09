package capitulo04_array.ejercicios.bloque06;

import java.util.Scanner;

public class Ejercicio03_RemplazaConLaSubcadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str1 = sc.nextLine();
		
		System.out.print("Escribe la ocurrencia que quieres buscar: ");
		String ocurrencia = sc.nextLine();
		
		System.out.print("Escribe una subcadena por la que se van a sustituir las ocurrencias: ");
		String subCad = sc.nextLine();

		String cadenaNueva = buscaLasOcurrenciasEnLaCadena(str1, ocurrencia, subCad);
		System.out.print("La nueva cadena es: " + cadenaNueva);
	}

	/**
	 * 
	 * 
	 */
	public static String buscaLasOcurrenciasEnLaCadena(String str1 , String str2 , String subCad) {
		boolean ocurrencia ;
		String cadenaNueva = "";
		
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
					cadenaNueva = cadenaNueva + subCad ;
					i = i + str2.length()-1;
				}
			}
			else {
				char c = str1.charAt(i);
				cadenaNueva = cadenaNueva + c ;
			}
		}
		return cadenaNueva;
	}
	
}
