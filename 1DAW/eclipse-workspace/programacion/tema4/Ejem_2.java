package tema4;

import java.util.*;
public class Ejem_2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(54);
		numeros.add(33);
		numeros.add(43);
		numeros.add(13);
		numeros.add(54);
		numeros.add(34);
		numeros.add(75);
		numeros.add(27);
		numeros.add(4);
		numeros.add(10);
		
		System.out.println("A. " + numeros);
		System.out.println("B. La posicion 0 es: " + numeros.get(0));
		System.out.println("la posicion 7 es: " + numeros.get(7));
		
		numeros.set(3, 100);
		System.out.println("C." + numeros);
		
		numeros.remove(5);
		System.out.println("D." + numeros);
		

	}

}
