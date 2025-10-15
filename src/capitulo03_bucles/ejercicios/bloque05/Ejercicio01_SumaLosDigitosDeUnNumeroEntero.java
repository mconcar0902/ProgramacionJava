package capitulo03_bucles.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio01_SumaLosDigitosDeUnNumeroEntero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero entero para sumar sus digitos: ");
		int num = sc.nextInt();
		int suma = 0;
		
		for (int i = 0; i <= 10; i++) {
			suma += num % 10 ;
			num = num / 10 ;
		}
		
		System.out.println(suma);

	}

}
