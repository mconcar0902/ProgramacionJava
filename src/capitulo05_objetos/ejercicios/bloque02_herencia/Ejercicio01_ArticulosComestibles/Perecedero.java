package capitulo05_objetos.ejercicios.bloque02_herencia.Ejercicio01_ArticulosComestibles;

public class Perecedero extends Articulo {
	private int fechaCad;
	
	
	public Perecedero() {
		super();
	}
	
	public Perecedero(String nombre, int codigo, int precio, int fechaCad) {
		super(nombre, codigo, precio);
		this.fechaCad = fechaCad;
	}

	public int getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(int fechaCad) {
		this.fechaCad = fechaCad;
	}

	@Override
	public String toString() {
		return "Perecedero [fechaCad=" + fechaCad + "]";
	}
	
	
	
}
