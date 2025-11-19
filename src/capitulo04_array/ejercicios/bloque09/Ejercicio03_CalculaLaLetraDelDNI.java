package capitulo04_array.ejercicios.bloque09;

import java.util.Scanner;

public class Ejercicio03_CalculaLaLetraDelDNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char letras[] = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J'
				,'Z','S','Q','V','H','L','C','K','E'};
		
		System.out.print("Escribe el numero del DNI: ");
		int num = sc.nextInt();
		
		int pos = num % 23;
		
		System.out.println("La letra que le corresponde es " + letras[pos]);
	}
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";                 //Ejercicio echo con una cadena
//		
//		System.out.print("Escribe el numero del DNI: ");      
//		int num = sc.nextInt();
//		
//		int pos = num % 23;
//		
//		System.out.println("La letra que le corresponde es " + letras.charAt(pos));
//	}

}
