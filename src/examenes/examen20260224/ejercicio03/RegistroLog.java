package examenes.examen20260224.ejercicio03;

public class RegistroLog implements TemperaturaListener {

	public RegistroLog() {
		super();
		SensorTemperatura.addTemperaturaListener(this);
	}
	
	@Override
	public void temperaturaCritica(TemperaturaEvent e) {
		System.out.println("TEMPERATURA CRITICA"
				+ "   Soy el registroLog la temperatura es: "
				+ e.getTemperatura() + " ºC");
		
	}

}
