package tema4;

import java.util.*;
public class Ej_Arry_2 {

	public static void main(String[] args) {
		ArrayList<String> coches = new ArrayList<String>();
		
		coches.add("MSI");
		coches.add("Acer");
		coches.add("Honor");
		coches.add("HP");
		coches.add("Apple");
		coches.add("Asus");
		
		System.out.println(coches);
		System.out.println("La primera posicion es: " + coches.get(0));
		int tamaño = coches.size();
		System.out.println("La ultima posicion es: " + coches.get(tamaño - 1));
		
		System.out.println("Las marcas que empiezan con A son: ");
		for (int i = 0;i<coches.size();i++) {
			
			if(coches.get(i).toLowerCase().charAt(0) == 'a') {
				System.out.println(coches.get(i));
			}
			
		}
		
		
		
	}

}
