package capitulo02_condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio02_CalculadoraAvanzada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("MENU\n"
				+ "1. Raices\n"
				+ "2. Potencia\n"
				+ "3. Modulo de la division\n"
				+ "Seleccione la opcion deseada: ");
		int opc = sc.nextInt();
		
		System.out.println();
		
		switch (opc) {
		case 1:
			System.out.println("Raices");
			
			System.out.print("Dame el primer numero: ");
			double num1 = sc.nextDouble();
			
			System.out.println();
			System.out.println("La raiz de " + num1 + " es " + (Math.sqrt(num1)));
			
			break;
		case 2:
			System.out.println("Potencias");
			System.out.print("Dame el primer numero: ");
			num1 = sc.nextDouble();
			
			System.out.print("Dame el segundo numero: ");
			double num2 = sc.nextDouble();
			
			System.out.println();
			System.out.println("La potencia de " + num1 + " y " + num2 + " es " + (Math.pow(num1, num2)));
			
			break;
		case 3:
			System.out.println("Modulo de divicion");
			System.out.print("Dame el primer numero: ");
			num1 = sc.nextDouble();
			
			System.out.print("Dame el segundo numero: ");
			num2 = sc.nextDouble();
			
			System.out.println();
			System.out.print("El resto de la divicion de " +  num1 + " y " + num2 + " es " + (num1 % num2));
			
			break;
		default:
			System.out.println("Esa opcion no es posible.");
			break;
		}
		
	}

}
