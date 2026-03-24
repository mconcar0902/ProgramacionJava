package examenes.examen20260320.ejercicio03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws PrestamoExcedidoException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe la fecha del prestamo: ");
		String fecha = sc.nextLine();
		System.out.print("\nDe cuantos dias es el prestamo: ");
		int dias = sc.nextInt();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date fechaInicial = sdf.parse(fecha);
			
			Calendar calInicial = Calendar.getInstance();
			calInicial.setTime(fechaInicial);

			Calendar calActual = Calendar.getInstance();
			
			int contFechasMostradas =  revisarPrestamo(calInicial, calActual, sdf, dias);
			int tiempoDeMas = contFechasMostradas - dias;
			System.out.println("Llevas " + contFechasMostradas + " dias con el libro.");
			
			if (tiempoDeMas > 0) {
				System.out.println("\nEl libro se entrega con " + tiempoDeMas + " dias de retraso.");
				System.out.println("Tienes que pagar una multa de " + tiempoDeMas + " euros , pagas un euro por dia de retraso.");
			}
			else {
				tiempoDeMas = (-tiempoDeMas);
				System.out.println("\nTienes " + tiempoDeMas + " dias para entregar el libro;");
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @param calInicial
	 * @param calActual
	 * @param sdf
	 * @param dias
	 * @return
	 * @throws PrestamoExcedidoException
	 */
	private static int revisarPrestamo(Calendar calInicial, Calendar calActual, 
			SimpleDateFormat sdf, int dias) throws PrestamoExcedidoException {

		int contFechasMostradas = -1;
		
		do {
			if (contFechasMostradas == dias) {
				try {
					throw new PrestamoExcedidoException("AVISO!!  El plazo ha sido exedido");
				} catch (PrestamoExcedidoException e) {
					System.out.println(e.getMessage());
				}
			
			}
			contFechasMostradas++;
			calInicial.add(Calendar.HOUR, 24);
		} while (calInicial.getTime().before(calActual.getTime()));
		
		return contFechasMostradas;
	}
}
