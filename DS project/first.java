import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class first extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	JLabel lblNewLabel_3; 
	



	public first() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\youss\\Desktop\\download.jpg"));
		lblNewLabel.setBounds(174, 0, 349, 159);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User name");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(218, 210, 94, 13);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(374, 208, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(218, 268, 83, 13);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(374, 267, 96, 19);
		contentPane.add(passwordField);
	    lblNewLabel_3 = new JLabel(" ");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(229, 311, 283, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(301, 356, 85, 21);
		contentPane.add(btnNewButton);



	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = textField.getText();
		String pass = passwordField.getText();
		if(user.equals("admin") && pass.equals("admin")) {
			    Second second = new Second();
			    second.setVisible(true);
			    dispose();
			}else {	
				lblNewLabel_3.setText("User name or password is uncorrect !!!");
			}		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first frame = new first();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
