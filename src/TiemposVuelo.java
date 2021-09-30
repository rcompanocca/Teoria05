//AUTOR: RONI COMPANOCCA CHECCO
//ARREGLOS (ARRAYS) - CAPITULO 01
//BUSQUEDA Y ORDENAMIENTO - ARREGLO BIDIMENSIONAL
//EJERCICIO 01
import java.util.Scanner;

public class TiemposVuelo {
	public static void main(String[] args) {
		String [][] lista = new String[6][6];	
		System.out.println("Tiempos de vuelo Perú\n");
		mostrarTablaTiemposVuelo(lista);
		imprimir();
		preguntarPorTiempoVuelo(lista);
	}
	public static void mostrarTablaTiemposVuelo(String[][] tiempo) {
		// ASIGNAMOS VALORES PARA LA MATRIZ
		tiempo [0][0] = "";
		tiempo [0][1] = "AQP";
		tiempo [0][2] = "JUL";
		tiempo [0][3] = "CUZ";
		tiempo [0][4] = "TCQ";
		tiempo [0][5] = "LIM";
		// SEGUDA COLUMNA
		tiempo [1][0] = "AQP";
		tiempo [1][1] = "0";
		tiempo [1][2] = "23";
		tiempo [1][3] = "31";
		tiempo [1][4] = "45";
		tiempo [1][5] = "59";
		// TERCERA COLUMNA
		tiempo [2][0] = "JUL";
		tiempo [2][1] = "22";
		tiempo [2][2] = "0";
		tiempo [2][3] = "17";
		tiempo [2][4] = "27";
		tiempo [2][5] = "58";
		// CUARTA COLUMNA
		tiempo [3][0] = "CUZ";
		tiempo [3][1] = "30";
		tiempo [3][2] = "15";
		tiempo [3][3] = "0";
		tiempo [3][4] = "25";
		tiempo [3][5] = "30";
		// QUINTA COLUMNA
		tiempo [4][0] = "TCQ";
		tiempo [4][1] = "42";
		tiempo [4][2] = "25";
		tiempo [4][3] = "24";
		tiempo [4][4] = "0";
		tiempo [4][5] = "97";
		// SECTA COLUMNA
		tiempo [5][0] = "LIM";
		tiempo [5][1] = "57";
		tiempo [5][2] = "58";
		tiempo [5][3] = "30";
		tiempo [5][4] = "95";
		tiempo [5][5] = "0";
		for (int i=0; i<tiempo.length; i++) {
			for(int j=0; j<tiempo.length; j++) {
				System.out.print(tiempo[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	public static void imprimir() {
		System.out.println("\n1 = AQP");
		System.out.println("2 = JUL");
		System.out.println("3 = CUZ");
		System.out.println("4 = TCQ");
		System.out.println("5 = LIM");
	}
	public static void preguntarPorTiempoVuelo(String[][] a) {
		Scanner scan = new Scanner(System.in);
		int partida, llegada;
		System.out.print("\nIngrese el número de ciudad de partida: \t");
		partida = scan.nextInt();
		System.out.print("Ingrese el número de ciudad de llegada: \t");
		llegada = scan.nextInt();
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(partida == i && llegada == j) {
					System.out.println("\nTiempo de vuelo: "+a[i][j]+" minutos.");
				}
			}
		}	
	}
}
