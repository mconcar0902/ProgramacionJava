package capitulo06_coleccionesDeDatos.ejercicios.bloque03_listasYhashMap.Ejercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Alumno> lista = new ArrayList<Alumno>();
		HashMap<String, Alumno> hm = new HashMap<String, Alumno>();
		
		lista.add(0, new Alumno("11111111L", "Mario", 15));
		lista.add(1, new Alumno("22222222R", "Paco", 24));
		lista.add(2, new Alumno("33333333C", "Lucia", 19));
		
		añadirDeLaListaAlHashmap(lista, hm);
		
		mostrarAlumnos(hm);
		
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
				añadirAlumno(lista, hm);
				break;
			case 2:
				buscarAlumno(hm);
				break;
			case 3:
				eliminarAlumno(hm);
				añadirDelHashmapALaLista(lista, hm);
				break;

			default:
				System.out.println("Esa opcion no es posible.");
				break;
			}
			fin(lista, hm);
		} while (opc != 0);
		

	}
	
	/**
	 * 
	 */
	public static void menu() {
		System.out.println("\nMenu del centro"
				+ "\n---------------"
				+ "\n1.Añadir alumno."
				+ "\n2.Buscar alumno."
				+ "\n3.Elimina alumno."
				+ "\n0.Salir.");
	}

	/**
	 * pasa de la lista al Hashmap
	 * @param lista
	 * @param hm
	 */
	public static void añadirDeLaListaAlHashmap(List<Alumno> lista, HashMap<String, Alumno> hm) {
		hm.clear();
		
		for (int i = 0; i < lista.size(); i++) {
			Alumno alum = lista.get(i);
			hm.put(alum.getDni(), alum);
		}
	}
	
	/**
	 * Añade un alumno tanto a la lista como al hashmap
	 * @param lista
	 * @param hm
	 */
	public static void añadirAlumno(List<Alumno> lista, HashMap<String, Alumno> hm) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nAñade un nuevo alumno."
				+ "\nEscribe su DNI: ");
		String dni = sc.next();
		System.out.print("Escribe el nombre: ");
		String nombre = sc.next();
		System.out.print("Escribe la edad del alumno: ");
		int edad = sc.nextInt();
		
		lista.add(lista.size(), new Alumno(dni, nombre, edad));
		hm.put(dni, new Alumno(dni, nombre, edad));
		
	}
	
	/**
	 * muestra a los alumnos del hashMap
	 * @param hm
	 */
	public static void mostrarAlumnos(HashMap<String, Alumno> hm) {
		for (Alumno alum : hm.values()) {
			System.out.println(alum);
		}
	}
	
	/**
	 * muestra tanto la lista como el hashMap
	 * @param lista
	 * @param hm
	 */
	public static void fin(List<Alumno> lista, HashMap<String, Alumno> hm) {
		System.out.println("\n -----");
		for (int i = 0; i < lista.size(); i++) {
			Alumno alum = lista.get(i);
			System.out.println(lista.set(i, alum));
		}
		System.out.println("\n -----");
		for (Alumno alum : hm.values()) {
			System.out.println(alum);
		}
	}
	
	/**
	 * Busca los alumnos por el dni
	 * @param hm
	 */
	public static void buscarAlumno( HashMap<String, Alumno> hm){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el dni que buscas: ");
		String dni = sc.next();
		
		Alumno alum = hm.get(dni); 
	    
	    if (alum != null) {
	        System.out.println(alum);
	    } else {
	        System.out.println("No existe ningun alumno con DNI -> " + dni);
	    }
	}
	
	/**
	 * elimina al alumno del hashmap
	 * @param lista
	 * @param hm
	 */
	public static void eliminarAlumno(HashMap<String, Alumno> hm) {
		Scanner sc = new Scanner(System.in);
		
		mostrarAlumnos(hm);
	
		System.out.print("\nEscribe el dni del alumno que quieres eliminar: ");
		String dni = sc.next();
		
		Alumno eliminado = hm.remove(dni);
	}
	
	/**
	 * pasa los alumnos del hashmap a la lista para actualizarla
	 * @param lista
	 * @param hm
	 */
	public static void añadirDelHashmapALaLista(List<Alumno> lista, HashMap<String, Alumno> hm) {
		lista.clear();
		
		for (Alumno alum : hm.values()) {
			lista.add(alum);
		}
	}
	
	
}
