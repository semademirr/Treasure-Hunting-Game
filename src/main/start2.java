package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class start2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	public static int width;
	public static int length;

	static start2 frame = new start2();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// start2 frame = new start2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public start2() {
		
		
		getContentPane().setBackground(new Color(0, 255, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 500, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to the treasure hunting game ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(67, 20, 388, 54);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create New Map");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				JFrame window = new JFrame();
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setResizable(false);
				window.setTitle("Treasure Hunting");
				
				GamePanel gamePanel = new GamePanel();
				window.add(gamePanel);
				window.pack(); 
				
				window.setLocationRelativeTo(null); 
				window.setVisible(true); 
				gamePanel.startGameThread();
				
			    
      
			}
		});
		btnNewButton.setBounds(33, 104, 169, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Start Game");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(253, 104, 141, 21);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Width:");
		lblNewLabel_1.setBounds(45, 152, 45, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Length:");
		lblNewLabel_2.setBounds(45, 192, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                  String text = textField.getText();
                
                try {
                    
                    width = Integer.parseInt(text);
                    
                    
                    System.out.println("Screen Width: " + width);
                } catch (NumberFormatException ex) {
                    
                    System.out.println("Geçersiz giriş! Lütfen bir tamsayı girin.");
                }
			}
		});
		textField.setBounds(106, 149, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               String text1 = textField_1.getText();
                length = Integer.parseInt(text1);
                try {
                    
                   length = Integer.parseInt(text1);
                   System.out.println("Screen Length: "+length);
                } catch (NumberFormatException ex) {
                    
                    System.out.println("Geçersiz giriş! Lütfen bir tamsayı girin.");
                }
			}
		});
		textField_1.setBounds(106, 189, 96, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		this.width = width;
		this.length = length;
		
		
	}
}
