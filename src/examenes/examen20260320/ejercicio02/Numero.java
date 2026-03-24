package examenes.examen20260320.ejercicio02;

public class Numero implements NumeroListener {

	private int num;
	
	public Numero(int num) {
		super();
		this.num = num;
	}

	@Override
	public void onPar(int digito) {
		System.out.println("Numero " + digito + " es par.");
	}

	@Override
	public void onImpar(int digito) {
		System.out.println("Numero " + digito + " es impar.");
	}

	@Override
	public void onPrimo(int digito) {
		System.out.println("Numero " + digito + " es primo.");
	}

///////////////////////////////////////////////////////////////////

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
}
