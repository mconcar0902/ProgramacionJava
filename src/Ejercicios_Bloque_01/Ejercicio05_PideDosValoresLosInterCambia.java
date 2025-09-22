package Ejercicios_Bloque_01;

import java.util.Scanner;

public class Ejercicio05_PideDosValoresLosInterCambia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String Palabra1 ;
		String Palabra2 ;
		String Intercambio ;
		
		
		System.out.print("Esciba la primera palabra: ");
		Palabra1 = sc.nextLine();
		
		System.out.print("Escriba la segunda palabra: ");
		Palabra2 = sc.nextLine();
		
		System.out.println("Las palabras son " + Palabra1 + " y " + Palabra2 + ".");
		
	    Intercambio = Palabra1 ;
		Palabra1 = Palabra2 ;
		Palabra2 = Intercambio ; 
		
		System.out.println("Las palabras son " + Palabra1 + " y " + Palabra2 + ".");
		
	}

}
