package examenes.examen20260313.ejecicio02;

import java.util.ArrayList;
import java.util.List;

public class AnalizadorTexto{

	List<XXXXListener> lista = null;
	
	public AnalizadorTexto() {
		super();
		List<XXXXListener> lista = new ArrayList<XXXXListener>();	
		for (int i = 0; i <= 5; i++) {
			lista.add(new XXXXListener());
		}
	}	
	
	/**
	 * 
	 * @param cadenaTexto
	 * @param num
	 * @return
	 */
	public int recorrerCadena(char cadenaTexto[], int num) {
		if (num == 0) {
			return 0;
		}
		
		if (Character.isDigit(cadenaTexto[(cadenaTexto.length-1)-num])) {
			System.out.println("'" + cadenaTexto[(cadenaTexto.length-1)-num] + "' es dígito");
		}
		else if (Character.isLetter(cadenaTexto[(cadenaTexto.length-1)-num])) {
			System.out.println("'" + cadenaTexto[(cadenaTexto.length-1)-num] + "' es letra");
		}

		return recorrerCadena(cadenaTexto, num-1);
	}
//////////////////////////////////////////////////////////////////////////////

	public List<XXXXListener> getLista() {
		return lista;
	}

	public void setLista(List<XXXXListener> lista) {
		this.lista = lista;
	}
}
