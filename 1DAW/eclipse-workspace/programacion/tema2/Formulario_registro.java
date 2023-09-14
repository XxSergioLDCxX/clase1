package tema2;

import java.time.LocalDate;
import java.util.Scanner;

public class Formulario_registro {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 String user, name, apellido, dni, correo, password, ciudad, nacionalidad;
			
			
			//Primera letra mayusculas del username nombre y apellido
			 System.out.println("Introduce nombre de usuario");
			 user = agrandar();
			 
			
			System.out.println("Introduce tu nombre");
			 name = agrandar();
			
			System.out.println("Introduce tu apellido");
			 apellido = agrandar();
			 
			
			 //Edad en base a año
			 int año = edad();
			
			//Comprobar dni hasta estar correcto (8 numeros y 1 letra)
			
			 dni = dni();
			 
			//Pedir principo de correo no dominio (borrar @ hacia delante)
			
			 correo = correo();
			 
			 //pedir ciudad
			 
			 ciudad = ciudad();
			 
			 
			//Nacionalidad no pueden ser numeros
			
			 nacionalidad = nacionalidad();
			 
			//Contraseña contiene 1 mayuscula y min 3 numeros
			
			 password = password();
			 
			//Confirmar datos o cancelar
			
			 menu(user, name, apellido, año, dni, correo, nacionalidad, password, ciudad);
			 
			 
			
		
		
		

	}
	//Metodo para pones mayusculas en cualquier nombre y apellido
	public static String agrandar() {
		
		
		String palabra;
		
		palabra = sc.nextLine();
		
		palabra = palabra.toUpperCase().charAt(0) + palabra.substring(1);
		
		for(int i = 0; i < palabra.length(); i++) {
			 
			//Guion en el apellido a espacio
			 if(palabra.charAt(i) == ' ' || palabra.charAt(i) == '-') {
					
				 palabra =palabra.toUpperCase().charAt(0) + palabra.substring(1, i)+ " " + palabra.toUpperCase().charAt(i+1) + palabra.substring(i+2) ;
				}
			 
		 }
		return palabra;
	}
	
	public static int edad() {

		int año = LocalDate.now().getYear();
		int nacimiento = 0;
		
		while (nacimiento < 1 || nacimiento > año) {
			System.out.println("Introduce el año de nacimiento");
		nacimiento = sc.nextInt(); 
			
		}
		
		
		int edad = año - nacimiento;
		return edad;
		
	}

	public static String dni() {
		
		
		int contadorN, contadorL;
		
			String dni;

		do {
			System.out.println("Introduce un DNI");
			dni = sc.nextLine();
			
			contadorN = 0;
			contadorL = 0;
			for(int i= 0; i < dni.length(); i++) {
			
			if (!((dni.charAt(i) >= 'a' && dni.charAt(i) <= 'z') || (dni.charAt(i) >= 'A' && dni.charAt(i) <= 'Z') || dni.charAt(i) == ' ')) {
				contadorN++;
			}else {
				contadorL++;
			}
			
		}
		} while (contadorN != 8 || contadorL !=1);
		
		dni = dni.substring(0, 8) + dni.toUpperCase().charAt(8) ;
		return dni;
	}
	
	public static String correo() {
		
		System.out.println("Introduce un correo (Solo el nombre, sin el dominio)");
		String correo = sc.nextLine();
		
		for(int i = 0; correo.length() > i; i++){
			
			if(correo.charAt(i) == '@') {
				
				correo = correo.substring(0,i);
			}
		}
		
		return correo;
	}
	
	public static String ciudad() {
		
		System.out.println("Introduce la ciudad donde vives");
		String ciudad = sc.nextLine();
		
		return ciudad;
		
	}
	
	public static String nacionalidad() {
	
		int contadorN = 0;
		String nacio;
		do {
			System.out.println("Introduce tu nacionalidad");
			nacio= sc.nextLine();
			contadorN = 0;
			for (int i = 0; nacio.length() > i; i++) {
			
				if ((nacio.charAt(i) >= '0' && nacio.charAt(i) <= '9') ) {
					contadorN++;
				}
				
				
			}
			
		} while (contadorN != 0);
		
		return nacio;
	}
	
	public static String password() {
		
		String pass;
		int contadorM = 0, contadorN = 0;
		
		
		do {
			contadorM = 0;
			contadorN= 0;
			
			System.out.println("Introduce tu contraseña (Debe contener 1 mayuscula y 3 numeros)");
			pass = sc.nextLine();
			
			for (int i = 0; pass.length() > i; i++) {

				if((pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')) {
					
					contadorM++;
				}else if((pass.charAt(i) >= '1' && pass.charAt(i) <= '9')) {
					contadorN++;
				}
				
			}
			
		} while (contadorM < 1 || contadorN < 3);
		
		
		
		return pass;
	}
	
	public static void menu(String user, String name, String apellido, int año, String dni, String correo, String nacionalidad, String password, String ciudad) {
		int opcion = 0;
		
		while (opcion<1 || opcion > 2) {
			
			
			System.out.println("Presione una opcion");
			System.out.println("1. Guardar datos");
			System.out.println("2. Cancelar");
			opcion = sc.nextInt();
			
		}
		
		
		switch (opcion) {
		case 1: {
			System.out.println("Nombre de usuario: " + user);
			System.out.println("Nombre: " + name);
			System.out.println("Apellidos: " + apellido);
			System.out.println("Edad: " + año);
			System.out.println("DNI: " + dni);
			System.out.println("Correo electronico" + correo);
			System.out.println("Vives en: " + ciudad);
			System.out.println("Nacionalidad: " + nacionalidad);
			System.out.println("Contraseña: " + password);
			
		}break;
		case 2: {
			System.out.println("Cerrando programa...");
		}
		
		default:
			
		}
		
		
	}
	
}
