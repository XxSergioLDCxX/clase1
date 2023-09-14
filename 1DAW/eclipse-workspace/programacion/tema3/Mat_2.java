package tema3;

import java.util.Scanner;

public class Mat_2 {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Numero de columnas");
		int columnas = sc.nextInt();
		
		int[][] tabla = new int [5][columnas];
		
		tabla = rellenar(tabla);
		
		mostrar(tabla);
		

	}
	
	public static void mostrar(int[][] cuadro) {
		
		for(int x = 0; x<cuadro.length;x++) {
			
			System.out.println();
			
			for(int y = 0; y< cuadro[x].length;y++) {
				
				
				System.out.print("|" + cuadro[x][y] + "|");
				
			}
			
			
		}
		
	}

	public static int[][] rellenar(int[][] rellenar) {
		
		for(int x = 0; x<rellenar.length;x++) {
			
			
			
			for(int y = 0; y< rellenar[x].length;y++) {
				
				rellenar[x][y]= (int) (Math.random()*10) + 1;
				
				
			}
		}
		
		return rellenar;
		
	}
	
}
