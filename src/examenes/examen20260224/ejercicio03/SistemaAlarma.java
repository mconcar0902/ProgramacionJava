package examenes.examen20260224.ejercicio03;

public class SistemaAlarma implements TemperaturaListener{

	public SistemaAlarma() {
		super();
		SensorTemperatura.addTemperaturaListener(this);
	}
	
	@Override
	public void temperaturaCritica(TemperaturaEvent e) {
		System.out.println("TEMPERATURA CRITICA"
				+ "    Soy el sistema de alarma la temperatura es: "
				+ e.getTemperatura() + " ºC");
		
	}

}
