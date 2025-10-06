package capitulo02_condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio03_CalculadoraArea {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("MENU\n"
				+ "1. Cálculo de la hipotenusa de un triángulo.\n"
				+ "2. Cálculo de la superficie de una circunferencia.\n"
				+ "3. Cálculo del perímetro de una circunferencia.\n"
				+ "4. Cálculo del área de un rectángulo.\n"
				+ "5. Cálculo del área de un triángulo.\n"
				+ "Seleccione la opcion deseada: ");
		int opc = sc.nextInt();
		
		System.out.println();
		
		switch (opc) {
		case 1:
			System.out.println("Hipotenusa de un triángulo");
			System.out.print("Escribe el primer cateto: ");
			double cat1 = sc.nextDouble();
			
			System.out.print("Escribe el primer cateto: ");
			double cat2 = sc.nextDouble();
			
			System.out.println();
			System.out.println("La hipotenusa del triangulo es " + Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2, 2)));
			
			break;
		case 2:
			System.out.println("Superficie de una circunferencia");
			System.out.print("Escribe la longitud del radio: ");
			double rad = sc.nextDouble();
			
			System.out.println();
			System.out.println("El area de la circunferencia es " + (3.1416 * (Math.pow(rad, 2))) );
			
			break;
		case 3:
			System.out.println("Perímetro de una circunferencia");
			System.out.print("Escribe la longitud del radio: ");
			rad = sc.nextDouble();
			
			System.out.println("El perimetro de la circunferencia es " + (2 * 3.1416 * rad));
			
			break;
		case 4:
			System.out.println("Area de un rectángulo");
			System.out.print("Escribe la longitud de la base: ");
			double base = sc.nextDouble();
			
			System.out.print("Escribe la altura del rectangulo: ");
			double altura = sc.nextDouble();
			
			System.out.println("El area del rectangulo es " + (base * altura));
			
			break;
		case 5:
			System.out.println("Area de un triangulo");
			System.out.print("Escribe la longitud de la base: ");
			base = sc.nextDouble();

			System.out.print("Escribe la altura del triangulo: ");
			altura = sc.nextDouble();
			
			System.out.println("El area del rectangulo es " + ((base * altura) / 2));
			
			break;
		default:
			System.out.println("Esa opcion no es posible.");
			break;
		}
		
	}

}