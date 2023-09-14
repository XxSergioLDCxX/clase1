package tema3;

import java.util.Arrays;

public class Ar_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valor = new int[10];
		
		for(int i = 1; i != valor.length;i++) {
			
			valor[i] = valor[i-1] + i;
			
		}
		
		valor = orden(valor);
		
		valor[9] = valor[8] + valor.length;
		

		System.out.println(Arrays.toString(valor));
		
	}
	
	public static int[] orden(int[] valor) {
		
		int[] nuevo = new int[10];
		
		for(int i = 1; i != valor.length;i++) {
			
			nuevo[i-1] = valor[i];
			
		}
		 
		
		return nuevo;
	}
	
	

}
