package tema3;

import java.text.spi.DateFormatSymbolsProvider;
import java.util.Scanner;

public class La_Ruleta_De_La_Suerte {

	public static void main(String[] args) {
		boolean end = false;
		char[] letras = new char[5];
		
		char[][] panel = { 
				{'_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'}, 
				{'_', 'L', 'A', '_', 'R', 'U', 'l', 'E', 'T', 'A', '_'}, 
				{'_', '_', 'D', 'E', '_', '_', '_', 'L', 'A', '_', '_'},
				{'_', '_', 'S', 'U', 'E', 'R', 'T', 'E', '_', '_', '_'}
				};
		
		String[][] resolver = { 
				{"_", "_", "_", "_", "_", "_", "_", "_", "_", "_", "_"}, 
				{"_", "L", "A", "_", "0", "0", "L", "0", "T", "A", "_"}, 
				{"_", "_", "D", "0", "_", "_", "_", "L", "A", "_", "_"},
				{"_", "_", "0", "0", "0", "0", "T", "0", " ", "_", "_"}
				};
	
		//consonantes regaladas L D T F  VOCAL A
		
		mostrarMatriz(resolver);
		
		
		while (end !=true) {
			
			mostrarMatriz(resolver);
			letras = pedirletras();
		}
		
		
		
	}
	
	public static void mostrarMatriz(String[][] matriz) {
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	    System.out.println("Pista: Nombre del progroama");
	}
	
	public static char[] pedirletras() {
		Scanner sc = new Scanner(System.in);
		char[] letras = new char[5];
		String aux;
		
		for(int i = 0; i<4;i++) {
			
			System.out.println("Introduce una consonante: ");
			
				aux = sc.next();
				aux = aux.toUpperCase();
				letras[i] = aux.charAt(0);
				
				while(letras[i] == 'A' ||letras[i] == 'E' || letras[i] == 'I' ||letras[i] == 'O' ||letras[i] == 'U') {
					
					System.out.println("Introduce una letra valida: ");
					aux = sc.next();
					aux = aux.toUpperCase();
					letras[i] = aux.charAt(0);
					
				}
				
				
				
		}
			System.out.println("Introduce una vocal");
		
			aux = sc.next();
			aux = aux.toUpperCase();
			letras[4] = aux.charAt(0);
			while(letras[4] != 'A' ||letras[4] != 'E' || letras[4] != 'I' ||letras[4] != 'O' ||letras[4] != 'U') {
				
				System.out.println("Introduce una letra valida: ");
				aux = sc.next();
				aux = aux.toUpperCase();
				letras[4] = aux.charAt(0);
				
			}
	
		
		
		return letras;
	}
	
	
	
	
}
