package prac1;

import java.time.LocalDate;
import java.util.*;

/**
 * Clase main de equipo
 * @author s-e-r
 *
 */
public class Main_equipo {
	/**
	 * Metodo main del programa
	 * @param args args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Jugador> equipo = new ArrayList<>();

		Fecha fecha1 = new Fecha(1999, 05, 10);
		Jugador jugador1 = new Jugador("Bernardino", "Naranjo Guerrero", "Naranjito", 1, "España", fecha1, "Portero",
				5000);
		equipo.add(jugador1);
		Fecha fecha2 = new Fecha(1993, 06, 17);
		Jugador jugador2 = new Jugador("Rafael", "Lopez Exposito", "Rafa", 13, "España", fecha2, "Portero", 2000);
		equipo.add(jugador2);
		Fecha fecha3 = new Fecha(1995, 02, 1995);
		Jugador jugador3 = new Jugador("Antonio", "Navarro Lopez", "Toñin", 18, "España", fecha3, "Portero", 1000);
		equipo.add(jugador3);
		Fecha fecha4 = new Fecha(1990, 10, 04);
		Jugador jugador4 = new Jugador("Rafael", "Lopez Exposito", "Rafa", 17, "España", fecha4, "Cierre", 2000);
		equipo.add(jugador4);
		Fecha fecha5 = new Fecha(1996, 05, 25);
		Jugador jugador5 = new Jugador("Deivid", "Pires da Silva Santos", "Santos", 17, "España", fecha5, "Cierre",
				6500);
		equipo.add(jugador5);
		Fecha fecha6 = new Fecha(2002, 05, 20);
		Jugador jugador6 = new Jugador("Antonio", "Sierra Garcia", "Sierra", 21, "Brasil", fecha6, "Ala", 4000);
		equipo.add(jugador6);
		Fecha fecha7 = new Fecha(1996, 05, 18);
		Jugador jugador7 = new Jugador("Alvaro", "Lopez del Pino", "Pino", 11, "España", fecha7, "Ala", 6000);
		equipo.add(jugador7);
		Fecha fecha8 = new Fecha(1999, 05, 30);
		Jugador jugador8 = new Jugador("Francisco", "Cortes Hernandez", "Kiko", 20, "España", fecha8, "Ala", 3000);
		equipo.add(jugador8);
		Fecha fecha9 = new Fecha(1983, 12, 02);
		Jugador jugador9 = new Jugador("Humberto", "Ribeiro Resende", "Humber", 23, "Brasil", fecha9, "Ala", 3500);
		equipo.add(jugador9);
		Fecha fecha10 = new Fecha(1995, 07, 15);
		Jugador jugador10 = new Jugador("Raul", "Campos Pino", "Campos", 30, "España", fecha10, "Ala", 4500);
		equipo.add(jugador10);
		Fecha fecha11 = new Fecha(1992, 05, 14);
		Jugador jugador11 = new Jugador("Juan Manuel", "Rodriguez Napolitano", "Juanma", 35, "Argentina", fecha11,
				"Ala-pivot", 4000);
		equipo.add(jugador11);
		Fecha fecha12 = new Fecha(1988, 01, 10);
		Jugador jugador12 = new Jugador("Juan Emilio", "Gil Camacho", "Emilio", 33, "España", fecha12, "Pivot", 2500);
		equipo.add(jugador12);
		Fecha fecha13 = new Fecha(1992, 06, 11);
		Jugador jugador13 = new Jugador("Daniel", "Gabriel Garcia", "Dani", 9, "España", fecha13, "Pivot", 1500);
		equipo.add(jugador13);
		Fecha fecha14 = new Fecha(1989, 04, 13);
		Jugador jugador14 = new Jugador("Jorge", "Valhermoso Matamoros", "Jorquel", 14, "España", fecha14, "Pivot",
				5000);
		equipo.add(jugador14);

		boolean finbu = false;

		while (finbu == false) {
			imprimirmenu();
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				mostrar(equipo);
				break;
			case 2:
				mostrar_uno(equipo);
				break;
			case 3:
				jugador_nuevo(equipo);
				break;
			case 4:
				despedir(equipo);
				break;
			case 5:
				edad_media(equipo);
				break;
			case 6:
				salario_medio(equipo);
				break;
			case 7:
				nacionalidades(equipo);
				break;
			case 0:
				finbu = true;
				System.out.println("Saliendo..");
			default:
				System.out.println("Te has equivocado, introduce otra opcion....");
				break;

			}
		}
	}

	private static void nacionalidades(ArrayList<Jugador> equipo) {
		ArrayList<String> paises = new ArrayList<>();
		ArrayList<String> repetidos = new ArrayList<>();
		repetidos.add("aux");

		// COMPROBAR SI EL PAIS ESTA EN EL ARRAY YA
		for (int i = 0; i < equipo.size(); i++) {
			paises.add(equipo.get(i).getNacionalidad());
		}

		for (int i = 0; i < paises.size(); i++) {
			String pais = paises.get(i);
			boolean repetido = false;

			for (int j = 0; j < repetidos.size(); j++) {
				if (pais.equals(repetidos.get(j))) {
					repetido = true;
				}
			}
			if (repetido == false) {
				repetidos.add(pais);
			}
		}
		repetidos.remove(0);
		System.out.println();
		System.out.println("Nacionalidad: " + repetidos);
	}

	private static void salario_medio(ArrayList<Jugador> equipo) {
		double acum = 0;

		for (int i = 0; i < equipo.size(); i++) {
			acum = acum + equipo.get(i).getSalario();
		}

		double media = acum / equipo.size();

		System.out.println("La media del salario es: " + media);
	}

	private static void edad_media(ArrayList<Jugador> equipo) {
		int dia = LocalDate.now().getDayOfMonth();
		int mes = LocalDate.now().getMonthValue();
		int anio = LocalDate.now().getYear();
		double acum = 0;
		double media = 0;

		for (int i = 0; i < equipo.size(); i++) {
			double resta = anio - equipo.get(i).getFecha_nac().getAnio();
			if (mes < equipo.get(i).getFecha_nac().getMes()) {
				resta--;
			} else if (mes == equipo.get(i).getFecha_nac().getMes()) {
				if (dia < equipo.get(i).getFecha_nac().getDia()) {
					resta--;
				}
			}

			acum = acum + resta;
		}

		media = acum / equipo.size();

		System.out.println("La media de edad en el equipo es: " + media + " años.");
	}

	private static void despedir(ArrayList<Jugador> equipo) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marca el dorsal del jugador:");
		int dorsal = sc.nextInt();
		for (int i = 0; i < equipo.size(); i++) {
			if (dorsal == equipo.get(i).getDorsal()) {
				System.out.println("Despidiendo a: " + equipo.get(i).getNombre() + " " + equipo.get(i).getApellidos());
				equipo.remove(i);
			}
		}
	}
	/**
	 * Metodo para agregar un jugador
	 * @param equipo Jugador
	 */
	public static void jugador_nuevo(ArrayList<Jugador> equipo) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Introduce el nombre del jugador: ");
		String nombre = sc.next();
		System.out.println("Introduce el apellido del jugador: ");
		String apellido = sc.next();
		System.out.println("Introduce el apodo:");
		String apodo = sc.next();
		System.out.println("Introduce el numero del dorsal:");
		int dorsal = sc.nextInt();

		// hacer metodo de comprobar dorsal

		System.out.println("Introduce la nacionalidad: ");
		String nacionalidad = sc.next();
		System.out.println("Introduce la fecha de cumpleaños, para ello... ");
		System.out.println("Introduce el año:");
		int anio = sc.nextInt();
		System.out.println("Introduce el mes:");
		int mes = sc.nextInt();
		System.out.println("Introduce el dia:");
		int dia = sc.nextInt();
		Fecha fecha = new Fecha(anio, mes, dia);
		System.out.println("Introduce la posicion del jugador: ");
		String posicion = sc.next();
		System.out.println("Introduce el salario:");
		int salario = sc.nextInt();

		Jugador jugador = new Jugador(nombre, apellido, apodo, dorsal, nacionalidad, fecha, posicion, salario);
		equipo.add(jugador);
	}
	/**
	 * Metodo para mostrar un solo jugador
	 * @param equipo equipo
	 */
	public static void mostrar_uno(ArrayList<Jugador> equipo) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige el dorsal del jugador que desee ver:");
		int dorsal = sc.nextInt();

		for (int i = 0; i < equipo.size(); i++) {
			if (dorsal == equipo.get(i).getDorsal()) {
				System.out.println(equipo.get(i));
			}
		}

	}
	/**
	 * Metodo para mostrar el equipo de jugadores
	 * @param equipo Equipo
	 */
	public static void mostrar(ArrayList<Jugador> equipo) {
		System.out.println("Porteros: \n");
		for (int i = 0; i < equipo.size(); i++) {
			if (equipo.get(i).getPosicion().equals("Portero")) {
				System.out.println(equipo.get(i).getApodo());
			}
		}
		System.out.println();
		System.out.println("Alas: \n");
		for (int i = 0; i < equipo.size(); i++) {
			if (equipo.get(i).getPosicion().equals("Ala")) {
				System.out.println(equipo.get(i).getApodo());
			}
		}
		System.out.println();
		System.out.println("Alas-pivots: \n");
		for (int i = 0; i < equipo.size(); i++) {
			if (equipo.get(i).getPosicion().equals("Ala-pivot")) {
				System.out.println(equipo.get(i).getApodo());
			}
		}
		System.out.println();
		System.out.println("Cierres: \n");
		for (int i = 0; i < equipo.size(); i++) {
			if (equipo.get(i).getPosicion().equals("Cierre")) {
				System.out.println(equipo.get(i).getApodo());
			}
		}
	}
	/**
	 * Metodo para mostrar un menu
	 */
	public static void imprimirmenu() {
		System.out.println();
		System.out.println("__________________________");
		System.out.println("1. Para mostrar los jugadores, por posicion.");
		System.out.println("2. Para mostrar info de un jugador.");
		System.out.println("3. Añadir jugador.");
		System.out.println("4. Despedir jugador.");
		System.out.println("5. Obtener la edad media.");
		System.out.println("6. Obtener salario medio.");
		System.out.println("7. Obtener nacionalidades.");
		System.out.println("-------------------------------");
		System.out.println("Pulsa 0 para salir.");
		System.out.println("__________________________");
	}

}
