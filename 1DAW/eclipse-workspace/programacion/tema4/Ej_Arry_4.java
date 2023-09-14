package tema4;

import java.util.*;
public class Ej_Arry_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 1;
		double aux = 0;
		ArrayList<Double> num = new ArrayList<Double>();
		
		 while(menu != 0) {
			 
			System.out.println("Introduce un numero decimal: ");
			aux = sc.nextDouble();
			
			if (aux == 0) {
				menu = 0;
			}else {
				num.add(aux);
			}
			 
		 }
		 System.out.println("El resultado es: " + num);
		 
		
	}

}
