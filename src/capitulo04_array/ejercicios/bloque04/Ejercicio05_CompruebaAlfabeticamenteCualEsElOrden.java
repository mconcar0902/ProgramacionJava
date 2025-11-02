package capitulo04_array.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio05_CompruebaAlfabeticamenteCualEsElOrden {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String string1 = sc.nextLine();
		System.out.print("Escribe otra cadena de caracteres: ");
		String string2 = sc.nextLine();
		
		int resultado = ordenAlfabeticoDeDosCadenas(string1, string2);
		
		if (resultado == -1) {
			System.out.println("La primera cadena es menor que la segunda.");
		}
		else if (resultado == 1) {
			System.out.println("La segunda cadena es menor que la primera.");
		}
		else {
			System.out.println("Las dos cadenas son iguales.");
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static int ordenAlfabeticoDeDosCadenas(String string1 , String string2) {
		
		int min = Math.min(string1.length(), string2.length());
		int ord ;
		
		for (int i = 0; i < min ; i++) {
			if(string1.charAt(i) != string2.charAt(i)) {
				if (string1.charAt(i) > string2.charAt(i)) {
					ord = 1;
					return ord;
				}
				else if (string1.charAt(i) < string2.charAt(i)) {
					ord = -1;
					return ord;
				}
			}
		}
		return 0;

	}

}
