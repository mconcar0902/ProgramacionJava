package examenes.examen20260320.ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AnalizadorNumero {

	private static List<NumeroListener> lista = new ArrayList<NumeroListener>();
	
	public static void addNumeroListener(NumeroListener l) {
		lista.add(l);
	}
	
	public static void removeNumeroListener(NumeroListener l) {
		lista.remove(l);
	}
	
	private static void fireNumeroParListener(int digito) {
		AnalizadorNumeroEvent event = new AnalizadorNumeroEvent(digito);
		for (NumeroListener listener : lista) {
			listener.onPar(digito);
		}
	}
	
	private static void fireNumeroImparListener(int digito) {
		AnalizadorNumeroEvent event = new AnalizadorNumeroEvent(digito);
		for (NumeroListener listener : lista) {
			listener.onImpar(digito);
		}
	}
	
	private static void fireNumeroPrimoListener(int digito) {
		AnalizadorNumeroEvent event = new AnalizadorNumeroEvent(digito);
		for (NumeroListener listener : lista) {
			listener.onPrimo(digito);
		}
	}
	
	public static void main(String[] args) {
		Numero n1 = new Numero(151924);
		addNumeroListener(n1);
		
		recorreNumeroRecursivo(n1.getNum(), 1);
		
	}

	
	private static void recorreNumeroRecursivo (int numero, int index) {
		if (numero <= 0) {
			return;
		}
		int digito = (numero /( 10 * index));
			
		if(numero % 2 == 0) {
			fireNumeroParListener(digito);
		}
		else {
			fireNumeroImparListener(digito);
		}
		
		recorreNumeroRecursivo(numero/10 , index++);
	}
}
