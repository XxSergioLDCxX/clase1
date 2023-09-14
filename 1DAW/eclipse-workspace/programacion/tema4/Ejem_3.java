package tema4;

import java.util.*;
public class Ejem_3 {

	public static void main(String[] args) {
		ArrayList<Integer> nm = new ArrayList<Integer>();
		
		for (int i = 0; i<20;i++) {
			
			int numero = (int) (Math.random() * 99) + 1;
			nm.add(numero);
			
		}

		System.out.println(nm);
		System.out.println("El tamaño del array es: " + nm.size());
		System.out.println("Borrando la posicion 10");
		nm.remove(10);
		System.out.println("El tamñano del array es: " + nm.size());
		
		System.out.println(nm);
		
		Collections.sort(nm);
		System.out.println("El numero mas pequeño es: " + nm.get(0));
		System.out.println("El numero mas grande es: " + nm.get(nm.size()-1));
	}

}
