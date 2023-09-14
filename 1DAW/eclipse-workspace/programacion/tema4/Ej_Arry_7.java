package tema4;

import java.util.ArrayList;

public class Ej_Arry_7 {

	public static void main(String[] args) {
		 ArrayList<String> marcasMotos = new ArrayList<>();
	        marcasMotos.add("Honda");
	        marcasMotos.add("Kawasaki");
	        marcasMotos.add("Ducati");
	        marcasMotos.add("Harley");

	        System.out.println(marcasMotos);
	        for (int i = 0; i < marcasMotos.size(); i++) {
	            if (marcasMotos.get(i).startsWith("H")) {
	                marcasMotos.set(i, null);
	            }
	        }
	        System.out.println("Lista de marcas: " + marcasMotos);

	}

}
