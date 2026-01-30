package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio05_CallbackSimple;

public class Tarea {

	public void ejecutar(Callback callback) {
		System.out.println("Ejecutando tarea........");
		callback.alFinalizar();
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tarea t1 = new Tarea(); 
		
		t1.ejecutar(new Callback(){
			
			@Override
			public void alFinalizar() {
				System.out.println("Tarea 1 terminada\n");
			
			}
		});
		
		Tarea t2 = new Tarea(); 
			
		t2.ejecutar(new Callback(){
			
			@Override
			public void alFinalizar() {
				System.out.println("Tarea 2 terminada\n");
			
			}
		});
	
	}
}
