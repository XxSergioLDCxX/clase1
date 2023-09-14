package tema1;

public class Repaso_1 {

	public static void main(String[] args) {
		int numeroRojo = (int) (Math.random() * 10 + 1);
		System.out.println("En la bolsa roja sale: " + numeroRojo);

		int numeroVerde = (int) (Math.random() * 10 + 1);
		System.out.println("En la bolsa verde sale: " + numeroVerde);
		int suma = numeroRojo + numeroVerde;
		System.out.println("La suma de las 2 bolsas da: " + suma);
		int multi = numeroRojo * numeroVerde;
		System.out.println("Los numeros multiplicado dan: " + multi);
		double elevado = Math.pow(numeroRojo, numeroVerde);
		System.out.println("La bola roja elevada a la verde es: " + elevado);
		boolean mayor = numeroRojo > numeroVerde;
		System.out.println("La  bola roja es mayor que la verde: " + mayor);
		boolean mayor2 = numeroVerde > numeroRojo;
		System.out.println("La  bola verde es mayor que la roja: " + mayor2);
		float probabilidad = 2/20;
		System.out.println("La probabilidad de que 2 numeros sean iguales es: " + probabilidad);

	}
}
