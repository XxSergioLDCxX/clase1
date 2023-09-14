package tema4;

import java.util.*;
public class EJ_Arry_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		int menu = 1;
		int aux = 0;
		
		while (menu != 0) {
		
		System.out.println("Introduce un numero(Introduce un 0 para terminar)");
		aux = sc.nextInt();
		
		if (aux == 0) {
			menu = 0;
		}else {
			num.add(aux);
		}
		
		
		}
		System.out.println(num);

	}

}
