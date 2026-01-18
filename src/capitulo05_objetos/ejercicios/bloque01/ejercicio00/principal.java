package capitulo05_objetos.ejercicios.bloque01.ejercicio00;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		Persona personas[] = new Persona[3];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona();
		}
		
		int opcion;
		int numPersonas = -1;
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 1: 
				numPersonas++;
				System.out.println("Persona " + numPersonas);
				System.out.println("Introduce nombre: ");
				personas[numPersonas].setNombre(sc.nextLine());
				System.out.println("Introduce apellidos: ");
				personas[numPersonas].setApellidos(sc.nextLine());
				System.out.println("Introduce DNI: ");
				personas[numPersonas].setDni(sc.nextLine());
				System.out.println("Introduce direccion: ");
				personas[numPersonas].setDireccion(sc.nextLine());
				System.out.println("Introduce telefono: ");
				personas[numPersonas].setTelefono(sc.nextLine());
			
				break;
			case 2:	
				System.out.println("\nLista de personas.\n");
				for (int i = 0; i <= numPersonas; i++) {
					System.out.println("Persona " + (i));
				    System.out.println("Nombre: " + personas[i].getNombre());
				    System.out.println("Apellidos: " + personas[i].getApellidos());
				    System.out.println("DNI: " + personas[i].getDni());
				    System.out.println("Direccion: " + personas[i].getDireccion());
				    System.out.println("Telefono: " + personas[i].getTelefono());
				}
				break;
			}
			
		} while (opcion != 0);

	}
	
	public static int mostrarMenu() {
		String menu = """
				\nMENÚ
				0. Salir
				1. Introducir datos de persona
				2. Ver las personas introducidas.
				Introduce opcion: 
				""";
		String strOpcion = JOptionPane.showInputDialog(menu);
		
		if(strOpcion == null) {
			return -1;
		}
		else {
			return Integer.parseInt(strOpcion);
		}
	}
}
