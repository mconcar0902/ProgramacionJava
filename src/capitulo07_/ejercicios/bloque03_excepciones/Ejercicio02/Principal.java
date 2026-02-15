package capitulo07_.ejercicios.bloque03_excepciones.Ejercicio02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		compruebaExceptions(pideFrase());

	}

	public static List<String> pideFrase() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una frase en la que aparezca la palabra bombilla: ");
		String frase = sc.nextLine();
		
		String palabras[] = frase.split("[ ]+");
		List<String> listaPalabras = Arrays.asList(palabras);
		
		return listaPalabras;
	}
	
	public static void compruebaExceptions(List<String> listaPalabras) {
		
		try {
			
		if (listaPalabras.isEmpty()) {
			throw new CaracteresBlancosException("No hay palabras en la frase.");
		}
		else if (listaPalabras.size() < 3) {
			throw new FraseCortaException("No hay palabras en la frase.");
		}
		else if (!listaPalabras.contains("bombilla")) {
			throw new BombillaException("La palabra bombilla no aparace en la frase.");
		}
		else if (listaPalabras.contains("tonto") || listaPalabras.contains("tonta") || listaPalabras.contains("idiota")) {
			throw new PalabrasOfensivasException("Hay una palabra ofensiva en la frase.");
		}
		
		System.out.println("Frase valida.");
			
		} catch (BombillaException e) {
			System.out.println(e.getMessage());
			e.getMessage().notify();
		} catch (CaracteresBlancosException e) {
			System.out.println(e.getMessage());
			e.getMessage().notify();
		} catch (FraseCortaException e) {
			System.out.println(e.getMessage());
			e.getMessage().notify();
		} catch (PalabrasOfensivasException e) {
			System.out.println(e.getMessage());
			e.getMessage().notify();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.getMessage().notify();
		}
		
//		
	}
	
}

