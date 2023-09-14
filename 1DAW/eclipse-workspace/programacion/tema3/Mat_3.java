package tema3;

import java.util.Scanner;

public class Mat_3 {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Filas");
		int n1 = sc.nextInt();
		
		System.out.println("Columnas");
		int n2 = sc.nextInt();
		
		int[][] a = new int [n1][n2];
		a = rellenar(a);
		mostrar(a);
		
		System.out.println();
		
		int[][] b = new int [n1][n2];
		b = rellenar(b);
		mostrar(b);
		
		int[][] c = new int [n1] [n2];
		
		c = suma(a, b, c);
		
		System.out.println();
		
		mostrar(c);
		
	}
	
	public static int[][] rellenar(int[][] rellenar) {
		
		for(int x = 0; x<rellenar.length;x++) {
			
			
			
			for(int y = 0; y< rellenar[x].length;y++) {
				
				rellenar[x][y]= (int) (Math.random()*9) + 1;
				
				
			}
		}
		
		return rellenar;
		
	}
	
	public static void mostrar(int[][] cuadro) {
		
		for(int x = 0; x<cuadro.length;x++) {
			
			System.out.println();
			
			for(int y = 0; y< cuadro[x].length;y++) {
				
				
				System.out.print("|" + cuadro[x][y] + "|");
				
			}
			
			
		}
		
	}
	
	public static int[][] suma(int[][] a,int[][] b, int[][] c){
		
		for(int x = 0; x<c.length;x++) {
			
			
			
			for(int y = 0; y< c[x].length;y++) {
				
				c[x][y] = a[x][y] + b[x][y];
				
				
			}
		}
		
		
		return c;
	}

}
