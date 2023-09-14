package tema1;

import java.util.Scanner;

public class Ejercicio1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre de usuario: ");
		String user = sc.next();
		String resultado = user.toUpperCase().charAt(0) + user.substring(1, user.length()).toLowerCase();
	
		System.out.println("Introduzca su password: ");
		String pass = sc.next();
		String resultado2 = pass.toUpperCase().charAt(0) + pass.substring(1, pass.length()).toLowerCase();
		
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.next();
		String resultado3 = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
		
		System.out.println("Introduzca su apellido: ");
		String apellido = sc.next();
		String resultado4 = apellido.toUpperCase().charAt(0) + apellido.substring(1, apellido.length()).toLowerCase();
		
		System.out.println("Introduzca su año de nacimiento: ");
		int año = sc.nextInt();
		
		System.out.println("Introduzca su salario: ");
		double salario = sc.nextInt();
		
		System.out.println("------------------------------------------------");
		System.out.println("NOMBRE DE USUARIO: " + resultado);
		System.out.println("PASSWORD: " + resultado2);
		System.out.println("NOMBRE Y APELLIDOS: " + resultado3 + " " + resultado4);
		System.out.println("EDAD: " + (2022 - año));
		System.out.println("SALARIO: " + salario);
		
	}
}
