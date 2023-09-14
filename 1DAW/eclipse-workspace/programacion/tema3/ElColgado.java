package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class ElColgado {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		boolean end = false,acierto,repe = false;
		int vida = 7;
		String respuesta;
		
		//Palabra creada para comparar
		char[] palabra = {
				'g','o','l','p','e','a','r'
				
		};
		//Palabra para rellenar
		char[] resolver = {
				'_','_','_','_','_','_','_'
		};

		//bucle para repetir los metodos hasta terminar el juego
		while (vida != 0 && end != true) {
			
			
			mostrar(resolver, vida);
			respuesta = preguntar();
			acierto = comprobar(respuesta, palabra);
			repe = coincidencia(resolver, respuesta);
			
			if(repe == false) {
			
			if(acierto == true) {
				
				resolver = rellenar(palabra, resolver, respuesta);
				
			}else {
				vida--;
				System.out.println("La letra no coincide");
			}
			}
			
			
			end = fin(palabra, resolver);
		}
		
		if(vida != 0) {
			System.out.println("Felicidades has descubierto la palabra");
		}else {
			System.out.println("Mala suerte, no has descubierto la palabra, mas suerte la proxima");
		}
		
		System.out.println("Fin del juego");
	}
	
	//Metodo para mostrar el progreso de tu palabra
	public static void mostrar(char[] resolver, int vida){
		
		System.out.println(Arrays.toString(resolver));
		System.out.println("Te quedan " + vida + " intentos");
		System.out.println("Pista: Acciona que haces cuando le pegas ha alguien/algo");
		
	}
	
	
	//Metodo para preguntasr 1 letra y asegurar que sea 1 sola letra
	public static String preguntar() {
		
		System.out.println("Introduce una letra");
		String pregunta = sc.next();
		pregunta = pregunta.toLowerCase();
		
	//blucle para repetir pregunta hasta introducir 1 letra 	
		while(pregunta.length() < 1 || pregunta.length()>1) {
			
			System.out.println("vuelve a intentarlo");
			pregunta = sc.next();
			
		}
		
		
		return pregunta;
	}
	
	public static boolean comprobar(String respuesta, char[] palabra) {
		
		boolean acierto = false;
		int bien= 0; 
		for(int i = 0;i<palabra.length;i++) {
			
			if(respuesta.charAt(0) == palabra[i]) {
				
				bien++;
				
			}
			
		}
		if(bien > 0) {
			
			acierto = true;
		}
		return acierto;
		
	}
	
	public static char[] rellenar (char[] palabra, char[] resolver, String respuesta) {
		
		for(int i = 0; i<palabra.length;i++) {
			
			if(respuesta.charAt(0)== palabra[i]) {
				
				resolver[i] = palabra[i];
				
			}
			
		}		
		
		return resolver;
	}
	
	public static boolean fin(char[] palabra, char[] resolver) {
		boolean end;
		
			if(Arrays.equals(palabra, resolver)) {
				
				end = true;
				
			}else {
				end = false;
			}
		
		return end;
	}
	public static boolean coincidencia(char[] resolver, String respuesta) {
		boolean repe = false;
		
		for(int i = 0;i<resolver.length;i++) {
			
			if(resolver[i] == respuesta.charAt(0)) {
				System.out.println("La letra introducida ya ha sido escrita");
				repe = true;
			}
			
		}
		
		return repe;
		
		
	}
	
}
