package tema2;

import java.util.Scanner;

public class Parimpardo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n;
		do {
			System.out.println("Introduce un numero entero. (Pon 0 para salir)");
			n = sc.nextInt();
			
			if(n%2 == 0) {
				System.out.println("Es par");
			}else System.out.println("Es inpar");
		}while(n != 0); 
		System.out.println("Final del programa");
	}

}
