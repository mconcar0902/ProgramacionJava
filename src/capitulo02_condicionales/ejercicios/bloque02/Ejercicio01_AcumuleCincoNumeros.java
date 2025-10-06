package capitulo02_condicionales.ejercicios.bloque02;

import java.util.Scanner;

public class Ejercicio01_AcumuleCincoNumeros {

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
			numneg = numneg + num ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + num ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + num ;
		}
		else if (num > 250) {
			numgran = numgran + num ;
		}
		
		System.out.print("Escribe el segundo numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + num ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + num ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + num ;
		}
		else if (num > 250) {
			numgran = numgran + num ;
		}
		
		System.out.print("Escribe el tercero numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + num ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + num ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + num ;
		}
		else if (num > 250) {
			numgran = numgran + num ;
		}
		
		System.out.print("Escribe el cuarto numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + num ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + num ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + num ;
		}
		else if (num > 250) {
			numgran = numgran + num ;
		}
		
		System.out.print("Escribe el quinto numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			numneg = numneg + num ;
		}
		else if (num >= 0 && num <= 25) {
			numbaj = numbaj + num ;
		}
		else if (num >= 26 && num <= 250) {
			nummed = nummed + num ;
		}
		else if (num > 250) {
			numgran = numgran + num ;
		}
		
		System.out.println();
		System.out.println("La suma de los numeros negativos es " + numneg);
		System.out.println("La suma de los numeros bajos es " + numbaj);
		System.out.println("La suma de los numeros medios es " + nummed);
		System.out.println("La suma de los numeros grandes es " + numgran);
		
	}

}
