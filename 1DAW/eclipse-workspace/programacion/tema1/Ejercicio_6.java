package tema1;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio");
		double radio = sc.nextDouble();
		
		final double PI = 3.141594;
		
		double resultado = 2*PI*radio;
		System.out.println("La longitud es " + resultado);
		

	}

}
