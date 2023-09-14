package tema2;

public class Remplazar {
	public static void main(String[] args) {
		String frase = "Atleti nunca ganara una Champions";
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.toLowerCase().charAt(i) == 'a' || frase.toLowerCase().charAt(i) == 'e' || frase.toLowerCase().charAt(i) == 'i' || frase.toLowerCase().charAt(i) == 'o' || frase.toLowerCase().charAt(i) == 'u') {
				
				contador++;
			}
			
		}
		System.out.println(contador);
	}
}
