package capitulo02_condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio01_ClasisficaLaNotaDelAlumno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce la nota del alumno: ");
		int nota = sc.nextInt();
		
		switch (nota) {
		case 0:
		case 1:
			System.out.println("Muy deficiente"); 
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Esa nota no es posible.");
		}
		
	}

}
