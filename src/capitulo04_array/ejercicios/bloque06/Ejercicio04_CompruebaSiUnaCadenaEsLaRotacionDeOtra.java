package capitulo04_array.ejercicios.bloque06;


import java.util.Scanner;

public class Ejercicio04_CompruebaSiUnaCadenaEsLaRotacionDeOtra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str1 = sc.nextLine();
		
		System.out.print("Escribe otra cadena de caracteres: ");
		String str2 = sc.nextLine();
		str1 = cambiaLasMayusculasPorMinusculas(str1);
		str2 = cambiaLasMayusculasPorMinusculas(str2);
		
		boolean es = compruebaSiLasCadenasEstanEnLaMismaPosicion(str1, str2);
		if(es == true) {
			System.out.println("Es la misma cadena pero rotada.");
		}
		else {
			System.out.println("No es la misma cadena.");
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static boolean compruebaSiLasCadenasEstanEnLaMismaPosicion(String str1 , String str2) {
		boolean es = false;
		if(str1.length() == str2.length()) {            // Comprueba si son iguales
			for (int i = 0; i < str1.length(); i++) {  // Veces que se tiene que rotar la cadena
				str2 = desplazaCiclicoDerecha(str2);
				es = true;
				for (int j = 0; j < str1.length(); j++) {   // Comprobar cada rotacion completa
					if (str1.charAt(j) != str2.charAt(j)) {
						es = false;
						break;
					}
				}
				if (es == true) {
					return es;
				}
			}
		}
		return es;
	}
	
	/**
	 * 
	 * 
	 */
	public static String desplazaCiclicoDerecha (String str2) {
		char letra;
		String str = "";
		char aux = str2.charAt(str2.length() -1);
		str += aux;
		
		for (int i = 0; i < str2.length() - 1; i++) {
			letra = str2.charAt(i);
			str += letra;
		}
		
		return str;
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
