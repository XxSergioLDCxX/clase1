package tema3;

import java.util.Scanner;

	public class Ar_6 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		numeros = rellenar(numeros);
		
		mostrar(numeros);
	
	}

	public static int[] rellenar(int[] numeros) {
		
		for(int i = 0; i<numeros.length;i++) {
			
			numeros[i] = (int) (Math.random()*30+1);
			
			
		}
			
		return numeros;
	}
	
	public static void mostrar(int[] numeros) {
		
		for(int i = 0; i<numeros.length;i++) {
			
			System.out.print(numeros[i]+ " | ");
		}
		
		
	}

}
