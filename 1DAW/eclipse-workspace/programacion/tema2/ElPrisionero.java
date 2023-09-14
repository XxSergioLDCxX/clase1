package tema2;

import java.util.Scanner;

public class ElPrisionero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// seleccionar dificultado
		int daño = dificultad();

		int vida = 5;
		boolean resultado;

		// nickname
		System.out.println("Introduce tu nombre de usuario(Maximo 12 caracteres)");
		String nick = sc.next();
		while (nick.length() > 12) {
			System.out.println("Introduce un nombre valido");
			nick = sc.next();
			
		}
		
		// Inicio del juego
		System.out.println("El prisionero " + nick +" ha conseguido abrir la puerta de su calabozo, pero necesitará pasar por 5 escenarios");
		System.out.println(" para escapar del castillo.");
		// pregunta1

		resultado = p1();

		if (resultado == true) {

			vic(vida, nick);
		} else {
			vida = lose(vida, daño, nick);

		}

		// pregunta2
		if (vida > 0) {
			resultado = p2();

			if (resultado == true) {

				vic(vida, nick);
			} else {
				vida = lose(vida, daño, nick);

			}
		}

		// pregunta3
		if (vida > 0) {

			resultado = p3();

			if (resultado == true) {

				vic(vida, nick);
			} else {
				vida = lose(vida, daño, nick);

			}
		}

		// pregunta4
		if (vida > 0) {
			resultado = p4();

			if (resultado == true) {

				vic(vida, nick);
			} else {
				vida = lose(vida, daño, nick);

			}
		}

		// pregunta5
		if (vida > 0) {
			resultado = p5();

			if (resultado == true) {

				vic(vida, nick);
			} else {
				vida = lose(vida, daño, nick);

			}
		}

		// Resultados

		if (vida > 0) {
			System.out.println("Has sobrevivido con " + vida + " puntos de vida");
		} else {
			System.out.println("Has pedrido, no has conseguido salir del castillo");
		}

	} // final de main

	// seleccionar dificultad
	public static int dificultad() {
		Scanner sc = new Scanner(System.in);

		// menu de dificultad
		System.out.println("Seleccione su dificultad: ");
		System.out.println("1.Facil (Tienes 5 intentos)");
		System.out.println("2.Medio (Tienes 3 intentos)");
		System.out.println("3.Dificil (Solo tienes 1 golpe)");

		int daño = 0;
		int dif = sc.nextInt();

		while (dif < 1 || dif > 3) {

			System.out.println("Introduce un valor valido");
			dif = sc.nextInt();
		}

		switch (dif) {
		case 1: {
			daño = 1;
		}
			break;
		case 2: {
			daño = 2;
		}
			break;
		case 3: {
			daño = 5;
		}
			break;
		}

		return daño;
	}

	// ganar
	public static void vic(int vida, String nick) {

		System.out.println("Enorabuena " + nick + " has ganado, te quedan " + vida + " puntos de vida");

	}

	// perder vida
	public static int lose(int vida, int daño, String nick) {

		System.out.println("Error");
		String mensaje = mensajes();
		System.out.println(mensaje);
		System.out.println("Lo siento " + nick + " has perdido " + daño + " punto de vida");
		vida = vida - daño;
		System.out.println("Te quedan " + vida + " puntos de vida");

		return vida;
	}

	// preguntas
	public static boolean p1() {
		Scanner sc = new Scanner(System.in);
		// pregunta 1 (Respuesta 3)
		System.out.println("----------------------------");
		System.out.println("Pregunta 1: Geografia ");
		System.out.println("¿Cual es la capital de españa?");
		System.out.println("1.Gibraltar");
		System.out.println("2.Malaga");
		System.out.println("3.Madrid");
		System.out.println("4.Andorra");
		int respuesta1 = sc.nextInt();

		while (respuesta1 < 1 || respuesta1 > 4) {

			System.out.println("Introduce un valor valido");
			respuesta1 = sc.nextInt();
		}
		boolean resultado = respuesta1 == 3;
		return resultado;
	}

	public static boolean p2() {
		Scanner sc = new Scanner(System.in);

		// pregunta 2 (Respuesta 2)
		System.out.println("----------------------------");
		System.out.println("Pregunta 2: Lengua Castellana ");
		System.out.println("¿Quien fue el autor del Quijote?");
		System.out.println("1.Manolo lama");
		System.out.println("2.Miguel de cervantes");
		System.out.println("3.El fary");
		System.out.println("4.Los chunguitos");
		int respuesta2 = sc.nextInt();

		while (respuesta2 < 1 || respuesta2 > 4) {

			System.out.println("Introduce un valor valido");
			respuesta2 = sc.nextInt();
		}
		boolean resultado = respuesta2 == 2;
		return resultado;
	}

	public static boolean p3() {
		Scanner sc = new Scanner(System.in);

		// pregunta 3 (Respuesta 4)
		System.out.println("----------------------------");
		System.out.println("Pregunta 3: Matematicas ");
		System.out.println("Calcula el valor de x: ");
		System.out.println("2x+5=x-4");
		System.out.println("1.x=4");
		System.out.println("2.x=1");
		System.out.println("3.x=x");
		System.out.println("4.x=5");
		int respuesta3 = sc.nextInt();

		while (respuesta3 < 1 || respuesta3 > 4) {

			System.out.println("Introduce un valor valido");
			respuesta3 = sc.nextInt();
		}
		boolean resultado = respuesta3 == 2;
		return resultado;
	}

	public static boolean p4() {
		Scanner sc = new Scanner(System.in);

		// pregunta 4 (Respuesta 1)
		System.out.println("----------------------------");
		System.out.println("Pregunta 4: Educacion fisica ");
		System.out.println("¿Cual es el deporte en el que se le da patadas a un balon?");
		System.out.println("1.Balon mano");
		System.out.println("2.Futbol");
		System.out.println("3.Golf");
		System.out.println("4.Tenis");
		int respuesta4 = sc.nextInt();

		while (respuesta4 < 1 || respuesta4 > 4) {

			System.out.println("Introduce un valor valido");
			respuesta4 = sc.nextInt();
		}
		boolean resultado = respuesta4 == 2;
		return resultado;
	}

	public static boolean p5() {
		Scanner sc = new Scanner(System.in);

		// pregunta 5 (Respuesta 2)
		System.out.println("----------------------------");
		System.out.println("Pregunta 5: Fisica ");
		System.out.println("¿Cual es la fuerza que atrae los cuerpos al suelo?");
		System.out.println("1.Centrifugado");
		System.out.println("2.Friccion");
		System.out.println("3.Rotacion");
		System.out.println("4.Gravedad");
		int respuesta5 = sc.nextInt();

		while (respuesta5 < 1 || respuesta5 > 4) {

			System.out.println("Introduce un valor valido");
			respuesta5 = sc.nextInt();
		}
		boolean resultado = respuesta5 == 4;
		return resultado;
	}

	public static String mensajes() {

		int numero = (int) (Math.random() * 10 + 1);

		String mensaje = " ";
		
		switch (numero) {

		case 1: {
			mensaje = "Te has tropezado y te has dado con el pomo de la puerta en la cabeza";
		}
			break;
		case 2: {
			mensaje = "Te has resvalado con un charco en el suelo y te has hecho daño en la espalda";
		}
			break;
		case 3: {
			mensaje = "Has ido a abrir la puerta y te has dado con ella en el dedo pequeño del pie";
		}
			break;
		case 4: {
			mensaje = "Te has asustado de tu propia sombre y te has dado un golpe con la pared";
		}
			break;
		case 5: {
			mensaje = "Te has torcido un tobillo";
		}
			break;
		case 6: {
			mensaje = "Te has mordido tan fuerte que te esta sangrando la lengua";
		}
			break;
		case 7: {
			mensaje = "Has intentado pasar por la puerta aunque esta cerrada y te has dado en la cabeza";
		}
			break;
		case 8: {
			mensaje = "Se te a caido un cacho de techo en el pie";
		}
			break;
		case 9: {
			mensaje = "Te has pillado la mano con la puerta";
		}
			break;
		case 10: {
			mensaje = "Te has quemado con una antorcha";
		}
			break;
		}
		
		return mensaje;
	}

}
