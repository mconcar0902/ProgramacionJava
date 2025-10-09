package capitulo03_bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio01_SumaNumerosYSacaLaMediaHastaIntroducir0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		int rep = 0;
		
		System.out.print("Escribe un numero: ");
		int num = sc.nextInt();
		
		for (int i = 0 ; num != 0 ; i++) {
			
			suma = suma + num ;
			rep = rep + 1 ;
			
			System.out.print("Escribe otro numero: ");
			num = sc.nextInt();
		}
		
		System.out.println("La media de los numeros es " + (suma / rep) + " y la suma es " + suma );

	}

}
