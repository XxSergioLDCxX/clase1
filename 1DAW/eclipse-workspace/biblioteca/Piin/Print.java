package Piin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Print extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void lol(String v1, String v2, String v3, String v4, String v5,boolean v6) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Print frame = new Print(v1,v2,v3,v4,v5,v6);
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
	public Print(String v1, String v2, String v3, String v4, String v5,boolean v6) {
		
		setBounds(100, 100, 275, 296);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 179, 98));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("ISBN:");
		lblNewLabel.setBounds(5, 37, 38, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label = new JLabel("");
		label.setBounds(54, 22, 0, 0);
		
		JLabel lblNewLabel_5 = new JLabel("Genero:");
		lblNewLabel_5.setBounds(5, 157, 66, 19);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(100, 22, 0, 0);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(5, 67, 40, 19);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(148, 22, 0, 0);
		
		JLabel lblNewLabel_3 = new JLabel("Leido:");
		lblNewLabel_3.setBounds(5, 187, 38, 19);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(194, 22, 0, 0);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(5, 97, 40, 19);
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_4 = new JLabel("Sipnepsis:");
		lblNewLabel_4.setBounds(5, 127, 66, 19);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(label);
		contentPane.add(lblNewLabel_5);
		contentPane.add(label_1);
		contentPane.add(lblTitulo);
		contentPane.add(label_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(label_3);
		contentPane.add(lblAutor);
		contentPane.add(lblNewLabel_4);
		
		JLabel ISBN = new JLabel(v1);
		ISBN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ISBN.setBounds(110, 41, 139, 19);
		contentPane.add(ISBN);
		
		JLabel titulo = new JLabel(v2);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		titulo.setBounds(110, 71, 139, 19);
		contentPane.add(titulo);
		
		JLabel autor = new JLabel(v3);
		autor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		autor.setBounds(110, 101, 139, 19);
		contentPane.add(autor);
		
		JLabel sipnesis = new JLabel(v4);
		sipnesis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sipnesis.setBounds(110, 131, 139, 19);
		contentPane.add(sipnesis);
		
		JLabel genero = new JLabel(v5);
		genero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		genero.setBounds(110, 161, 139, 19);
		contentPane.add(genero);
		
		if(v6 == true) {
			JLabel leido = new JLabel("Leido");	
			leido.setFont(new Font("Tahoma", Font.PLAIN, 15));
			leido.setBounds(110, 191, 38, 19);
			contentPane.add(leido);
		}else {
			JLabel leido = new JLabel("Lo tengo");
			leido.setFont(new Font("Tahoma", Font.PLAIN, 15));
			leido.setBounds(110, 191, 38, 19);
			contentPane.add(leido);
		}
		
	}
}
