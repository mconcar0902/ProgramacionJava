package examenes.examen20260224.ejercicio02;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Puerto = " + Propiedades.getIntProperty("puerto"));
		System.out.println("Maximos usuarios = " + Propiedades.getIntProperty("maxUsuarios"));
		System.out.println("Timeout = " + Propiedades.getIntProperty("timeout"));
		System.out.println("Modo produccion = " + Propiedades.getProperty("modoProduccion"));

		System.out.println("Validando...");
		comprobarException();
		
		
	}
	
	/**
	 * 
	 */
	public static void comprobarException() {
		int puerto = Propiedades.getIntProperty("puerto");
		int maxUsu = Propiedades.getIntProperty("maxUsuarios");
		int timeout = Propiedades.getIntProperty("timeout");
		boolean modoProd = Propiedades.getProperty("modoProduccion");
		
		try {
			if (puerto < 1024 || puerto > 65535) {
				throw new PuertoInvalidoException("ERROR - Ese puerto no es valido.");
			}
			if (maxUsu <= 0) {
				throw new MaxUsuariosException("ERROR - El maximo numero de usuarios tiene que ser mayor a 0.");
			}
			if (timeout < 10) {
				throw new TimeoutInvalidoException("ERROR - El timeout tiene que ser mayor o igual que 10.");
			}

			
		} catch (PuertoInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (MaxUsuariosException e) {
			System.out.println(e.getMessage());
		} catch (TimeoutInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ha habido un error inesperado");
		}
	}

}
