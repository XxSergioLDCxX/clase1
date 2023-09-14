package tema3;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ar_10 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] a1 = new int [10];
		
		JFrame frame = new JFrame("La mama de la mama");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(5, 10, 80, 25);
		panel.add(userLabel);
		

		frame.setVisible(true);

		a1 = rellenar(a1);

		mostrar(a1);

	}
	
	public static int[] rellenar(int[] a1) {
	
		for(int i = 0; i<a1.length;i++) {
			System.out.println("Introduce el valor " + (i+1));
			a1[i]=sc.nextInt();
			
		}
		
		return a1;
	}
	
	public static void mostrar(int[] a1) {
		
		for(int j = 0;j<a1.length;j++) {
			
			System.out.print(a1[j] + "|");
			
		}
		
	}

}
