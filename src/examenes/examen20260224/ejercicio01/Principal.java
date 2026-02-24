package examenes.examen20260224.ejercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		List<Curso> lista = new ArrayList<Curso>();
		
		lista.add(new Curso(10, "Programacion", 140, 100));
		lista.add(new Curso(5, "IPE", 60, 150));
		lista.add(new Curso(12, "Entornos", 130, 50));
		lista.add(new Curso(2, "Programacion", 90, 250));

		HashMap<Integer, Curso> hm = new HashMap<Integer, Curso>();
		
		pasarListaAHashmap(lista, hm);  // pasa los cursos con mas de 50 horas al HashMap
		
		mostrarCursos(hm);  // Con el HashMap mustra todos los cursos
		
		System.out.println(precioMedioYCursoCaro(hm, 1));  // tienes que poner un int para que devuelva el curso mas caro
		
		eliminarCurso(hm); 
		
		System.out.println(precioMedioYCursoCaro(hm, 0));
		
	}
	
	/**
	 * 
	 * @param lista
	 * @param hm
	 */
	public static void pasarListaAHashmap(List<Curso> lista, HashMap<Integer, Curso> hm) {
		for (Curso curso : lista) {
			if (curso.getDuracionHoras() > 50) {
				hm.put(curso.getId(), curso);
			}
		}
	}

	/**
	 * 
	 * @param hm
	 */
	public static void mostrarCursos(HashMap<Integer, Curso> hm) {
		System.out.println("Lista de cursos");
		for (Curso curso : hm.values()) {
			System.out.println(curso.toString());
		}
	}
	
	/**
	 * 
	 * @param hm
	 * @param opc  para adaptarlo 2 en 1 cuando el programa tenga menu
	 * @return
	 */
	public static String precioMedioYCursoCaro(HashMap<Integer, Curso> hm , int opc) {
		int mayor = 0;
		int id = 0;
		int suma = 0;
		
		for (Curso curso : hm.values()) {
			if (curso.getPrecio() > mayor) {
				mayor = curso.getPrecio();
				id  = curso.getId();
			}
			suma += curso.getPrecio();
		}
		
		if (opc == 1) {
			System.out.println("Este es el curso mas caro");
			return hm.get(id).toString();
		}
		return "Precio medio: "
				+ "\nEl precio medio de todos los cursos es " + suma / hm.size();
	}
	
	/**
	 * 
	 * @param hm
	 */
	public static void eliminarCurso(HashMap<Integer, Curso> hm) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEliminar un curso:"
				+ "\nEscribe el id del curso que deseas eliminar: ");
		int id = sc.nextInt();
		
		hm.remove(id);
	}
	
	
	
	
	
	
	
}
