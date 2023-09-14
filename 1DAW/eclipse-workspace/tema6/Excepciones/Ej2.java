package Excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ej2 {

	public static void main(String[] args) throws IOException {
		FileWriter fichero = null;
		try {

			fichero = new FileWriter("Fichero_ej2.txt");

			for (int i = 0; i < 100; i++) {

				if ((i % 2) == 0) {
					fichero.write(i + "\n");
				}

			}

		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			fichero.close();
		}
	}

}
