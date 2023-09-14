package tema4;

import java.util.*;
public class Ej_Arry_6 {

	public static void main(String[] args) {
		 ArrayList<String> marcasMotos = new ArrayList<>();
	        marcasMotos.add("Honda");
	        System.out.println("Tamaño del ArrayList: " + marcasMotos.size()); // Tamaño: 1
	        marcasMotos.add("Kawasaki");
	        System.out.println("Tamaño del ArrayList: " + marcasMotos.size()); // Tamaño: 2
	        marcasMotos.add("Ducati");
	        System.out.println("Tamaño del ArrayList: " + marcasMotos.size()); // Tamaño: 3
	        marcasMotos.set(1, "Yamaha"); // Actualiza la segunda posición a Yamaha
	        System.out.println("Lista de marcas: " + marcasMotos);
	}

}
