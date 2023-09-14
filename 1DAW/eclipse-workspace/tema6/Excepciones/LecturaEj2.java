package Excepciones;

import java.io.File;
import java.util.Scanner;

public class LecturaEj2 {

	public static void main(String[] args) {
		
		//fichero que vamos a ller
		File fichero = new File("carta.txt");
		Scanner s = null;
		
		try {
			//leer fichero
			System.out.println("Leemos el archivo");
			s = new Scanner(fichero);
			
			while(s.hasNextLine()) {
				String linea = s.nextLine();
				int num_carac = linea.length();
				System.out.println("Esta linea tiene " + num_carac);
				System.out.println(linea);
			}
		}catch(Exception ex) {
			System.out.println("MENSAJE:" + ex.getMessage());
			
		}finally {
			s.close();
			
		}

	}

}
