package examenes.examen20260320.ejercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Voto> votos = new ArrayList<Voto>();
		HashMap<String, List<Integer>> hm = new HashMap<String, List<Integer>>();
		List<Concursante> concursantes = new ArrayList<Concursante>();
		
		votos.add(new Voto("Paco", "Ana", 8));
		votos.add(new Voto("Mario", "Raul", 5));
		votos.add(new Voto("Pepe", "Ana", 6));
		votos.add(new Voto("Paco", "Raul", 7));
		votos.add(new Voto("Paco", "Marcos", 8));

		pasarAlHashMap(hm, votos);
		mostrarHashMap(hm);
		calcularMedia(hm, votos, concursantes);
		ordenar(hm, concursantes);
	}
	
	
	
	/**
	 * 
	 * @param hm
	 * @param votos
	 */
	public static void pasarAlHashMap(HashMap<String, List<Integer>> hm, List<Voto> votos) {
		for (Voto v : votos) {
			if (hm.containsValue(v.getNombreParticipante())) {
				return;
			}
			hm.put(v.getNombreParticipante(), crearLista(votos, v.getNombreParticipante()));
		}
		
	}

	/**
	 * 
	 * @param votos
	 * @param nombre
	 * @return
	 */
	public static List<Integer> crearLista(List<Voto> votos, String nombre) {
		List<Integer> lista = new ArrayList<Integer>();
		
		for (Voto v : votos) {
			if (nombre.equals(v.getNombreParticipante())) {
				lista.add(v.getPuntuacion());
			}
		}
		
		return lista;
	}
	
	/**
	 * 
	 * @param hm
	 */
	public static void mostrarHashMap(HashMap<String, List<Integer>> hm) {
		System.out.println("Participantes y puntuaciones: " + hm.toString());
	}
	
	/**
	 * 
	 * @param hm
	 * @param votos
	 * @param concursantes
	 */
	public static void calcularMedia(HashMap<String, List<Integer>> hm, List<Voto> votos, List<Concursante> concursantes) {
		System.out.println("\nParticipantes y media: ");
		for (Voto v : votos) {
			if (v.getNombreParticipante().equals(concursantes)) {
				return;
			}
			double total = 0;
			int cont = 0;
			
			for (Integer i : hm.get(v.getNombreParticipante())) {
				total += i;
				cont++;
			}
			
			total = total/cont;
			System.out.println(v.getNombreParticipante() + "  -> " + total);
			
			concursantes.add(new Concursante(v.getNombreParticipante(), total));
		}
		
	}

	
	
	public static void ordenar(HashMap<String, List<Integer>> hm, List<Concursante> concursantes) {
		System.out.println("\nOrdenados ");
		for (int i = 0; i < concursantes.size(); i++) {
			for (int j = i + 1 ; j < concursantes.size(); j++) {
				if (concursantes.get(i).getMedia() > concursantes.get(j).getMedia()) {
					Concursante aux = concursantes.get(i);
					concursantes.get(i).equals(concursantes.get(j)) ;
					concursantes.get(j).equals(aux);
				}
			}
		}
		
		for (Concursante c : concursantes) {
			System.out.println(hm.get(c.getNombre()).toString());
		}
		
		
	}
	
	
}
