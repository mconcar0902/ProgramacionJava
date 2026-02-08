package capitulo06_coleccionesDeDatos.ejercicios.bloque03_listasYhashMap.Ejercicio02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		
		List<Tarea> tareas = new ArrayList<Tarea>();
		HashMap<Integer, Tarea> tareasCompletadas = new HashMap<Integer, Tarea>();
		
		crearTareas(tareas);
		realizaTareas(tareas);
		tareasTerminadas(tareas, tareasCompletadas);
		mostrar(tareas, tareasCompletadas);
		
	}
	
	/**
	 * Añade tareas a la lista
	 * @param tareas
	 */
	public static void crearTareas(List<Tarea> tareas) {
		tareas.add(new Tarea(1, "Realizar proceso 1"));
		tareas.add(new Tarea(2, "Realizar proceso 2"));
		tareas.add(new Tarea(3, "Realizar proceso 3"));
		tareas.add(new Tarea(4, "Realizar proceso 4"));
		tareas.add(new Tarea(5, "Realizar proceso 5"));
		tareas.add(new Tarea(6, "Realizar proceso 6"));
		tareas.add(new Tarea(7, "Realizar proceso 7"));
		tareas.add(new Tarea(8, "Realizar proceso 8"));
		tareas.add(new Tarea(9, "Realizar proceso 9"));
	}
	
	/**
	 * Cambia aleatoriamente algunas tareas a completadas
	 * @param tareas
	 */
	public static void realizaTareas(List<Tarea> tareas) {
		Random rand = new Random();
		
		for (int i = 0; i < tareas.size(); i++) {
			int pos = rand.nextInt(0,100);
			if (pos <= 50) {
				Tarea t = tareas.get(i);
				t.setCompletada(true);
			}
		}
	}
	
	/**
	 * Pasa las tareas terminadas al hashMap
	 * @param tareas
	 * @param tareasCompletadas
	 */
	public static void tareasTerminadas(List<Tarea> tareas, HashMap<Integer, Tarea> tareasCompletadas) {
		for (int i = 0; i < tareas.size(); i++) {
			Tarea t = tareas.get(i);
			if (t.getCompletada()) {
				tareasCompletadas.put(t.getId(), t);
				tareas.remove(i);
				i--;
			}
		}
	}
	
	/**
	 * muestra la lista y el hashMap
	 * @param tareas
	 * @param tareasCompletadas
	 */
	public static void mostrar(List<Tarea> tareas, HashMap<Integer, Tarea> tareasCompletadas) {
		System.out.println("Tareas pendientes");
		for (int i = 0; i < tareas.size(); i++) {
			System.out.println(tareas.get(i));
		}
		System.out.println("\nTareas completadas");
		for(Tarea t : tareasCompletadas.values()) {
			System.out.println(t);
		}
	}

}
