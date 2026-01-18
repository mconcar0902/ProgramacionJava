package capitulo05_objetos.ejercicios.bloque04_instancia_VS_static.Ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc; 
				
		do {
			System.out.print("Quieres crear un usuario (1-Si o 0-No): ");
			opc = sc.nextInt();
			if (opc == 1) {
				System.out.print("Escribe el nombre del usuario: ");
				String nombre = sc.next();
				Usuario usuario  = new Usuario(nombre);
			}
			
			System.out.print("\nQuieres eliminar un usuario (1-Si o 0-No): ");
			opc = sc.nextInt();
			if (opc == 1) {
				Usuario.eliminarUsuario();
			}
			
			System.out.println("\nHay " + Usuario.getTotalUsuarios() + " usuarios.");
			
			System.out.print("Quieres salir (1-Si o 0-No): ");
			opc = sc.nextInt();
			System.out.println();
			
		} while (opc != 1);

		System.out.println("El programa a terminado.");
		System.out.println("Se han creado " + Usuario.getTotalUsuarios() +
				" y se han eliminado " + Usuario.getUsuariosEliminados());
	}

}
