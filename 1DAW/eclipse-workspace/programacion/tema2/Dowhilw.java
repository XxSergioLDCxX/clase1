package tema2;

import java.util.Scanner;

public class Dowhilw {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = 0;
			do {
				if(n>= 60) {
					System.out.println(n);
					n++;
				}else n++;
			}while (n <= 130);

	}

}
