package examenes.examen20251212.ejercicio03;

public class Principal {

	public static void main(String[] args) {
		Torneo torneo = new Torneo();
		System.out.println("Jugadores " + torneo.toString());
		
		
		for (int i = 0; i < torneo.getRondas(); i++) {
			torneo.rondaTorneo();
			System.out.println("\nRonda " + (i + 1) + " del torneo " + torneo.toString());
		}
		
		torneo.clasificacionFinal();
		System.out.println("\nClasificacion final" + torneo.toString());
	}

}
