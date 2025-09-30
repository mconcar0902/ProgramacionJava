package Capitulo_02_condicionales_Ejercicios_Bloque01;

import java.util.Scanner;

public class Ejercicio_03_PideCincoNumerosMuestraElMayor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer numero: ");
		int mayor = sc.nextInt();

		System.out.println("Escribe el segundo numero: ");
		int num = sc.nextInt();
		
		if (mayor < num) {
			mayor = num ;
		}
		
		System.out.println("Escribe el tercer numero: ");
		num = sc.nextInt();
		
		if (mayor < num) {
			mayor = num ;	
		}
		System.out.println("Escribe el cuarto numero: ");
		num = sc.nextInt();	
		
		if (mayor < num) {
			mayor = num ;	
		}
		System.out.println("Escribe el quinto numero: ");
		num = sc.nextInt();
		
		System.out.println("El numero mayor es " + mayor );
	}

}
