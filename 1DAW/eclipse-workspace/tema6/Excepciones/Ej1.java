package Excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ej1 {

	public static void main(String[] args) throws IOException {
		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco" };
		FileWriter fichero = null;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int n = 0;

		try {

			fichero = new FileWriter("fichero_escritura.txt");

			for (int i = 0; i < 100; i++) {
				i++;
				fichero.write(i + "\n");
			}
			
		} catch (Exception e) {
			System.out.println("Mensaje de la excepcion: " + e.getMessage());
		} finally {
			fichero.close();
		}
	}

}
