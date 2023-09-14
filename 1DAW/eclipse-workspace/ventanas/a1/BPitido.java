package a1;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BPitido extends JFrame {

	JButton boton;
	JButton boton2;
	
	public BPitido() {
		super("Boton que suena");
		setLayout (new GridLayout());
		boton = new JButton("b1");
		boton2 = new JButton("b2");
		add(boton);
		add(boton2);
		boton.addActionListener(new OyetenteBoton());
		boton2.addActionListener(new OyetenteBoton());
		setSize(520, 520);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		BPitido aplication = new BPitido();

	}
	
	class OyetenteBoton implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			try {
	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\Clase\\1DAW\\eclipse-workspace\\Ventanas\\src\\a1\\Sounds\\bonk.wav").getAbsoluteFile());
	            Clip clip = AudioSystem.getClip();
	            clip.open(audioInputStream);
	            clip.start();
	        } catch(Exception ex) {
	            System.out.println("Error al reproducir el audio: " + ex.getMessage());
	        }
		}
	}

}
