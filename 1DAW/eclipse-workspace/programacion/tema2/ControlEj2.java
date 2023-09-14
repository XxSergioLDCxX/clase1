package tema2;

import java.util.Scanner;

public class ControlEj2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor positivo");
		int x = sc.nextInt();
		
		while(x<0) {
			System.out.println("Introduce un valor valido: " );
			x = sc.nextInt();
		}
	}

}
