import java.util.Scanner;

public class Examen_Ej1 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce un tamaño para la cadena");
		int tamaño = sc.nextInt();
		int[] cadena = new int[tamaño];

		cadena = inicio(cadena);
		
		
		mostrar(cadena);
		

		

	}

	public static int[] inicio(int[] cadena) {

		for (int i = 0; i < cadena.length; i++) {

			cadena[i] = (int) (Math.random() * 300);

		}

		System.out.println("Los numeros generados son");
		
		for(int i = 0; i<cadena.length;i++) {
			
			System.out.print("|" + cadena[i]);
		}
			
		
		return cadena;
	}
	public static void mostrar(int[] cadena) {
		
		System.out.println("En que numero tiene que acabar los mostrados?");
		int mostrados = sc.nextInt();
		
		while(mostrados < 0 || mostrados >9) {
			System.out.println("Introduce un numero valido");
			mostrados =  sc.nextInt();
		}
		
	}
}
