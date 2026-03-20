package examenes.examen20260313.ejecicio04;

import java.util.Date;

public interface ComprobadorEdad {

	void comprobar(Date fechaNacimiento) throws EdadInvalidaException;

}
