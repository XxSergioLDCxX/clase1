package tema1;

import java.util.Scanner;

public class Ejercicio1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preciomanzanas = 2.35;
		double precioperas = 1.95;
		double total1;
		double total2;
		
		System.out.println("kilos vendidos de manzanas en el primer semestre: ");
		int kilosmanzanas1 = sc.nextInt();
		
		System.out.println("kilos vendidos de peras en el primer semestre: ");
		int kilosperas1 = sc.nextInt();
		
		total1 = (preciomanzanas * kilosmanzanas1) + (precioperas * kilosperas1);
		
		System.out.println("kilos vendidos de manzanas en el segundo semestre: ");
		int kilosmanzanas2 = sc.nextInt();
		
		System.out.println("kilos vendidos de peras en el segundo semestre: ");
		int kilosperas2 = sc.nextInt();
		
		total2 = (preciomanzanas * kilosmanzanas2) + (precioperas * kilosperas2);
		
		
		
		
		
		System.out.println("En el ultimo año los beneficios son: " + (total1 + total2) + "€");

	}

}
