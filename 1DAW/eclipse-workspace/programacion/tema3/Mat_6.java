package tema3;

import java.util.Scanner;

public class Mat_6 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[][] productos = {
				
				{"Kitkat","Lays","Fanta"},
				{"Nestea","kikos","RedBull"},
				{"Coca-Cola","Kaskis","Oreo"}
				
		};
		
		double[][] precios = {
				
				{2.0,1.8,1.5},
				{1.5,1.2,2.8},
				{1.5,2.2,2.4}
		};
		
		int menu=0;
		double saldo = 0;
		boolean salir = false;
		
		while (salir == false) {
			
			System.out.println("Menu");
			System.out.println("1.Ver contenido");
			System.out.println("2.Pedir artuculos");
			System.out.println("3.Ingresar monedas");
			System.out.println("4.Salir");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1: 
				
				mostrar(productos);
				
			break;
			
			case 2: 
				
				saldo = pedirgolosina(productos, precios, saldo);
	
			break;
			
			case 3:
			
				saldo = depositar(saldo);
				System.out.println("Dispones de " + saldo + " monedas");
				
			break;
			
			case 4:
				
				salir = true;
				
			break;
			
			default:
				System.out.println("Numero introducido no valido");
				break;
				
			}//
			
		}
		

	}
	
	public static void mostrar(String[][] matriz) {
		
		for(int x = 0; x<matriz.length;x++) {
			System.out.println();
			for(int y = 0; y<matriz[x].length;y++) {
				System.out.print(matriz[x][y]+ "|");
			}
		};
		
	
	}

	public static void mostrardouble(double[][] matriz) {
	
	for(int x = 0; x<matriz.length;x++) {
		System.out.println();
		for(int y = 0; y<matriz[x].length;y++) {
			System.out.print(matriz[x][y]+ "|");
		}
	};
	

}
	
	public static double depositar(double saldo) {
		
		System.out.println("¿Cuanto saldo quieres ingresar?");
		double monedas = sc.nextDouble();
		
		while (monedas <= 0) {
			
			System.out.println("Cantidad introducida erronea");
			monedas = sc.nextDouble();
			
		}
		saldo = saldo + monedas;
		
		
		
		return saldo;
		
	}
	
	public static double pedirgolosina(String[][] productos, double precios[][], double saldo) {
		
	mostrar(productos);	
	mostrardouble(precios);
	System.out.println();
	System.out.println("Elije el numero que quieres comprar");
	System.out.println("Posicion 1:");
	int p1 = sc.nextInt();
	System.out.println("Posicion 2:");
	int p2 = sc.nextInt();
	

	for(int x = 0; x<productos.length;x++) {
		
		
		for(int y = 0; y<productos[x].length;y++) {
		
			
			if(x==p1 && y==p2) {
				System.out.println(productos[x][y]);
				
				if (saldo >= precios[x][y]) {
					
					System.out.println("Dispensando producto");
					
					saldo = saldo - precios[x][y];
					System.out.println("Saldo restante: " + saldo);
				}else {
					System.out.println("No dispones de slado suficiente");
				}
			
			}
			
		
			
			
		}
	}
	
	return saldo;
		
	}

}
