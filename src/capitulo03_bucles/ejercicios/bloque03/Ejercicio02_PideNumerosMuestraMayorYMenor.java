package capitulo03_bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio02_PideNumerosMuestraMayorYMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el numero 1: ");
		int num = sc.nextInt();
		int mayor = num;
		int menor = num;
		
		for (int i = 1 ; num != 0 ; i++) {
			
			if (num > mayor) {
				mayor = num;
			}
			
			else if (num < menor){
				menor = num;
			}
			
			System.out.print("Escribe el numero " + (i + 1) + ": ");
			num = sc.nextInt();
			
			}
			System.out.println("El numero mayor es " + mayor + " y el menor es " + menor + ".");
		}
	}
