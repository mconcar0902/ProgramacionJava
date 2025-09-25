package Ejercicios_Bloque_01;

import java.util.Scanner;

public class Ejercicio04_PideTresNumerosHaceLaMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer numero entero: ");
		int Num1 = sc.nextInt();
		
		System.out.print("Escribe el segundo numero entero: ");
		int Num2 = sc.nextInt();
		
		System.out.print("Escribe el tercer numero entero: ");
		int Num3 = sc.nextInt();
		
		System.out.println("La media de los tres numeros es " + (Num1+Num2+Num3)/3);
		
	}

}
