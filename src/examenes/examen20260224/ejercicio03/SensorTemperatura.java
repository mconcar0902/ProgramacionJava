package examenes.examen20260224.ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SensorTemperatura {
	
	private static List<TemperaturaListener> listeners = new ArrayList<TemperaturaListener>();
	
	public static void addTemperaturaListener(TemperaturaListener l) {
		listeners.add(l);
	}
	
	/**
	 * 
	 * @return
	 */
	public static int medirTemperatura() {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("\nQue temperatura hace: ");
		int temp = sc.nextInt();
		return temp;
	}
	
	/***
	 * 
	 * @param temp
	 */
	private static void fireAvisaTemp(int temp) {
		TemperaturaEvent e = new TemperaturaEvent(temp);
		for (TemperaturaListener l : listeners) {
			l.temperaturaCritica(e);
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SistemaAlarma alarm1 = new SistemaAlarma();
		SistemaAlarma alarm2 = new SistemaAlarma();
		RegistroLog rl1 = new RegistroLog();
		
		do {
			int temp = medirTemperatura();
			if(temp > 80) {
				fireAvisaTemp(temp);
			}
			else {
				System.out.println("\nTemperatura actual: " + temp  + " ºC"
						+ "\nTemperatura dentro de valores normales.");
			}
			
		} while (true);

	}

}
