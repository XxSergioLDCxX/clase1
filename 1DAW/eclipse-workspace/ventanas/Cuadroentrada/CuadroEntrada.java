package Cuadroentrada;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CuadroEntrada extends JPanel {
	
	public CuadroEntrada() {
		setLayout(new GridLayout(4, 2));
		JLabel etiquetaNombre = new JLabel("Nombre: ", JLabel.RIGHT);
		JTextField campoNombre = new JTextField();
		add(etiquetaNombre);
		add(campoNombre);
		JLabel etiquetaApellidos = new JLabel("Apellidos: ", JLabel.RIGHT);
		JTextField campoApellidos = new JTextField();
		add(etiquetaApellidos);
		add(campoApellidos);
		JLabel etiquetaNP = new JLabel("Numero personal ", JLabel.RIGHT);
		JTextField campoNP = new JTextField();
		add(etiquetaNP);
		add(campoNP);
		ButtonGroup grupoBotones = new ButtonGroup();
		JRadioButton mañana = new JRadioButton("Grupo mañana", true);
		JRadioButton tarde = new JRadioButton("Grupo tarde");
		grupoBotones.add(mañana);
		grupoBotones.add(tarde);
		add(mañana);
		add(tarde);
		
	}


}
