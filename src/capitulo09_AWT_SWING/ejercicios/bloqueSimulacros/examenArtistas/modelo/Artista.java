package capitulo09_AWT_SWING.ejercicios.bloqueSimulacros.examenArtistas.modelo;

public class Artista {

	private int id;
	private String nombre;
	private int idDisciplina;
	private int idMunicipio;
	
	
	public Artista() {
		super();
	}
	
	public Artista(int id, String nombre, int idDisciplina, int idMunicipio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idDisciplina = idDisciplina;
		this.idMunicipio = idMunicipio;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public int getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}
