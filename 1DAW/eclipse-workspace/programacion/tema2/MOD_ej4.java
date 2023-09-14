package tema2;

import java.util.Scanner;

public class MOD_ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//introducir 2 numeros
		
		System.out.println("Introdice numero 1");
		int n1 = sc.nextInt();
		
		System.out.println("Introduce numero 2");
		int n2 = sc.nextInt();

		int numgrand = compara(n1, n2);
		System.out.println("el numero mayor es " + numgrand);
	}
	
	public static int compara(int n1, int n2) {
		
		int resultado;
		
		if (n1>n2) {
			resultado = n1;
		}else if(n1<n2) {
			resultado = n2;;
		}else {
			System.out.println("iguales");
		}
		return n2;
	}

}
