package tema2;

import java.util.Scanner;

public class EjerciciosClase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el numero 1: ");
		int n1 = sc.nextInt();

		System.out.println("Introduzca el numero 2: ");
		int n2 = sc.nextInt();
		
		System.out.println("Introduzca el numero 3:");
		int n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			if(n2>n3) {
				System.out.println(n1+" "+n2+" "+n3);
			}else System.out.println(n1+" "+n3+" "+n2);
		}

	}

}
