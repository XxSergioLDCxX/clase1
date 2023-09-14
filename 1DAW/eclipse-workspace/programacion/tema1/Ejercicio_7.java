package tema1;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Notas del primer trimestre: ");
		double primer = sc.nextDouble();
		
		System.out.println("Notas del segundo trimestre ");
		double segundo = sc.nextDouble();
		
		System.out.println("Notas del tercer trimestre");
		double tercer = sc.nextDouble();
		
		double suma = primer + segundo + tercer;
		
		double media = suma / 3 ;
		System.out.println("La media (Con decimales) del curso es: " + media);
	}

}
