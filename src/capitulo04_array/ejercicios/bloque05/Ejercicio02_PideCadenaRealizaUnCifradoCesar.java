package capitulo04_array.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio02_PideCadenaRealizaUnCifradoCesar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de caracteres: ");
		String str = sc.nextLine();
		
		System.out.print("Escribe con cuantos numeros quieres cifrar la cadena: ");
		int num = sc.nextInt();
		
		System.out.println("La cadena cifrada es: " + cifradoDeLaCadena(cambiaLasMayusculasPorMinusculas(str), num));

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
	public static String cifradoDeLaCadena(String str , int num) {
		String cadenaCifrada = "";
		for (int i = 0; i < str.length(); i++) {
			if((str.charAt(i) + num) <= 122) {
				cadenaCifrada = cadenaCifrada + ((char) (str.charAt(i) + num));
			}
			else {
				int dif = (str.charAt(i) + num) - 122 ;
				cadenaCifrada = cadenaCifrada + ((char) (96 + dif));
			}
		}
		return cadenaCifrada;
	}

}
