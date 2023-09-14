package tema2;

import java.util.Scanner;

public class MOD_ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// pedir datos
		System.out.println("Introduzca el radio");
		int radio = sc.nextInt();

		System.out.println("Introduzca la altura");
		int altura = sc.nextInt();

		// entrar al menu
		System.out.println("Introduce 1 para area y 2 para el volumen");
		int n = sc.nextInt();

		// menu de opciones
		switch (n) {

		case 1: {
			System.out.println("Calculando area");
			area(radio, altura);
		}
			break;
		case 2: {
			System.out.println("Calculado volumen");
			volumen(radio, altura);
		}
			break;

		default:

			System.out.println("Error");

			break;
		}
	}

	// metodo area
	public static void area(int radio, int altura) {
		final double pi = 3.14;
		double area = 2 * pi * radio * altura;
		System.out.println("El area es: " + area);
	}

	// metodo volumen	
	public static void volumen(int radio, int altura) {
		final double pi = 3.14;
		double volumen = pi * (radio*radio) * altura;
		System.out.println("El volumen es: " + volumen);
		
	}
}
