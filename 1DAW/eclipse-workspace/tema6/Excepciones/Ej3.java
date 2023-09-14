package Excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ej3 {

	public static void main(String[] args) throws IOException {
		FileWriter fichero = null;
		FileWriter fichero2 = null;
		try {
			fichero = new FileWriter("Ej3Par.txt");
			fichero2 = new FileWriter("Ej3Imp.txt");

			for (int i = 0; i < 100; i++) {

				if ((i % 2) == 0) {
					System.out.println(i);
					fichero.write(i + "\n");
				} else {
					System.out.println(i);
					fichero2.write(i + "\n");
				}

			}

		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			fichero.close();
			fichero2.close();
		}

	}

}
