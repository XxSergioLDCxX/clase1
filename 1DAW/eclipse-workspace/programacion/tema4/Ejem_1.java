package tema4;

import java.util.*;
public class Ejem_1 {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		numero.add(22);
		numero.add(77);
		numero.add(11);
		System.out.println("Primer elemento: " + numero.get(0));
		System.out.println("Segundo elemento: " + numero.get(1));
		System.out.println("Tercer elemento: " + numero.get(2));
		numero.set(1, 33);
		System.out.println(numero	);

	}

}
