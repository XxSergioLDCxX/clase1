package Piin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class Lib extends JFrame {

	private JPanel contentPane;
	private JTextField ISBN;
	private JTextField titulo;

	/**
	 * Launch the application.
	 */
	public ArrayList<Libros> libro = new ArrayList<Libros>();
	public ArrayList<String> autores = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Lib frame = new Lib();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Lib() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ISBN:");
		lblNewLabel.setBounds(10, 13, 45, 13);
		contentPane.add(lblNewLabel);
		
		ISBN = new JTextField();
		ISBN.setText("");
		ISBN.setBounds(105, 10, 120, 19);
		contentPane.add(ISBN);
		ISBN.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Titulo:");
		lblNewLabel_1.setBounds(10, 36, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		titulo = new JTextField();
		titulo.setBounds(105, 33, 120, 19);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		lblNewLabel_2.setBounds(10, 59, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		
		autores.add("federico");
		autores.add("Quevedo");
		autores.add("Messi");
		
		
				
		
		
		
		JButton newAutor = new JButton("Nuevo autor");
		newAutor.addActionListener(new ActionListener() {
			
			//metodo para asignar acciones al boton nuev autor
			public void actionPerformed(ActionEvent e) { 
				
				NAuth frame = new NAuth();
				
				frame.setVisible(true);
			}
		});
		newAutor.setBounds(105, 91, 120, 13);
		contentPane.add(newAutor);
		
		JLabel lblNewLabel_3 = new JLabel("Sipnepsis");
		lblNewLabel_3.setBounds(10, 106, 67, 13);
		contentPane.add(lblNewLabel_3);
		
		JTextArea sipnepsis = new JTextArea();
		sipnepsis.setBounds(105, 114, 120, 49);
		contentPane.add(sipnepsis);
		
		JLabel lblNewLabel_4 = new JLabel("Genero");
		lblNewLabel_4.setBounds(10, 198, 67, 13);
		contentPane.add(lblNewLabel_4);
		
		ButtonGroup generos = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Terror");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(69, 194, 93, 21);
		contentPane.add(rdbtnNewRadioButton);
		generos.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ciencia ficcion");
		rdbtnNewRadioButton_1.setBounds(164, 194, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		generos.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnRomance = new JRadioButton("Romance");
		rdbtnRomance.setBounds(69, 217, 93, 21);
		contentPane.add(rdbtnRomance);
		generos.add(rdbtnRomance);
		
		JRadioButton rdbtnFantasia = new JRadioButton("Fantasia");
		rdbtnFantasia.setBounds(160, 217, 103, 21);
		contentPane.add(rdbtnFantasia);
		generos.add(rdbtnFantasia);
		
		ButtonGroup leer = new ButtonGroup();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Leido");
		chckbxNewCheckBox.setBounds(69, 272, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		leer.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNoLeido = new JCheckBox("Lo tengo");
		chckbxNoLeido.setBounds(164, 272, 93, 21);
		contentPane.add(chckbxNoLeido);
		leer.add(chckbxNoLeido);
		
		
		 JComboBox<String> comboBox = new JComboBox<>();
	        comboBox.setModel(new DefaultComboBoxModel<>(autores.toArray(new String[0])));
		comboBox.setBounds(105, 54, 120, 22);
		contentPane.add(comboBox);
		
		
		
		// comboBox
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Boton de clancelar
				ISBN.setText("");
				titulo.setText("");
				sipnepsis.setText("");
				
				
				
			}
		});
		btnNewButton_1.setBounds(218, 338, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Guardar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
				//Boton aceptar del programa
			public void actionPerformed(ActionEvent e) {
			
				int cont = 0;
			String v1 = ISBN.getText();
			
			
			if(v1.length() == 13) {
				if (v1.matches(".*[a-zA-Z].*")) {
					error();
				
					
				}else {
					
					cont++;
				}
			
			}else {
				error();
			}
			
			
			
			String v2 = titulo.getText();
			
				if(v2.length() > 1) {
					cont++;
				}else {
					error();
				}
			String v3 = (String) comboBox.getSelectedItem();
			String v4 = sipnepsis.getText();
			String v5 = "";
			boolean v6 = false;
			
			if(rdbtnNewRadioButton.isSelected()) {
				v5 = "Terror";
			}else if(rdbtnNewRadioButton_1.isSelected()) {
				v5 ="Ciencia ficcion";
			}else if (rdbtnRomance.isSelected()) {
				v5 = "Romance";
			}else if(rdbtnFantasia.isSelected()) {
				v5 = "Fantasia";
			};
			
			if(chckbxNewCheckBox.isSelected()) {
				v6 = true;
			};

			if(cont == 2) {
				Libros lib = new Libros(v1,v2,v3,v4,v5,v6);
				
				libro.add(lib);
				
				try {
					FileWriter file = new FileWriter("Informe.txt");
					for(int i = 0; i<libro.size();i++) {
						
						file.write(libro.get(i).toString() + "\n");
						
					}
					
					file.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Correcto cor = new Correcto();
				
				cor.setVisible(true);
				
			
			}
			
			
			
			
				
			}
		});
		btnNewButton_1_1.setBounds(132, 338, 85, 21);
		contentPane.add(btnNewButton_1_1);
		

		
		JButton btnNewButton_1_2 = new JButton("Imprimir informe");
		btnNewButton_1_2.setFont(new Font("Segoe Print", Font.BOLD, 13));
		btnNewButton_1_2.setBackground(SystemColor.desktop);
		btnNewButton_1_2.setForeground(SystemColor.textHighlight);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int cont = 0;
				String v1 = ISBN.getText();
				
				
				if(v1.length() == 13) {
					if (v1.matches(".*[a-zA-Z].*")) {
						error();
					
						
					}else {
						
						cont++;
					}
				
				}else {
					error();
				}
				
				
				
				String v2 = titulo.getText();
				
					if(v2.length() > 1) {
						cont++;
					}else {
						error();
					}
				String v3 = (String) comboBox.getSelectedItem();
				String v4 = sipnepsis.getText();
				String v5 = "";
				boolean v6 = false;
				
				if(rdbtnNewRadioButton.isSelected()) {
					v5 = "Terror";
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					v5 ="Ciencia ficcion";
				}else if (rdbtnRomance.isSelected()) {
					v5 = "Romance";
				}else if(rdbtnFantasia.isSelected()) {
					v5 = "Fantasia";
				};
				
				if(chckbxNewCheckBox.isSelected()) {
					v6 = true;
				};

				if(cont == 2) {
					Print pn = new Print(v1, v2, v3, v4, v5, v6);
					
					pn.setVisible(true);
				}
				
			}
		});
		btnNewButton_1_2.setBounds(132, 316, 171, 21);
		contentPane.add(btnNewButton_1_2);
		
	
	}


    
    public static void error() {
    	Error err = new Error();
		err.setVisible(true);
		
		
    }
    
    public  void arra() {
    	
    	NAuth ar = new NAuth();
    	String xd = ar.arry();
    	
    	autores.add(xd);
    	
    	
    	
    }
    
    
    
    
    
    
    
}
