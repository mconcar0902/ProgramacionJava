package capitulo06_coleccionesDeDatos.ejercicios.bloque02_hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Articulo> hm = new HashMap<String, Articulo>();
		hm.put("1", new Articulo(001, 12, 2));
		hm.put("2", new Articulo(002, 1, 3));
		hm.put("3", new Articulo(003, 2, 5));
		
		int opc;
		
		do {
			menu();
			System.out.print("Elije una opcion: ");
			opc = sc.nextInt();
			
			switch (opc) {
			case 0:
				System.out.println("\nSaliendo del programa.");
				break;
			case 1:
				mostrarArticulos(hm);
				break;
			case 2:
				nuevoArticulo(hm);
				break;
			case 3:
				eliminaArticulo(hm);
				break;
			case 4:
				actualizarArticulo(hm);
				break;

			default:
				System.out.println("Esa opcion no es posible.");
				break;
			}
			
		} while (opc != 0);
		

	}

	
	/**
	 * 
	 * 
	 */
	public static void menu() {
		System.out.println("\nMenu del programa"
						+ "\n-----------------"
						+ "\n1.Lista de articulos."
						+ "\n2.Crear nuevo articulo."
						+ "\n3.Elimina un articulo."
						+ "\n4.Actualizar un articulo."
						+ "\n0.Salir.");
	}
	
	/**
	 * 
	 * @param hm
	 */
	public static void mostrarArticulos(HashMap<String, Articulo> hm) {
		System.out.println("\nEstos son los articulos disponibles.");
		
		for (Articulo art : hm.values()) {
			System.out.println(art);
		}
	}
	
	/**
	 * 
	 * @param hm
	 */
	public static void nuevoArticulo(HashMap<String, Articulo> hm) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nAñade un nuevo articulo."
				+ "\\nEscribe el codigo del producto: ");
		int cod = sc.nextInt();
		System.out.print("Escribe el numero del estante: ");
		int est = sc.nextInt();
		System.out.print("Escribe la cantidad de este producto: ");
		int cant = sc.nextInt();
		
		hm.put(String.valueOf(cod), new Articulo(cod,est,cant));
	}
	
	/**
	 * 
	 * @param hm
	 */
	public static void eliminaArticulo(HashMap<String, Articulo> hm) {
		Scanner sc = new Scanner(System.in);
		
		mostrarArticulos(hm);
		
		System.out.print("\nElimina un articulo."
				+ "\\nEscribe el codigo del producto que quieres eliminar: ");
		String cod = sc.nextLine();
		
		hm.remove(cod);
	}
	
	/**
	 * 
	 * @param hm
	 */
	public static void actualizarArticulo(HashMap<String, Articulo> hm) {
		Scanner sc = new Scanner(System.in);
		
		mostrarArticulos(hm);
		
		System.out.print("\nActualiza un articulo."
				+ "\nEscribe el codigo del producto que quieres actualizar: ");
		String cod = sc.nextLine();
		
		Articulo art = hm.get(cod);
		
		System.out.print("\nEscribe la estanteria donde esta el producto: ");
		int est = sc.nextInt();
		System.out.print("Escribe la cantidad de este producto: ");
		int cant = sc.nextInt();
		
		art.setNumCant(cant);
		art.setNumEstante(est);
		
		System.out.println(art);
		
	}
}
