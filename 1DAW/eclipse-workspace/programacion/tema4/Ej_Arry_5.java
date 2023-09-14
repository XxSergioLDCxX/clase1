package tema4;

import java.util.*;
public class Ej_Arry_5 {

	public static void main(String[] args) {
		
		ArrayList<String> clase = new ArrayList<String>();
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		
		clase.add("Jose Maria");
		clase.add("Antonio");
		clase.add("Carlos");
		clase.add("David");
		clase.add("Alberto");
		clase.add("Palacios");
		clase.add("Golderos");
		clase.add("Chavi");
		clase.add("Sergio");
		clase.add("Juan Antonio");
		clase.add("Sergio");
		clase.add("Dani");
		clase.add("Carlos frances");

		Collections.sort(clase);
		
		 for (int i = 0; i < clase.size(); i++) {
	            System.out.println(i + ":" + clase.get(i));
		
	}
	}

}
