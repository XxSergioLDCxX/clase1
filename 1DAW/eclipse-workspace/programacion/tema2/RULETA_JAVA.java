package tema2;

import java.util.Scanner;

public class RULETA_JAVA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int salir= 1;
		// fichas de inicio

		System.out.println("Cuantos euros quieres ingresar (1 euros = 200 fichas): ");
		int fichas = sc.nextInt();
		
		fichas = fichas * 200;

		// decoracion del menu
		System.out.println("#########################");
		System.out.println("#                       #");
		System.out.println("#         RULETA        #");
		System.out.println("#                       #");
		System.out.println("#########################");

		while (fichas > 1 && salir != 6) {
			// menu
			System.out.println("┌──────────────────────────────┐");
			System.out.println("│Seleccione su tipo de apuesta:│");
			System.out.println("│1.Numero par                  │");
			System.out.println("│2.Numero inpar                │");
			System.out.println("│3.Numero rojo                 │");
			System.out.println("│4.Numero negro                │");
			System.out.println("│5.Apuesta a numero solitario  │");
			System.out.println("│6.Salir                       │");
			System.out.println("└──────────────────────────────┘");
			System.out.println("Tienes " + fichas + " fichas");
			
			int opcion, apuesta= 0, numero, bolita, aux, aux2 = 0;
			
			//seleccionar una opcion valida
			do {
				System.out.println("Introduzca un valor valido: ");
			 opcion = sc.nextInt();
			}while( opcion < 1 || opcion > 6);
			

			// seleccionar apuesta
			if (opcion != 6) {
			do {

				System.out.println("cuanto quieres apostar: ");
				apuesta = sc.nextInt();

			} while (apuesta > fichas && apuesta < 0);

			}
			// Sacar numero de la ruleta

			bolita = (int) (Math.random() * 36 + 0);
			aux = 0;
			aux2 = 0;
		

			switch (opcion) {

			// Si el numero es par
			case 1:

				// Has ganado (El numero es par)
				if (bolita % 2 == 0 && bolita != 0) {

					aux = fichas;

					fichas = aux + apuesta;

					apuesta = apuesta * 2;

					System.out.println("Enorabuena has ganado " + apuesta + " fichas");

					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");

					// Has perdido (El numero es par)

				} else if (bolita % 2 != 0 && bolita != 0) {

					System.out.println("mala suerte has perdido " + apuesta + " fichas");

					aux = fichas;

					fichas = aux - apuesta;
					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
				}

				// Ha salido 0
				if (bolita == 0) {
					System.out.println("mala suerte has perdido " + apuesta + " fichas");

					aux = fichas;

					fichas = aux - apuesta;
					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
				}

				break;

			case 2:

				// Has ganado (Si el numero es inpar)

				if (bolita % 2 != 0 && bolita != 0) {

					aux = fichas;

					fichas = aux + apuesta;

					apuesta = apuesta * 2;

					System.out.println("Enorabuena has ganado " + apuesta + " fichas");

					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");

					// Has perdido (Si el numero sale inpar)

				} else if (bolita % 2 == 0 && bolita != 0) {

					System.out.println("mala suerte has perdido " + apuesta + " fichas");

					aux = fichas;

					fichas = aux - apuesta;
					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
				} else

				// Ha salido 0
				if (bolita == 0) {
					System.out.println("mala suerte has perdido " + apuesta + " fichas");

					aux = fichas;

					fichas = aux - apuesta;
					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
				}

				break;

			case 3:
				
				//Has ganado (Si es rojo)
				
					if (bolita == 1 || bolita == 3 || bolita == 5 || bolita == 7 || bolita == 9 || bolita == 12 || bolita == 14 || bolita == 16 || bolita == 18 || bolita == 19 || bolita == 21 || bolita == 23 || bolita == 25 || bolita == 27 || bolita == 30 || bolita == 32 || bolita == 34 || bolita == 36 && bolita != 0 ) {
						
						aux = fichas;

						fichas = aux + apuesta;

						apuesta = apuesta * 2;

						System.out.println("Enhorabuena has ganado " + apuesta + " fichas");

						System.out.println("ha salido " + bolita);
						System.out.println("te quedan " + fichas + " fichas");
						
						//has perdido (Si el numero es rojo)
					}else if(bolita == 2 || bolita == 4 || bolita == 6 || bolita == 6 || bolita == 8 || bolita == 10 || bolita == 11 || bolita == 13 || bolita == 15 || bolita == 17 || bolita == 20 || bolita == 22 || bolita == 24 || bolita == 26 || bolita == 28 || bolita == 29 || bolita == 31 || bolita == 33 || bolita == 35 && bolita != 0){
						
						System.out.println("mala suerte has perdido " + apuesta + " fichas");

						aux = fichas;

						fichas = aux - apuesta;
						System.out.println("ha salido " + bolita);
						System.out.println("te quedan " + fichas + " fichas");
					}
					
					// Ha salido 0
					if (bolita == 0) {
						System.out.println("mala suerte has perdido " + apuesta + " fichas");

						aux = fichas;

						fichas = aux - apuesta;
						System.out.println("ha salido " + bolita);
						System.out.println("te quedan " + fichas + " fichas");
					}

				
				break;

			case 4:
					//has ganado (Si el numero es negro)
				if(bolita == 2 || bolita == 4 || bolita == 6 || bolita == 6 || bolita == 8 || bolita == 10 || bolita == 11 || bolita == 13 || bolita == 15 || bolita == 17 || bolita == 20 || bolita == 22 || bolita == 24 || bolita == 26 || bolita == 28 || bolita == 29 || bolita == 31 || bolita == 33 || bolita == 35 && bolita != 0){
					
					aux = fichas;

					fichas = aux + apuesta;

					apuesta = apuesta * 2;

					System.out.println("Enhorabuena has ganado " + apuesta + " fichas");

					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
					
					
				}else if (bolita == 1 || bolita == 3 || bolita == 5 || bolita == 7 || bolita == 9 || bolita == 12 || bolita == 14 || bolita == 16 || bolita == 18 || bolita == 19 || bolita == 21 || bolita == 23 || bolita == 25 || bolita == 27 || bolita == 30 || bolita == 32 || bolita == 34 || bolita == 36 && bolita != 0 ) {
					
					System.out.println("mala suerte has perdido " + apuesta + " fichas");

					aux = fichas;

					fichas = aux - apuesta;
					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
					
					//ha salido 0
				}else if (bolita == 0) {
					System.out.println("mala suerte has perdido " + apuesta + " fichas");

					aux = fichas;

					fichas = aux - apuesta;
					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
				}
				
				break;

			case 5:
				
				do {
					System.out.println("Seleccione al numero para apostar");
					numero = sc.nextInt();
				} while (numero < -1 && numero > 36);
				
				if (bolita == numero) {
					
					
					
					aux = apuesta * 35;
					System.out.println("ha salido " + bolita);
					System.out.println("Has ganado " + aux + " fichas");
					
					aux2 = fichas;
					fichas = aux2 + aux;
					System.out.println("te quedan " + fichas + " fichas");
				}else if (bolita != numero) {
					System.out.println("mala suerte has perdido " + apuesta + " fichas");

					aux = fichas;

					fichas = aux - apuesta;
					System.out.println("ha salido " + bolita);
					System.out.println("te quedan " + fichas + " fichas");
				}
				
				break;
			case (6):{
				System.out.println("Gracias por su visita");
				salir = 6;
			}
			}
			
		}
		
		if (fichas < 1) {
			System.out.println("No dispones de fichas suficientes para jugar sin dinero no hay juego, a la calle");
		}else {
			System.out.println("Has salido con " + fichas + " fichas");
			double cambio = fichas / 200;
			System.out.println("Al cambio son " + cambio + " euros");
		}
	}

}
