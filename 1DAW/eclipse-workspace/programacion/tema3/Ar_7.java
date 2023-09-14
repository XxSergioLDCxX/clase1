package tema3;

import java.util.Arrays;

public class Ar_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		Arrays.sort(numeros);
		
		for(int i = 0; i<numeros.length;i++) {
			
			System.out.print(numeros[i]+ " | ");
		}
		
		//Otra forma de mostrar el array
		System.out.println(Arrays.toString(numeros));
		
		
	}
	}


