package tema2;

import java.util.Scanner;

public class EjercicioClase7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero del mes: ");
				int mes = sc.nextInt();
			
				if(mes==2) {
					System.out.println("Este mes tiene 28 dias");
				}else if(mes==4 || mes==6 || mes==9 || mes==11) {
					System.out.println("Este mes tiene 30 dias");
				}else System.out.println("Este mes tiene 31 dias");

	}

}
