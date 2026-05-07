package capitulo07_.ejercicios.bloque02_mathDateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Ejercicio04 {

//	Crea un programa en Java que pida al usuario la introducción de una fecha a través de JOptionPane. 
//	El usuario te especificará un dato de tipo String y tú debes convertirlo a un objeto de tipo java.util.Date utilizando SimpleDateFormat.
//	A continuación realiza las siguientes acciones
//	- Con el objeto java.util.Date, crea un objeto de tipo Calendar y que represente la misma fecha que ha introducido el usuario.
//	- Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y segundo. 
//	Cada campo debe aparecer en una línea de la consola. Debes obtener cada campo desde el objeto java.util.Date y desde 
//	el objeto Calendar. Es decir, cada campo debe ser obtenido dos veces en pantalla.
//	- Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas en pantalla: suma 3 días, resta 2 semanas,
//	suma 300 días, suma 4 años.
//	
	public static void main(String[] args) {
		Date fecha1 = new Date();
		String fecha = fecha1.toString();
		
		System.out.println(fecha);
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		
		Date fechaParseada = null;
		
		try {
			fechaParseada = sdf.parse("19/03/1977 15:33:00");
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha parseada: " + sdf.format(fechaParseada));
		
		Calendar fechaCal = Calendar.getInstance();
		fechaCal.setTime(fechaParseada);
		
		System.out.println(fechaCal);
	}

}
