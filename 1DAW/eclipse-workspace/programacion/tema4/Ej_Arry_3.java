package tema4;

import java.util.*;
public class Ej_Arry_3 {

	public static void main(String[] args) {
		
		ArrayList<String> coches = new ArrayList<String>();
		
		coches.add("BMW");
		coches.add("Mercedes");
		coches.add("Audi");
		coches.add("Renault");
		coches.add("Volvo");
		coches.add("Mazda");
		coches.add("Ford");
		coches.add("Nisan");
		coches.add("Fiat");
		coches.add("Mitsubishi");
		
		System.out.println("El tamaño actual de la lista es: " + coches.size());
		System.out.println(coches);
		for(int i = 0; i<coches.size();i++){
			
			if(coches.get(i).toLowerCase().charAt(0) == 'm') {
				coches.remove(i);
			}	
		}
		System.out.println("Despues de borrar las marcas con m este es el tamaño: " + coches.size());
		System.out.println(coches);
			
		

	}

}
