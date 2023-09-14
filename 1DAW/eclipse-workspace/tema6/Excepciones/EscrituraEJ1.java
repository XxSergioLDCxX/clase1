package Excepciones;
import java.io.File;
import java.util.*;
public class EscrituraEJ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce el nombre del fichero");
		String file = sc.next();
		
		File fichero = new File(file);
		if(fichero.exists()) {
			 fichero = new File(file);
		}else {
			 fichero = new File("Dfault.txt");
		}
		Scanner s = null;
		
		
		try {
			
			
			s = new Scanner(fichero);
			while(s.hasNextLine()) {
				String linea = s.nextLine();
				System.out.println(linea);
			}
		}catch(Exception e) {
			System.out.println("ERROR" + e.getMessage());
		}finally {
			s.close();
		}
	}

}
