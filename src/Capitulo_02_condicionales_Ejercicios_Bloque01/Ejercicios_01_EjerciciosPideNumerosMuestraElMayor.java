package Capitulo_02_condicionales_Ejercicios_Bloque01;

import java.util.Scanner;

public class Ejercicios_01_EjerciciosPideNumerosMuestraElMayor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escibe el primer numero: ");
		int num = sc.nextInt();
		
		System.out.print("Escibe el segundo numero: ");
		int num1 = sc.nextInt();
		
		System.out.println();
		
		if (num > num1) {
			System.out.print("El numero mayor es " + num);
		}
		else if (num < num1){
			System.out.print("El numero mayor es " + num1);
		}
	}

}
