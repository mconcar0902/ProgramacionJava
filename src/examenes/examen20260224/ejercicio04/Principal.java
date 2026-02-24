package examenes.examen20260224.ejercicio04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fecha de entrada (dd/MM/yyyy HH:mm):");
		String fechaEnt = sc.nextLine();
		System.out.println("Fecha de salida (dd/MM/yyyy HH:mm):");
		String fechaSal = sc.nextLine();
		
		System.out.println("\nFechas formateadas.");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date fechaEntParse = null;
		Date fechaSalParse = null;
		
		try {
			fechaEntParse = sdf.parse(fechaEnt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fechaSalParse = sdf.parse(fechaSal);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fecha entrada: " + sdf.format(fechaEntParse));
		System.out.println("Fecha salida: " + sdf.format(fechaSalParse));
		
		
		calcular(fechaEntParse, fechaSalParse);
		
		
		
		
	}
	
	/**
	 * 
	 * @param fechaEntParse
	 * @param fechaSalParse
	 */
	public static void calcular(Date fechaEntParse, Date fechaSalParse) {
		try {
			if (fechaEntParse.getDay() > fechaSalParse.getDay()) {
				throw new FechaReservaInvalidaException("\nERROR - "
						+ "La fecha de salida no puede ser antes de la fecha de entrada.");
			}
		} catch (FechaReservaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		int dias = 0;
		int horas = 0;
		for (int i = fechaEntParse.getDay(); i < fechaSalParse.getDay(); i++) {
			dias++;
		}
		
		for (int i = fechaEntParse.getHours(); i < fechaSalParse.getHours(); i++) {
			horas++;
		}
		
		if (horas != 0) {
			dias++;
		}
		
		System.out.println("Tiempo en Dias " + dias + "  | Tiempo en horas " + horas);
		
		calcularCheckOut(fechaEntParse, dias);
	}

	
	
	public static Date calcularCheckOut(Date fechaEntrada, int dias) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		sdf.format(fechaDate);
		return fechaDate;
		
		
	}
}
