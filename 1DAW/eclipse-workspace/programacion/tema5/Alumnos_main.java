package tema5;


import java.util.ArrayList;
import java.util.Scanner;


public class Alumnos_main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int end = 0;
		
		ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
		
		while(end != 1) {
			
			System.out.println("MENU");
			int menu = sc.nextInt();
			switch(menu) {
			
			case 1:
				rellenar(alumnos);
				break;
				
			case 2:
				ver(alumnos);
				break;
			
			
			}
			
			
		}

	}
	
	public static ArrayList<Alumnos> rellenar(ArrayList<Alumnos> alumnos){
		System.out.println("Nombre");
		String nombre = sc.next();
		System.out.println("Nota 1");
		int n1 = sc.nextInt();
		System.out.println("Nota 2");
		int n2 = sc.nextInt();
		
		
		
		Alumnos uno = new Alumnos(nombre, n1, n2);
		
		alumnos.add(uno);
		
		return alumnos;
	}
	
	public static void ver(ArrayList<Alumnos> alumnos) {
		System.out.println(alumnos);
		
	}

}
