package a1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Cambiocolor extends JFrame {
	
	JButton rojo = new JButton("ROJO");
	JButton azul = new JButton("AZUL");
	Container p;
	
	public Cambiocolor() {
		super("Cambio color");
		p = this.getContentPane();
		setLayout(new FlowLayout());
		add(rojo);
		add(azul);
		rojo.addActionListener(new OyenteRojo());
		azul.addActionListener(new OyenteAzul());
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		Cambiocolor a = new Cambiocolor();

	}
	
	class OyenteRojo implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			p.setBackground(Color.red);
		}
	}
	
	class OyenteAzul implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			int m = 0;
			p.setBackground(Color.red);
			
		}
	}

}
