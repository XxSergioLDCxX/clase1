package tema1;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce la cantidad de huevos que se han recogido: ");
		
		int huevos = sc.nextInt();
		
		int docenas = huevos / 12;
		int sobras = huevos % 12;
		
		System.out.println("Se han recogido " + docenas + " docenas de huevos y sobran " + sobras + " huevos." );
		
		
	}
}
