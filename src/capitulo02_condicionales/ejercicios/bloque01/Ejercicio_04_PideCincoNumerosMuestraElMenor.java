package capitulo02_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercicio_04_PideCincoNumerosMuestraElMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer numero: ");
		int menor = sc.nextInt();

		System.out.print("Escribe el segundo numero: ");
		int num = sc.nextInt();
		
		if (menor > num) {
			menor = num ;
		}
		
		System.out.print("Escribe el tercer numero: ");
		num = sc.nextInt();
		
		if (menor > num) {
			menor = num ;	
		}
		System.out.print("Escribe el cuarto numero: ");
		num = sc.nextInt();	
		
		if (menor > num) {
			menor = num ;	
		}
		System.out.print("Escribe el quinto numero: ");
		num = sc.nextInt();
		
		System.out.println();
		System.out.println("El numero menor es " + menor );

	}

}
