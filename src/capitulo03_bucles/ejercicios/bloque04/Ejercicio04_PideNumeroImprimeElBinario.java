package capitulo03_bucles.ejercicios.bloque04;

import java.util.Scanner;

public class Ejercicio04_PideNumeroImprimeElBinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un numero positivo: ");
		int num = sc.nextInt();
		
		String binario = "";
		
		while (num > 0) {
			int resto;
			resto = num % 2;
			binario = resto + binario;
			num = num / 2;
			
		}
	
		System.out.println("El numero binario es " + binario);
			
	}

}
