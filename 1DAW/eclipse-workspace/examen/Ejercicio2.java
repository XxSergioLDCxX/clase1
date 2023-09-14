import java.util.Scanner;

public class Ejercicio2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int [] [] tablero = new int[8][8];
		int end = 0, turno = 1;
		tablero[0][4] = 1;
		tablero[1][1] = 1;
		tablero[1][2] = 1;
		tablero[3][3] = 1;
		tablero[3][4] = 1;
		tablero[4][0] = 1;
		tablero[4][4] = 1;
		tablero[4][6] = 1;
		tablero[4][7] = 1;
		tablero[5][6] = 1;
		tablero[5][0] = 1;
		tablero[7][3] = 1;
		tablero[7][4] = 1;
		tablero[7][5] = 1;
		tablero[7][6] = 1;
		tablero[7][7] = 1;
		
		int [] [] vacio = new int[8][8];
		
		System.out.println("Bienvenido al juego de los barcos donde quieres tirar un misil?");
		while (end != 1) {
		System.out.println("Tuerno numero:" + turno);
		turno++;
		System.out.println("Posiciones disponibles desde 00 hasta 77");
		mostrar(vacio);
		System.out.println();
		System.out.println("Posicion1");
		int posicio1 = sc.nextInt();
		System.out.println("Posicion2");
		int posicion2 = sc.nextInt();
		misil(tablero, vacio,posicio1, posicion2);
		end = comprobar(tablero,vacio);
		}
		System.out.println("HAS SALIDO");
		
	}
	public static void mostrar(int [][] matriz) {
		for (int x = 0; x<matriz.length;x++) {
			System.out.println();
			for (int y = 0;y<matriz[x].length;y++) {
				System.out.print("|" + matriz[x][y]);
			}
		}
	}
	public static int[][] misil(int [][] tablero,int [][] vacio, int posicion1, int posicion2){

		
		int a = posicion1;
		int b = posicion2;
		if(vacio[a][b] != 1 && vacio[a][b] != 2) {
		if(tablero[a][b] == 1) {
			
			vacio[a][b] = 1;
			System.out.println("Has dado en el blanco");
		}else {vacio[a][b] = 2;
		System.out.println("HAS FALLADO");}
		}else {
			System.out.println("Has vuelto a tocar el mismo lado");
		}
		
		
		return vacio;
	}
	public static int comprobar (int[][] m1, int [][] m2) {
		int a = 0;
		if(m1.equals(m2)) {
			a = 1;
		}
		
		return a;
	}
}
