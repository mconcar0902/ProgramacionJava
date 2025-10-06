package capitulo02_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio_02_PideDosNumerosMuestaElMenor {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero: ");
		int num = sc.nextInt();
		
		System.out.print("Escribe otro numero: ");
		int num1 = sc.nextInt();
		
		System.out.println();
		
		if (num < num1) {
			System.out.println("El numero menor es " + num );
		}
		else if (num > num1) {
			System.out.println("El numero menor es " + num1);
		}

	}

}
