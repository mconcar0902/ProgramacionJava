package capitulo02_condicionales.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio02_Acumuladores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int numneg = 0;
		int numbaj = 0;
		int nummed = 0;
		int numgran = 0;
		
		System.out.print("Escribe el primer numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + 1 ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + 1 ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + 1 ;
		}
		else if (num > 250) {
			numgran = numgran + 1 ;
		}
		
		System.out.print("Escribe el segundo numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + 1 ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + 1 ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + 1 ;
		}
		else if (num > 250) {
			numgran = numgran + 1 ;
		}

		System.out.print("Escribe el tercer numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + 1 ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + 1 ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + 1 ;
		}
		else if (num > 250) {
			numgran = numgran + 1 ;
		}
		
		System.out.print("Escribe el cuarto numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + 1 ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + 1 ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + 1 ;
		}
		else if (num > 250) {
			numgran = numgran + 1 ;
		}
		
		System.out.print("Escribe el quinto numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + 1 ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + 1 ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + 1 ;
		}
		else if (num > 250) {
			numgran = numgran + 1 ;
		}
		
		System.out.println();
		System.out.println("Has escrito " + numneg + " numeros negativos.");
		System.out.println("Has escrito " + numbaj + " numeros bajos.");
		System.out.println("Has escrito " + nummed + " numeros medios.");
		System.out.println("Has escrito " + numgran + " numeros grandes.");
	}

}
