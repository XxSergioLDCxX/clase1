package tema3;

import java.util.Scanner;

public class Ar_4 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		String[] nombres = new String[3];
		
		for(int i = 0; i<nombres.length;i++) {
			
			System.out.println("Introduce el nombre numero " + (i+1));
			nombres[i] = sc.next();
			
		}
		
		
		
		for(int i = 0;i < nombres.length; i++) {
			
			System.out.println(nombres[i]);
			
		}

	}

}
