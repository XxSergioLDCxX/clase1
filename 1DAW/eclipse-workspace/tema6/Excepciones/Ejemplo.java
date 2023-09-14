package Excepciones;

public class Ejemplo {

	public static void main(String[] args) {
		
		try {
			int[] numeros = {1,2,3};
			System.out.println(numeros[10]);
		} catch(Exception e){
			System.out.println("No se puede");
			
		}

	}

}
