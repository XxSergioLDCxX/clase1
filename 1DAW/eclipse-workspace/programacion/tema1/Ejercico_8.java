package tema1;

import java.util.Scanner;

public class Ejercico_8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declaro el nombre de las variables
		int a, b, aux;
	
		//Pregunto por A
		System.out.println("Valor de A: ");
		
		a = sc.nextInt();
		
		//Pregunto por b
		System.out.println("valor de B");
		
		b = sc.nextInt();
		
		//Guardamos el valor de a en aux
		aux = a;
		
		//Ponemos el valor de b dentro de a
		a = b;
		
		//Asignamos el valor de a que hemos guardado en aux en b
		b = aux;
		
		System.out.println("Valor de a: " + a + " valor de b: " + b);
	}

}
