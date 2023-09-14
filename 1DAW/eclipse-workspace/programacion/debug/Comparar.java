package debug;

public class Comparar {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		int c = 3;
		
		
		if (a> b && a> c) {
			System.out.println("el primero");
		}else if(b>c && b>a) {
			System.out.println("el segundo");
		}else if(c>a && c>b) {
			System.out.println("el tercero");
		}
		

	}

}
