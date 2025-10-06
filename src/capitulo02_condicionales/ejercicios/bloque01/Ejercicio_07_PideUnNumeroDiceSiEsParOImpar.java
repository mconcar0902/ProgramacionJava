package capitulo02_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio_07_PideUnNumeroDiceSiEsParOImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
		int num = sc.nextInt();
		
		if ((num & 1) == 0) {
			System.out.println("El numero " + num + " es par.");
		}
		else if ((num & 1) == 1) {
			System.out.println("El numero " + num + " es impar.");
		}
	}

}
