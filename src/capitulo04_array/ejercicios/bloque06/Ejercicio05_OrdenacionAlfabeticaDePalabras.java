package capitulo04_array.ejercicios.bloque06;

import java.util.Scanner;

public class Ejercicio05_OrdenacionAlfabeticaDePalabras {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de palabras separadas por un espacio: ");
		String str = sc.nextLine();
		
		int num = cuentasNumeroDePalabrasEnUnaCadena(str);
		
		String palabras[] = new String[num];
		inicializaArray(str, palabras);
		ordenaElArray(palabras);
		System.out.print("Esta es la cadena en orden alfabetico: ");
		muestraArray(palabras);
	}
	
	/**
	 * 
	 * 
	 */
	public static int cuentasNumeroDePalabrasEnUnaCadena(String str) {
		int cont = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) != ' ') {
				cont++;
			}	
			else {
				if(str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
					cont++;
				}
			}
		}
		return cont;
	}
	
	/**
	 * 
	 * 
	 */
	public static void inicializaArray(String str , String palabras[]) {
		String palabraActual = ""; 
		
		int pos = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (c != ' ' ) {
				palabraActual += c;
			}
			else {
				palabras[pos] = palabraActual;
				pos += 1;
				palabraActual = "";
			}
		}
		palabras[pos] = palabraActual;
	}
	/**
	 * 
	 * 
	 */
	public static void muestraArray(String palabras[]) {
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * 
	 */
	public static void ordenaElArray(String palabras[]) {
		
		for (int i = 0; i < palabras.length; i++) {
			for (int j = i + 1; j < palabras.length; j++) {
				if (palabras[i].compareTo(palabras[j]) > 0) {
					String aux = palabras[i];
					palabras[i] = palabras[j];
					palabras[j] = aux;	
				}
			}
		}
	}
	
//	public static void ordenaElArray(String palabras[]) {
//		
//		for (int i = 0; i < palabras.length; i++) {
//			for (int j = i + 1; j < palabras.length; j++) {
//				String palabra1 = palabras[i];
//				String palabra2 = palabras[j];
//				for (int k = 0; k < palabra1.length(); k++) {
//					if (  palabra1.charAt(k) >  palabra2.charAt(k)) {
//						String aux = palabra1;
//						palabra1 = palabra2;
//						palabra2 = aux;
//					}
//				}
//				palabras[i] = palabra1;
//				palabras[j] = palabra2;
//			}
//		}
//	}

}
