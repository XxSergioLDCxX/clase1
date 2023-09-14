package tema2;

import java.util.Scanner;

public class EjercicioClase6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nota: ");
		int a = sc.nextInt();

		if (a <= 4) {
			System.out.println("Suspenso");
		} else if (a == 5) {
			System.out.println("Suficiente");
		} else if (a == 6) {
			System.out.println("Bien");
		} else if (a <= 8) {
			System.out.println("Notable");
		} else if (a <= 9) {
			System.out.println("Sobresaliente");
		} else if (a == 10) {
			System.out.println("Matricula");
		} else
			System.out.println("Imposible");

		switch (a) {
		case 1:
			System.out.println("suspenso");
			break;
		case 2:
			System.out.println("suspenso");
			break;
		case 3:
			System.out.println("suspenso");
			break;
		case 4:
			System.out.println("suspenso");
			break;
		case 5:
			System.out.println("suficiente");
			break;
		case 6:
			System.out.println("bien");
			break;
		case 7:
			System.out.println("notable");
			break;
		case 8:
			System.out.println("notable");
			break;
		case 9:
			System.out.println("sobresaliente");
			break;
		case 10:
			System.out.println("Matricula");
			break;
		default:
			System.out.println("Imposible");
		}

	}

}
