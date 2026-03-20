package examenes.examen20260313.ejecicio02;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		AnalizadorTexto analizador = new AnalizadorTexto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una cadena de texto: ");
		String frase = sc.nextLine();
		
		char cadenaTexto[] = new char[frase.length()];
		
	
		for (int i = 0; i < frase.length(); i++) {
			cadenaTexto[i] = frase.charAt(i);
			System.out.println(frase.charAt(i));
			
		}
		
		analizador.recorrerCadena(cadenaTexto, frase.length()-1);
		
		
		
	}

}
