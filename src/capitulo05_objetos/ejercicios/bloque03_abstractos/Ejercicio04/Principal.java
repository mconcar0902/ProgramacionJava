package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio04;

public class Principal {

	public static void main(String[] args) {
		
		Instrumento instrumentos[] = new Instrumento[3]; 
		
		instrumentos[0] = new Piano("Piano");
		instrumentos[1] = new Bateria("Bateria");
		instrumentos[2] = new Guitarra("Gitarra");

		
		for (int i = 0; i < instrumentos.length; i++) {
			System.out.println(instrumentos[i].nombre + " suena: " + instrumentos[i].tocar());
		}
	}

}
