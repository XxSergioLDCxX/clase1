package tema3;

import java.util.Scanner;

public class Ar_5 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		numeros = rellenar(numeros);
		
		mostrar(numeros);
	
	}

	public static int[] rellenar(int[] numeros) {
		
		for(int i = 0; i<numeros.length;i++) {
			
			System.out.println("Introduzca el valor " + i + " (Deve ser un valor entre 1 y 9)");
			numeros[i] = sc.nextInt();
			
			
			
			while( numeros[i] < 1 || numeros[i] > 9) {
				
				System.out.println("Introduce un valor valido");
				numeros[i] = sc.nextInt();
				
			}
			
		}
			
		return numeros;
	}
	
	public static void mostrar(int[] numeros) {
		
		for(int i = 0; i<numeros.length;i++) {
			
			System.out.print(numeros[i]+ " | ");
		}
		
	}
}
