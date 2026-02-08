package capitulo06_coleccionesDeDatos.ejercicios.bloque01_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<Integer>(); 
		
		int opc;
		
		do {
			menu();
			System.out.print("Elije una opcion: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			case 1:
				crearLista(lista);
				break;
			case 2:
				sumaYMedia(lista);
				maxYMin(lista);
				break;
			case 3:
				añadeALaLista(lista);
				break;
			case 4:
				eliminarDeLalista(lista);
				break;
			case 5:
				imprimirLista(lista);
				break;

			default:
				System.out.println("Esa opcion no es posible");
				break;
			}
			
		} while (opc != 0);
		
	}
	
	
	/**
	 * 
	 * 
	 */
	public static void menu() {
		System.out.println("\nMenu del programa\n"
						+ "-----------------\n"
						+ "1.Crea la lista con valores aleatorios.\n"
						+ "2.Calcula la suma, media, mayor y menor.\n"
						+ "3.Agrega nuevos valores.\n"
						+ "4.Elimina elementos de la lista.\n"
						+ "5.Imprimir lista.\n"
						+ "0.Abandonar el programa.\n");
			
	}

	
	/**
	 * 
	 * @param lista
	 */
	public static void crearLista(List<Integer> lista) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Cual quieres que sea el tamaño de la lista: ");
		int tamaño = sc.nextInt();
		System.out.print("Cual quieres que sea el numero menor del rango: ");
		int min = sc.nextInt();
		System.out.print("Cual quieres que sea el numero mayor del rango: ");
		int max = sc.nextInt();
		
		lista.clear();

		for (int i = 0; i < tamaño; i++) {
			Integer num = rand.nextInt(min,max);
			lista.add(i, num); 
		}
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void imprimirLista(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("numero "+ (i + 1) + " : " + lista.get(i).intValue()); 
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param lista
	 */
	public static void sumaYMedia(List<Integer> lista) {
		int suma = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i).intValue();
		}
		System.out.println("La suma de los valores es " + suma);
		
		int media = suma / lista.size();  
		System.out.println("La media es " + media);
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void maxYMin(List<Integer> lista) {
		int max = lista.get(1).intValue(); int min = lista.get(1).intValue();
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).intValue() > max) {
				max = lista.get(i).intValue();
			}
			else if (lista.get(i).intValue() < min) {
				min = lista.get(i).intValue();
			}
		}
		System.out.println("El numero mayor de la lista es " + max +
				"\nEl numero menor de la lista es " + min);
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void añadeALaLista(List<Integer> lista) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Cuanto quieres añadir a la lista: ");
		int tamaño = sc.nextInt();
		System.out.print("Cual quieres que sea el numero menor del rango: ");
		int min = sc.nextInt();
		System.out.print("Cual quieres que sea el numero mayor del rango: ");
		int max = sc.nextInt();

		for (int i = lista.size(); i < (lista.size() + tamaño); i++) {
			Integer num = rand.nextInt(min,max);
			lista.add(i, num); 
		}
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void eliminarDeLalista(List<Integer> lista) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("numero "+ i + " : " + lista.get(i).intValue()); 
		}
		
		System.out.print("\nCual es el primer numero desde el que empezar a eliminar: ");
		int num1 = sc.nextInt();
		System.out.print("\nHasta cual quieres que borre: ");
		int num2 = sc.nextInt();
		
		for (int i = num1; i < (num2 - num1); i++) {
			lista.remove(i); 
		}
	}
	
}
