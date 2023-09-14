package tema2;

import java.util.Scanner;

public class EjercicioClase2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero del 0 al 99.999");
		int n1 = sc.nextInt();

		if (n1 <= 9 && n1 >= 0) {
			System.out.println("Tiene 1 cifra");
		} else if (n1 <= 99 && n1 >= 0) {
			System.out.println("Tiene 2 cifras");
		} else if (n1 <= 999 && n1 >= 0) {
			System.out.println("Tiene 3 cifras");
		} else if (n1 <= 9999 && n1 >= 0) {
			System.out.println("Tiene 4 cifras");
		} else
			System.out.println("Fuera de rango");
		
	}
}
