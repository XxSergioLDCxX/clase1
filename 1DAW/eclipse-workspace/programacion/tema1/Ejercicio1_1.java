package tema1;

import java.util.Scanner;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int n1 = leer.nextInt();
		System.out.println("Ingrese otro numero");
		int n2 = leer.nextInt();

		boolean res, res2, res3, res4, res5, res6;

		res = n1 > n2;

		System.out.println("El " + n1 + " es mayor que el " + n2 + " : " + res);

		res2 = n1 >= n2;

		System.out.println("El " + n1 + " es mayor o igual que el " + n2 + " : " + res2);

		res3 = n1 <= n2;

		System.out.println("El " + n1 + " es menor o igual que el " + n2 + " : " + res3);

		res4 = n1 < n2;

		System.out.println("El " + n1 + " es menor que el " + n2 + " : " + res4);

		res5 = n1 == n2;

		System.out.println("El " + n1 + " y " + n2 + " son iguales: " + res5);

		res6 = n1 != n2;

		System.out.println("El " + n1 + " y " + n2 + " son distintos: " + res6);

	}

}
