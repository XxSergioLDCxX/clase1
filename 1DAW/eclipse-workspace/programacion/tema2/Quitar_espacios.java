package tema2;

public class Quitar_espacios {

	public static void main(String[] args) {

		int aux = 0;
		String arbitro = "Los arbitros nunca expulsan a Casimiro ";
		String end = "";
		for(int i = 0; i<arbitro.length(); i++) {
			
			if (arbitro.charAt(i) == ' ') {
				end = end + arbitro.substring(aux,i) ;
				aux = i+1;
			}
			
		}
		System.out.println(end);
	}

}
