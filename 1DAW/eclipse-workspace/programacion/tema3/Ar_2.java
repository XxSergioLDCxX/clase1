package tema3;

import java.util.Scanner;

public class Ar_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		
		for(int i = 0; i < a.length;i++ ) {
			
			System.out.println("Introduce el valor " + (i+1));
			a[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < a.length;i++ ) {
			
			System.out.print(a[i]+ " ");
			
			
		}

	}

}
