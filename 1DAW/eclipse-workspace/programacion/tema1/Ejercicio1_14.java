package tema1;

import java.util.Scanner;

public class Ejercicio1_14 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Cual es el radio de tu circunferencia");
		
		double radio = leer.nextDouble();
		
		final double PI = 3.141594;
		
		double area = PI * (radio*radio);
		
		System.out.println("El area es: " + area);
	}

}
