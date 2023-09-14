package tema3;

import java.util.Arrays;

public class Ar_8 {

	public static void main(String[] args) {

		int[] a = new int[20];
		
		 a = sumar(a);
		
	}
	
	public static int[] sumar(int[] a) {
		
		for(int i = 0; i<a.length;i++) {
			
			a[i] = i * 3;
			
		}
		
		System.out.println(Arrays.toString(a));
		
		return a;
	}

}
