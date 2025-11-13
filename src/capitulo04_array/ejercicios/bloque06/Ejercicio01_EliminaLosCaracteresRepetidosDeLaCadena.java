package capitulo04_array.ejercicios.bloque06;

import java.util.Scanner;

public class Ejercicio01_EliminaLosCaracteresRepetidosDeLaCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();
		
		str = cambiaLasMayusculasPorMinusculas(str);
		
		String cadenaSinRepetidos = eliminaLosRepetidos(str);
		System.out.println("Esta es la cadena sin caracteres repetidos: " + cadenaSinRepetidos);
		
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
	public static String eliminaLosRepetidos(String str) {
		String resultado = "";
		
		for (int i = 0; i < str.length(); i++) {
			char actual = str.charAt(i);
			
			if (resultado.indexOf(actual) == -1) {
				resultado = resultado + actual ;
			}
		}
		return resultado;
	}
}
