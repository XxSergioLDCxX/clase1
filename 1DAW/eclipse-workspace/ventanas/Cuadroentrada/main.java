package Cuadroentrada;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class main extends JFrame{
	
	public main() {
		super("ventana");
		setLayout(new FlowLayout());
		
		CuadroEntrada pd = new CuadroEntrada();
		
		if (JOptionPane.showConfirmDialog(this, pd,
				"Introduzca datos",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE) == JOptionPane.OK_OPTION) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			main f = new main();
	}

}
