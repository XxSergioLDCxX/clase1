package tema3;

public class Mat_1 {

	public static void main(String[] args) {
		
		int[][] cuadro = new int [3][3];
		
		for(int x = 0; x<cuadro.length;x++) {
			
			
			
			for(int y = 0; y< cuadro[x].length;y++) {
				
				cuadro[x][y]= (int) (Math.random()*9) + 1;
				
				
			}
			
			
		}
		mostrar(cuadro);

	}
	
	public static void mostrar(int[][] cuadro) {
		
		for(int x = 0; x<cuadro.length;x++) {
			
			System.out.println();
			
			for(int y = 0; y< cuadro[x].length;y++) {
				
				
				System.out.print("|" + cuadro[x][y] + "|");
				
			}
			
			
		}
		
	}

}
