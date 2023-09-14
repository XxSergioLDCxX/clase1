package tema1;

public class Ejercicio1 {
	
	public static void main(String[] args) {

		//ejercicio 1
		
		String nombre = "Sergio";
		
		//ejercicio 2
		
		int n1 = 7;
		int n2 = 5;
		int resultadoSuma = n1 + n2;
		int resultadoResta = n1 - n2;
		int resultadoMultiplicacion = n1 * n2;
		int resutladoDivision = n1 / n2;
		int resultadoModulo = n1 % n2 ;
		
		//ejercicio 3
		
		double a = 1;
		double b = 2;
		double c = -3;
		
		//ejercicio 1
		
		System.out.println("Bienvenido " + nombre);
		
		//ejercico 2
		
		System.out.println(resultadoSuma);
		System.out.println(resultadoResta);
		System.out.println(resultadoMultiplicacion);
		System.out.println(resutladoDivision);
		System.out.println(resultadoModulo);
		
		//Ejercicio 3
		
		double p=(((-b)+Math.sqrt((b*b)-4*a*c))/2*a);
        double n=(((-b)-Math.sqrt((b*b)-4*a*c))/2*a);

        System.out.println("Ecuacion positiva:"+p);
        System.out.println("Ecuacion negativa:"+n);
        
	}

}
