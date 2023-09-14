package tema1;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio16a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalDate fecha = LocalDate.now();
		
		System.out.println("Pon tu año de nacimiento: ");
		
		int año = sc.nextInt();
		
		int edad = fecha.getYear() - año;
		
		System.out.println("Tienes " + edad + " años");

	}

}
