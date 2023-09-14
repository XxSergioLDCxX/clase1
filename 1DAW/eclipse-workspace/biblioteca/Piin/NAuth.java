package Piin;

 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NAuth extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NAuth frame = new NAuth();
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
	public NAuth() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(335, 118, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		textField = new JTextField();
		textField.setBounds(104, 62, 198, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre del nuevo autor");
		lblNewLabel.setBounds(136, 36, 150, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {

				String aut = textField.getText();
				
				 if (aut.matches(".*\\d.*")) {
	                   
	                   Error err = new Error();
	                   err.setVisible(true);
	                }     
				 
				 Lib fd = new Lib();
				 
				 fd.arra();
				 
		        
				
			}
		});
		btnNewButton_1.setBounds(238, 118, 89, 23);
		contentPane.add(btnNewButton_1);
		
	}
			public  String arry() {
		
				System.out.println(textField.getText());
				
				return textField.getText();
		
		
	}
	
	
}
