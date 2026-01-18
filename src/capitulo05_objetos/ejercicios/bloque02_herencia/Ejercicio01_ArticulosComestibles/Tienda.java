package capitulo05_objetos.ejercicios.bloque02_herencia.Ejercicio01_ArticulosComestibles;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		
		Perecedero perecederos[] = new Perecedero[2];
		NoPerecedero noPerecederos[] = new NoPerecedero[2];
		
		System.out.println("Articulos Perecederos");
		creaArticulosPerecederos(perecederos);
		System.out.println("\nArticulos No Perecederos");
		creaArticulosNoPerecederos(noPerecederos);
		
		System.out.println("Articulos Perecederos");
		mostrarArticulos(perecederos);
		System.out.println("Articulos No Perecederos");
		mostrarArticulos(noPerecederos);

	}
	
	public static void creaArticulosPerecederos(Perecedero perecederos[]) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < perecederos.length; i++) {
			System.out.print("\nIntroduce nombre del articulo: ");
			String nombre = sc.nextLine();
			
			System.out.print("\nIntroduce el codigo del articulo (numero entero): ");
			int cod = sc.nextInt();
			
			System.out.print("\nIntroduce el precio del articulo (numero entero): ");
			int precio = sc.nextInt();
			
			System.out.print("\nIntroduce la fecha de caducidad (12052026): ");
			int fecha = sc.nextInt();
			
			perecederos[i] = new Perecedero(nombre, cod, precio, fecha);
		}
	}
	
	public static void creaArticulosNoPerecederos(NoPerecedero noPerecederos[]) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < noPerecederos.length; i++) {
			System.out.print("\nIntroduce nombre del articulo: ");
			String nombre = sc.nextLine();
			
			System.out.print("\nIntroduce el codigo del articulo (numero entero): ");
			int cod = sc.nextInt();
			
			System.out.print("\nIntroduce el precio del articulo (numero entero): ");
			int precio = sc.nextInt();
			
			noPerecederos[i] = new NoPerecedero(nombre, cod, precio);
		}
	}
	
	public static void mostrarArticulos(Articulo articulos[]) {
		for (int i = 0; i < articulos.length; i++) {
			articulos[i].toString();
		}
	}

}
