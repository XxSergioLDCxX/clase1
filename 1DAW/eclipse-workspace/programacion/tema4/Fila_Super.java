package tema4;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Fila_Super {

	public static void main(String[] args) throws InterruptedException {
		int end = 0,contador = 0, turno = 1;
		ArrayList<String> f1 = new ArrayList<String>();
		ArrayList<String> f2 = new ArrayList<String>();
		ArrayList<String> f3 = new ArrayList<String>();
		while (end != 1) {
			
			
			//entran entre 1 y 3 clientes (repetir 5 veces)
			System.out.println("_______________________________");
			System.out.println("Turno " + turno);
			if (contador != 5) {
			System.out.println("Fila 1");
			f1 = llenarCola(f1);
			System.out.println("Fila 2");
			f2 = llenarCola(f2);
			System.out.println("Fila 3");
			f3 = llenarCola(f3);
			contador++;}
			//atender 1 solo cliente por caja borrarlo al terminar
			System.out.println("_______________________________");
			System.out.println("Los cajeros van a despachar");
			f1 = vaciarCola(f1);
			System.out.println("En la fila 1 quedan " + f1.size() + " clientes");
			f2 = vaciarCola(f2);
			System.out.println("En la fila 2 quedan " + f2.size() + " clientes");
			f3 = vaciarCola(f3);
			System.out.println("En la fila 3 quedan " + f3.size() + " clientes");
			//terminar al quedar 0 clientes en todas las cajas 
			if((f1.size()+f2.size()+f3.size()) == 0) {
				
				end = 1;
			}else
				
			turno++;
			TimeUnit.SECONDS.sleep(3);
		}
		
		System.out.println("Los cajeros has despachado a todos los clientes en " + turno + " turnos");
		
	}
	
		public static ArrayList<String> llenarCola(ArrayList<String> fila){
			
			int numero = (int)(Math.random()*3+1);
			
			System.out.println("Han estrado " + numero + " clientes");
				for(int i = 0;i<numero;i++) {
									
				fila.add("cliente");
				}
			
				System.out.println("Hay " + fila.size() + " clientes en esta fila");
			
			return fila;
		}
	
		public static ArrayList<String> vaciarCola(ArrayList<String> fila){
			
			if(fila.size() != 0) {
				
				fila.remove(0);
			}
			
			return fila;
		}

		
		
}
