//AUTOR: RONI COMPANOCCA CHECCO
//ARREGLOS (ARRAYS) - CAPITULO 01
//BUSQUEDA Y ORDENAMIENTO - ARREGLO BIDIMENSIONAL
//EJERCICIO 02
import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		Alumno [][] EPIS = new Alumno[5][100];
		menuPantalla();
		numero = scan.nextInt();
		if(numero == 1) {
			IngresarDatos(EPIS);
		}else if(numero == 2) {
			ConsultarAño(EPIS);
		}else if(numero == 3) {
			ConsultarTodos(EPIS);
		}else if(numero == 4) {
			PromedioPonderadoPorAño(EPIS);
		}else if(numero == 5) {
			PromedioPonderadoDeTodos(EPIS);
		}else if(numero == 6) {
			MayorAño(EPIS);
		}else if(numero == 7) {
			MenorAño(EPIS);
		}else if(numero == 8) {
			MayorTodos(EPIS);
		}else if(numero == 9) {
			MenorTodos(EPIS);
		}else if(numero == 10) {
			RankearAño(EPIS);
		}else if(numero == 11) {
			RankearTodos(EPIS);
		}else if(numero == 12) {
			Salir();
		}
	}
	public static void menuPantalla() {
		System.out.print("1. Ingresar datos                   ");
		System.out.println("2. Consultar año");
		System.out.print("3. Consultar todos                  ");
		System.out.println("4. Promedio ponderado por año");
		System.out.print("5. Promedio ponderado de todos      ");
		System.out.println("6. Mayor año");
		System.out.print("7. Menor año                        ");
		System.out.println("8. Mayor todos");
		System.out.print("9. Menor todos                      ");
		System.out.println("10. Rankear año");
		System.out.print("11. Rankear todos                   ");
		System.out.println("12. Salir");
	}
	public static void IngresarDatos(Alumno[][] a) {
		Scanner scan = new Scanner(System.in);
		int año = 0;
		String nombre = "";
		char genero = ' ';
		int promedio = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
			    System.out.println("\nIngrese su nombre: ");
			    nombre = scan.nextLine();
			    System.out.println("Ingrese su edad: ");
			    año = scan.nextInt();
			    System.out.println("Ingrese su genero: ");
			    genero = scan.next().charAt(0);
			    System.out.println("Ingrese su DNI: ");
			    promedio = scan.nextInt();		
			}
		}
	}
	public static void ConsultarAño(Alumno[][] b) {
		Scanner scan = new Scanner(System.in);
		int año = 0;
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
			    System.out.println("Ingrese el año: ");
			    año = scan.nextInt();
			}
		}
	}
	public static void ConsultarTodos(Alumno[][] c) {
		
	}
	public static void PromedioPonderadoPorAño(Alumno[][] d) {
		
	}
	public static void PromedioPonderadoDeTodos(Alumno[][] e) {
		
	}
	public static void MayorAño(Alumno[][] f) {
		
	}
	public static void MenorAño(Alumno[][] e) {
		
	}
	public static void MayorTodos(Alumno[][] g) {
		
	}
	public static void MenorTodos(Alumno[][] h) {
		
	}
	public static void RankearAño(Alumno[][] i) {
		
	}
	public static void RankearTodos(Alumno[][] j) {
		
	}
	public static void Salir() {
		Scanner scan = new Scanner(System.in);
    	int o=0;
	   	System.out.println("\nSalir \n1.-SI\n2.-NO");
		   o=scan.nextInt();
	}
}
