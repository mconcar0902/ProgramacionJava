package Capitulo_02_condicionales_Ejercicios_Bloque01;

import java.util.Scanner;

public class Ejercicio_02_PideDosNumerosMuestaElMenor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero: ");
		int num = sc.nextInt();
		
		System.out.println("Escribe otro numero: ");
		int num1 = sc.nextInt();
		
		if (num < num1) {
			System.out.println("El numero menor es " + num );
		}
		else if (num > num1) {
			System.out.println("El numero menor es " + num1);
		}

	}

}
