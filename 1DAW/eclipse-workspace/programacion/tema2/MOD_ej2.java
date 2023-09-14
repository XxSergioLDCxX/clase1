package tema2;

import java.util.Scanner;

public class MOD_ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero1");
		int n1 = sc.nextInt();
		System.out.println("Numero2");
		int n2 = sc.nextInt();
		
		entre(n1, n2);

	}
	
	public static void entre(int n1, int n2) {
		
		for(int i =n1+1;i<n2;i++) {
			System.out.println(i);
		}
	}

}
