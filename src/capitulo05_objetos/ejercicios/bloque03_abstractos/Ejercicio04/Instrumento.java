package capitulo05_objetos.ejercicios.bloque03_abstractos.Ejercicio04;

public abstract class Instrumento {
	
	public abstract String tocar();
	public String nombre;
	
	////////////////////////////////////////////////////////
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + "]";
	}
}
