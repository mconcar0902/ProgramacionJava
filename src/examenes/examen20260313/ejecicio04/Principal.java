package examenes.examen20260313.ejecicio04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe la fecha de nacimiento (dd/MM/yyyy): ");
		String fechaNac = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaNacP = null;
		
		try {
			fechaNacP = sdf.parse(fechaNac);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ComprobadorEdad comprobador = new ComprobadorEdad() {
			@Override
			public void comprobar(Date fechaNacimiento) throws EdadInvalidaException {
				long años18 = 18 * (1000*60*60*24*365);
				
				Calendar fecha = Calendar.getInstance();
				fecha.setTime(fechaNacimiento);
				
				long edadAños = fecha.getTimeInMillis();
				
				if (años18 < edadAños) {
					System.out.println("Es mayor de edad");
				}
			
				
				
				
			}
		};
		
			try {
				comprobador.comprobar(fechaNacP);
			} catch (EdadInvalidaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
