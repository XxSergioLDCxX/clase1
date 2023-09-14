package a1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Repval extends JFrame {
	
	JButton botonCopiar;
	JTextField campoValor, resultado;
	
	public Repval() {
		
		//poder meter varios botones
		setLayout(new FlowLayout());
		//crea texto en la ventana
		add(new JLabel("valor "));
		//inicializo el contenedor donde va el numero
		campoValor = new JTextField(5);
		add(campoValor);
		//inicializo el boton que inicia le evento de copiar de un texto a otro
		botonCopiar = new JButton("Copiar");
		add(botonCopiar);
		//llama al metdo al pulsar el boton
		botonCopiar.addActionListener(new OyenteBoton());
		//Crea texto plano
		add(new JLabel("		Copia"));
		//Contenedor donde se va a copiar el texto
		resultado = new JTextField(6);
		add(resultado);
		
		setSize(400, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		Repval ventana = new Repval();

	}
	
	class OyenteBoton implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String valor = campoValor.getText();
			resultado.setText(valor);
			
		}
	}

}
