public class Alumno {
	private int a�o;
	private String nombre;
	private char genero;
	private int promedio;
	
	public Alumno() {
		a�o = 0;
		nombre = "";
		genero = ' ';
		promedio = 0;
	}
	
	public Alumno(int a, String b, char c, int d) {
		a�o = a;
		nombre = b;
		genero = c;
		promedio = d;
	}
	public int getA�o() {
		return a�o;
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
	public void setA�o(int a�o) {
		this.a�o = a�o;
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

