package capitulo01.bloque01;

import java.util.Scanner;

public class Ejercicio01_PidoTresNumerosImprimoEnConsola {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero de tipo entero: ");
		int NumEntero = sc.nextInt();
		
		System.out.print("Escribe un numero de tipo flotante: ");
		float NumFlotante = sc.nextFloat(); 
		
		System.out.print("Escribe un numero de tipo doble: ");
		double NumDoble = sc.nextDouble();
		
		System.out.println("El numero entero es " + NumEntero + ", el numero flotante es "+ NumFlotante + " y el numero doble es "+ NumDoble+".");
		
	}

}
