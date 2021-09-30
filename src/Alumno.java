public class Alumno {
	private int año;
	private String nombre;
	private char genero;
	private int promedio;
	
	public Alumno() {
		año = 0;
		nombre = "";
		genero = ' ';
		promedio = 0;
	}
	
	public Alumno(int a, String b, char c, int d) {
		año = a;
		nombre = b;
		genero = c;
		promedio = d;
	}
	public int getAño() {
		return año;
	}
	public String getNombre() {
		return nombre;
	}
	public char getGenero() {
		return genero;
	}
	public int getPromedio() {
		return promedio;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}
}

