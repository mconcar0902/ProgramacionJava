package capitulo02_condicionales.ejercicios.bloque01;

import java.util.Scanner;

public class Ejercio_05_PideCincoNumerosMuestraMenorYMayor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menor = 0;
	
		System.out.print("Escriber el primer numero: ");
		int mayor = sc.nextInt();
		
		System.out.print("Escribe el segundo numero: ");
		int num = sc.nextInt();
		
		if (mayor < num) {
			menor = mayor ;
			mayor = num ;
		}
		else if (mayor > num) {
			menor = num ;
		}
		
		System.out.print("Escribe el tercer numero: ");
		num = sc.nextInt();
		
		if (mayor < num) {
			mayor = num ;
		}
		else if (menor > num) {
			menor = num ;
		}
		
		System.out.print("Escribe el cuarto numero: ");
		num = sc.nextInt();
		
		if (mayor < num) {
			mayor = num ;
		}
		else if (menor > num) {
			menor = num ;
		}
		
		System.out.print("Escribe el quinto numero: ");
		num = sc.nextInt();
		
		if (mayor < num) {
			mayor = num ;
		}
		else if (menor > num) {
			menor = num ;
		}
		
		System.out.println();
		System.out.println("El numero mayor es " + mayor);
		System.out.println("El numero menor es " + menor);
		

			

	}

}
