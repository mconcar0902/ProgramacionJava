package capitulo05_objetos.ejercicios.bloque06_claseAnonimaYLambda.Ejercicio06_ListenerEstiloGUI;

public class Boton {

	private ClickListener listener;
	
	public Boton() {
		super();
	}
	
	public void setClickListener(ClickListener listener) {
		this.listener = listener;
	}
	
	public ClickListener getListener() {
		return listener;
	}
	
	public void click() {
		listener.onClick();
	}




	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Boton b = new Boton();
		
		b.setClickListener(new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Has hecho click");
				
			}
		});
		
		b.click();
		b.click();
		b.click();
		
	}
	
}
