package tema4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cinquillo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = 0;

		ArrayList<Integer> oro = new ArrayList<Integer>();

		oro.add(5);

		while (end != 1) {

			System.out.println("Selecciona un palo");
			System.out.println("1.Oro");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				mostrar(oro);
				System.out.println();
				oro = rellenar(oro);

				break;

			default:
				System.out.println("Opcion invalida");
			}

		}
	}

	public static ArrayList<Integer> rellenar(ArrayList<Integer> mazo) {
		Scanner sc = new Scanner(System.in);
		// PEDIR NUMERO
		int n = 0;
		
		n = comprobar(mazo,n);

		// AÑADIR NUMERO
		mazo = añadir(mazo, n);

		return mazo;
	}

	public static int comprobar(ArrayList<Integer> mazo, int n) {
		
		//pedir numero
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero que quieres introducir");
		n = sc.nextInt();
		
		//no esta repetido
		int contador = 0;
		for (int i = 0; i < mazo.size(); i++) {
			if (n == mazo.get(i)) {
				contador++;
			}
			if (n<1) {
				contador++;
			}
			if (n>10) {
				contador++;
			}
			if(n != (mazo.get(0))-1) {
				contador++;
			}
			
		}

		while (contador != 0) {
			System.out.println("Numero invalido");
			n = sc.nextInt();
			 contador = 0;
			for (int i = 0; i < mazo.size(); i++) {
				if (n == mazo.get(i)) {
					contador++;
				}
				if (n<1) {
					contador++;
				}
				if (n>10) {
					contador++;
				}
				
			}
			
		}
		
		
		//no es mayor de 10 ni menor de 1
		
		

		return n;
		
	}

	public static ArrayList<Integer> añadir(ArrayList<Integer> mazo, int n) {

		mazo.add(n);
		Collections.sort(mazo);

		return mazo;

	}

	public static void mostrar(ArrayList<Integer> mazo) {

		for (int i = 0; i < mazo.size(); i++) {

			System.out.print("[" + mazo.get(i) + "]");

		}

	}
}
