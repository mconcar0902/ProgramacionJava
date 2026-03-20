package examenes.examen20260313.ejecicio03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

//	a) Pedir al usuario dos fechas por consola: fecha inicial y fecha final. Las fechas se introducirán en
//	formato: “dd/MM/yyyy”. Utilizar la clase SimpleDateFormat para convertir las cadenas
//	introducidas por el usuario en objetos de tipo Date.
//	b) Crear dos objetos Calendar (uno para la fecha inicial y otro para la fecha final) a partir de las
//	fechas obtenidas anteriormente.
//	c) Implementar un método que reciba los dos objetos Calendar y muestre todas las fechas
//	comprendidas entre ellas (incluidas ambas). Por cada fecha se deberá: mostrar la fecha actual
//	usando SimpleDateFormat.
//	d) El programa deberá mostrar las fechas una por una hasta llegar a la fecha final y, al terminar,
//	mostrar el número total de días mostrados.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe la fecha inicial (dd/MM/yyyy): ");
		String fechaIni = sc.nextLine();
		System.out.print("Escribe la fecha fin (dd/MM/yyyy): ");
		String fechaFin = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaIniP = null;
		Date fechaFinP = null;
		
		try {
			fechaIniP = sdf.parse(fechaIni);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fechaFinP = sdf.parse(fechaFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar fechaIniCal = Calendar.getInstance();
		fechaIniCal.setTime(fechaIniP);
		
		Calendar fechaFinCal = Calendar.getInstance();
		fechaFinCal.setTime(fechaFinP);
		
		System.out.println("Dias entre fechas: ");
		mostrarFechas(fechaIniCal, fechaFinCal);
		
		long total = (fechaFinCal.getTimeInMillis() - fechaIniCal.getTimeInMillis());
		int dias = (int) (total / (1000L*60*60*24));
		System.out.println("Total de dias: " + dias);
	}
	
	
	/**
	 * 
	 * @param FIni
	 * @param FFin
	 */
	public static void mostrarFechas(Calendar FIni, Calendar FFin) {
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Date f = new Date(FIni.getTimeInMillis());
		System.out.println(sdf2.format(f));
		f =  new Date(f.getTime() + + (1000*60*60*24));
		
		Date f1 = new Date(FFin.getTimeInMillis());
		
		
		sdf2.format(f);
		sdf2.format(f1);
		 
		if(f.compareTo(f1) == 0) {
			System.out.println(sdf2.format(f1));
			return;
		}
		
		Calendar fechaIni = Calendar.getInstance();
		fechaIni.setTime(f);
		
		mostrarFechas(fechaIni, FFin);
		return;
	}

}
