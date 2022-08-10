import javax.swing.*; 
import java.awt.*; 
import java.awt.Image; 
import java.awt.event.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.print.*; 

import java.io.*; 
import java.io.IOException; 

public class Students extends JFrame { 
JLabel l1, l2, l3, l4, 
l5, l6, l7, l8, 
l9, l10, l12, l13, 
l14, l11, l15; 

JTextField tf1, tf2, tf3, 
tf4, tf5, tf6, 
tf7, tf8, tf9, 
tf10; 
JTextArea area2, area1; 
JRadioButton rb1, rb2, rb3, 
rb4, rb5, rb6, 
rb7; 

JFileChooser f1; 
Students() 
{ 

l1 = new JLabel("Student Contact"); 
l1.setFont(new Font("Tahoma", Font.BOLD, 14));
l1.setBounds(550, 100, 250, 20); 

l2 = new JLabel( 
"Name of the Student:"); 
l2.setBounds(50, 150, 250, 20); 

tf1 = new JTextField(); 
tf1.setBounds(250, 150, 250, 20); 

l3 = new JLabel( 
"Name of the Father:"); 
l3.setBounds(50, 200, 250, 20); 

tf2 = new JTextField(); 
tf2.setBounds(250, 200, 250, 20); 

l4 = new JLabel("Mobile Number:"); 
l4.setBounds(50, 250, 250, 20); 

tf3 = new JTextField(); 
tf3.setBounds(250, 250, 250, 20); 

l5 = new JLabel("Email ID:"); 
l5.setBounds(50, 300, 250, 20); 

tf4 = new JTextField(); 
tf4.setBounds(250, 300, 250, 20); 

l6 = new JLabel("Home Number:"); 
l6.setBounds(50, 356, 250, 20); 

tf5 = new JTextField(); 
tf5.setBounds(250, 357, 250, 20); 

l7 = new JLabel("Address:"); 
l7.setBounds(50, 475, 250, 20); 

area1 = new JTextArea(); 
area1.setBackground(Color.LIGHT_GRAY);
area1.setBounds(250, 507, 250, 90); 

l9 = new JLabel("Gender:"); 
l9.setBounds(50, 413, 250, 20); 

JRadioButton r5 
= new JRadioButton(" Male"); 
JRadioButton r6 
= new JRadioButton(" Female"); 

r5.setBounds(250, 407, 100, 30); 
r6.setBounds(400, 408, 100, 30); 

ButtonGroup bg = new ButtonGroup(); 
bg.add(r5); 
bg.add(r6); 

l10 = new JLabel("Nationality:"); 
l10.setBounds(50, 618, 250, 20); 

tf6 = new JTextField(); 
tf6.setBounds(262, 619, 250, 20); 

ImageIcon i2 = new ImageIcon("2.png"); 
JLabel l15 
= new JLabel("", i2, JLabel.CENTER); 

l15.setBounds(900, 50, 600, 200); 
ButtonGroup bg1 = new ButtonGroup(); 
rb3 = new JRadioButton("HOSTELLER"); 
rb3.setBounds(250, 470, 100, 30); 

rb4 = new JRadioButton("DAY SCHOLAR"); 
rb4.setBounds(380, 470, 120, 30); 

ButtonGroup bg2 = new ButtonGroup(); 
bg2.add(rb3); 
bg2.add(rb4); 
final JLabel label 
= new JLabel(); 
label.setBounds(600, 430, 500, 30); 

 

JButton Receipt 
 = new JButton("Generate "); 
Receipt.setBackground(Color.LIGHT_GRAY);
Receipt.setBounds(750, 408, 150, 30); 
JButton btnback = new JButton("back"); 
btnback.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Try trr = new Try();
		trr.setVisible(true);
		dispose();
	}
});
btnback.setBackground(Color.LIGHT_GRAY);
btnback.setBounds(352, 703, 150, 30); 
JButton btnnext = new JButton("next"); 
btnnext.setBackground(Color.LIGHT_GRAY);
btnnext.setBounds(550, 703, 150, 30); 

area2 = new JTextArea(); 
area2.setBackground(Color.LIGHT_GRAY);
area2.setBounds(600, 148, 450, 240); 

getContentPane().add(l1); 
getContentPane().add(l2); 
getContentPane().add(l3); 
getContentPane().add(l4); 
getContentPane().add(l5); 
getContentPane().add(l6); 
getContentPane().add(l7); 
getContentPane().add(l9); 
getContentPane().add(l10);   
getContentPane().add(tf1); 
getContentPane().add(tf2); 
getContentPane().add(tf3); 
getContentPane().add(tf4); 
getContentPane().add(tf5); 
getContentPane().add(tf6); 
getContentPane().add(area1); 
getContentPane().add(area2); 
getContentPane().add(l15); 
getContentPane().add(rb3); 
getContentPane().add(rb4); 
getContentPane().add(r5); 
getContentPane().add(r6);  
getContentPane().add(label); 
getContentPane().add(Receipt); 
getContentPane().add(btnback); 
getContentPane().add(btnnext); 


  { 
   area2.setText(""); 
   area1.setText(" "); 
   tf1.setText(""); 
   tf2.setText(""); 
   tf3.setText(""); 
   tf4.setText(""); 
   tf5.setText(""); 
   tf6.setText(" "); 
  } 


btnnext.addActionListener( 
 new ActionListener() { 
  public void actionPerformed( 
   ActionEvent e) 
  { 
	  RemainingHours RH = new RemainingHours();
	  RH.setVisible(true);
	  dispose();
 }}); 

Receipt.addActionListener(new ActionListener() { 
 public void actionPerformed(ActionEvent e) 
 { 

  area2.setText( 
   "--------------------------------" 
   + "-----------Student Contact----" 
   + "--------------------------" 
   + "--------------------------" 
   + "-------------------\n"); 

  area2.setText(area2.getText() 
     + "Student Name: " 
     + tf1.getText() 
     + "\n"); 
  area2.setText(area2.getText() 
     + "Father's Name: " 
     + tf2.getText() 
     + "\n"); 
  area2.setText(area2.getText() 
     + "Mobile Number: " 
     + tf3.getText() 
     + "\n"); 
  area2.setText(area2.getText() 
     + "Email ID: " 
     + tf4.getText() 
     + "\n"); 
  area2.setText(area2.getText() 
     + "Home Number: " 
     + tf5.getText() 
     + "\n"); 
  

	    if (rb3.isSelected()) { 
	     area2.setText(area2.getText() 
	        + "Wants to be a " 
	        + "Hosteller \n"); 
	    } 
	    if (rb4.isSelected()) { 
	     area2.setText(area2.getText() 
	        + "Wants to be a " 
	        + "Day Scholar \n"); 
	    } 
	    
	    if (e.getSource() == Receipt) { 
	     try { 
	      FileWriter fw 
	       = new FileWriter( 
	        "java.txt", true); 
	      fw.write(area2.getText()); 
	      fw.close(); 
	     } 
	     catch (Exception ae) { 
	      System.out.println(ae); 
	     } 
	    } 
	 
	    JOptionPane.showMessageDialog( 
	     area2, "DATA SAVED SUCCESSFULLY"); 
	   }; 
	  }); 
	  addWindowListener( 
	   new WindowAdapter() { 
	    public void windowClosing( 
	     WindowEvent we) 
	    { 
	     System.exit(0); 
	    } 
	   }); 
	  setSize(1104, 800); 
	  getContentPane().setLayout(null); 
	  setVisible(true); 
	  setBackground(Color.WHITE); 
	 } 
	 public static void main(String[] args) 
	 { 
	  new Students(); 
	 } 
	}