package a1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pulsador extends JFrame{

	private final JButton boton1;
	
	public final JLabel label1;
	
	public Pulsador() {
		boton1 = new JButton("Pulsa");
		label1 = new JLabel("Pulsaciones 0");
		add(boton1);
		add(label1);
		setLayout(new FlowLayout());
		boton1.addActionListener(new OyenteBotonPulsaciones());
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		Pulsador hola = new Pulsador(); 

	}
	
	class OyenteBotonPulsaciones implements ActionListener {
		private int contador;
		public void actionPerformed(ActionEvent e) {
			contador++;
			label1.setText("Pulsaciones " + contador);
		}
	}

}
