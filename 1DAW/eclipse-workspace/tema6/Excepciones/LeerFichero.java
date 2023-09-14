package Excepciones;
import java.io.File;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		File fichero = new File("fichero_escritura.txt");
		Scanner s = null;
		
		try {
			System.out.println("Leemos el archivo");
			s = new Scanner(fichero);
			
			while(s.hasNextLine()) {
				String linea = s.nextLine();
				System.out.println(linea);
			}
		}catch(Exception ex) {
			System.out.println("MENSAJE:" + ex.getMessage());
			
		}finally {
			
			try{
				if(s != null) {
					s.close();
				}
				
			}catch(Exception ex2) {
				System.out.println("MENSAJE 2: " + ex2.getMessage());
			}
			
		}
			
		
		
	}

}
