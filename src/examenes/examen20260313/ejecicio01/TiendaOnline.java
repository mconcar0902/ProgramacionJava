package examenes.examen20260313.ejecicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TiendaOnline {

	public static void main(String[] args) {
		List<Pedido> lista = new ArrayList<Pedido>();
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		lista.add(new Pedido(1, "Marcos", "Patatas", 3, 2.5));
		lista.add(new Pedido(2, "Paco", "Tomate", 5, 1.5));
		lista.add(new Pedido(3, "Marcos", "Refresco", 2, 2));
		lista.add(new Pedido(4, "Paco", "Palomitas", 1, 1));
		
		sumarPedidos(lista, hm);
		mostrarTotal(hm);

		buscarCliente(lista);
	}
	
	/**
	 * 
	 * @param lista
	 * @param hm
	 */
	public static void sumarPedidos(List<Pedido> lista, HashMap<String, Double> hm) {
		
		for (Pedido p : lista) {
			if (hm.get(p.getCliente()) != null) {
				double total = (hm.get(p.getCliente()).doubleValue()) + (p.getCantidad()*p.getPrecioUnitario());
				hm.put(p.getCliente(), total);
			}
			else {
				double total = p.getCantidad()* p.getPrecioUnitario();
				hm.put(p.getCliente(), total);
			}
		}
	}

	/**
	 * 
	 * @param hm
	 */
	public static void mostrarTotal(HashMap<String, Double> hm) {
		System.out.println("El total de las compras por cliente es: ");
			System.out.println(hm.toString());
	}
	
	/**
	 * 
	 * @param lista
	 */
	public static void buscarCliente(List<Pedido> lista) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEscribe el nombre del cliente: ");
		String nombre = sc.nextLine();
		
		for (Pedido p : lista) {
			if (p.getCliente().equals(nombre)) {
				System.out.println(p.toString());
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
