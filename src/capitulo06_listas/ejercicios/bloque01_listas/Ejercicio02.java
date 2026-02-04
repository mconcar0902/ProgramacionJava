package capitulo06_listas.ejercicios.bloque01_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<String>(); 
		List<String> copiado = new ArrayList<String>();
		
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
				añadeLinea(lista);
				break;
			case 2:
				insertarLinea(lista);
				break;
			case 3:
				editarLinea(lista);
				break;
			case 4:
				borrarLinea(lista);
				break;
			case 5:
				copiado = cortarLinea(lista);
				break;
			case 6:
				pegarLinea(lista, copiado);
				break;
			case 7:
				imprimirLinea(lista);
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
						+ "1.Añadir linea al fichero.\n"
						+ "2.Insertar una linea.\n"
						+ "3.Editar linea.\n"
						+ "4.Eliminar linea.\n"
						+ "5.Cortar conjunto de lineas.\n"
						+ "6.Pegar conjunto de lineas.\n"
						+ "7.Imprimir lista.\n"
						+ "0.Abandonar el programa.\n");
			
	}

	
	/**
	 * 
	 * @param lista
	 */
	public static void añadeLinea(List<String> lista) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una linea para añadirla: ");
		String linea = sc.next();
		
		lista.add(lista.size(), linea);
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void insertarLinea(List<String> lista) {
		Scanner sc = new Scanner(System.in);
		
		imprimirLinea(lista);
		
		System.out.print("Escribe una linea para añadirla: ");
		String linea = sc.nextLine();
		System.out.print("Escribe la posicion en la que quieres que se inserte: ");
		int pos = sc.nextInt();
		
		lista.add(pos, linea);
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void editarLinea(List<String> lista) {
		Scanner sc = new Scanner(System.in);
		
		imprimirLinea(lista);
		
		System.out.print("Que linea quieres editar: ");
		int pos = sc.nextInt();
		
		System.out.print("Escribe una linea nueva: ");
		String linea = sc.nextLine();
		
		lista.remove(pos);
		lista.add(pos, linea);
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static void borrarLinea(List<String> lista) {
		Scanner sc = new Scanner(System.in);
		
		imprimirLinea(lista);
		
		System.out.print("Que linea quieres borrar: ");
		int pos = sc.nextInt();
		lista.remove(pos);
	}
	
	
	/**
	 * 
	 * @param lista
	 */
	public static List<String> cortarLinea(List<String> lista) {
		Scanner sc = new Scanner(System.in);
		
		imprimirLinea(lista);
		
		System.out.print("Cual es la primera linea que quieres cortar: ");
		int pos1 = sc.nextInt();
		System.out.print("Cual es la linea hasta la que quieres cortar: ");
		int pos2 = sc.nextInt();

		List<String> copiado = new ArrayList<String>();
		for (int i = pos1; i <= pos2; i++) {
			copiado.add(lista.get(i));
		}
		return copiado;
	}
	
	/**
	 * 
	 * @param lista
	 */
	public static void imprimirLinea(List<String> lista) {
		System.out.println("La lista es: ");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + ".  " + lista.get(i));
		}
		
	}
	
	/**
	 * 
	 * @param lista
	 * @param copiado
	 */
	public static void pegarLinea(List<String> lista, List<String> copiado) {
		Scanner sc = new Scanner(System.in);
		
		imprimirLinea(lista);
		
		System.out.print("En que linea lo quieres pegar: ");
		int pos = sc.nextInt();
		int j = 0;
		
		for (int i = pos; i < (pos + copiado.size()); i++) {
			lista.add(i, copiado.get(j));
			j++;
		}
	}
	
	
	
}
