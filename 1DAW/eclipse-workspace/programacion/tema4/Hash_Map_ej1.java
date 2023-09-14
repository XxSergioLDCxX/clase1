package tema4;

import java.util.*;

public class Hash_Map_ej1 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		HashMap<String, String> paises = new HashMap<String, String>();

		int end = 0, opcion, contador;
		String pais, capital, pregunta;

		while (end != 1) {
			System.out.println("Introduce una opcion");
			System.out.println("1. Añadir pais y capital");
			System.out.println("2. Eliminar 1 pais");
			System.out.println("3. Vaciar lista");
			System.out.println("4. Acceder a un pais");
			System.out.println("0. Salir");
			opcion = sc.nextInt();
			switch (opcion) {

			case 1:
				// añadir
				System.out.println("Introduce el nombre del pais");
				pais = sc.next();
				System.out.println("Introduce la capital");
				capital = sc.next();

				paises.put(pais, capital);

				System.out.println(paises);
				break;
			case 2:
				System.out.println("Que pais quieres eliminar");
				System.out.println(paises);
				pregunta = sc.next();

				paises.remove(pregunta);

				break;

			case 3:

				System.out.println("Vaciando...");
				paises.clear();

				break;

			case 4:

				System.out.println("Que pais quieres acceder");
				pregunta = sc.next();

				System.out.println("La capital de " + pregunta + "es: " + paises.get(pregunta));
				break;

			default:
				end = 1;
			}

		}

	}

}
