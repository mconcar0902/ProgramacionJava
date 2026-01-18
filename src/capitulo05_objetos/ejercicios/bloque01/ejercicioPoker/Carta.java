package capitulo05_objetos.ejercicios.bloque01.ejercicioPoker;

public class Carta {
	private int valor;
	private String palo;
	private int id;
	
	public Carta() {
		super();
	}
	
	public Carta(int valor, int id) {
		super();
		this.valor = valor;
		this.id = id;
		this.palo = palo;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}
	
}
