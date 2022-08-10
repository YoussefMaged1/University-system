import java.awt.BorderLayout; 
import java.awt.EventQueue; 
 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.border.EmptyBorder; 
import java.awt.Color; 
import javax.swing.JLayeredPane; 
import javax.swing.JTextField; 
import java.awt.Font; 
import javax.swing.JButton; 
import javax.swing.JLabel; 
import javax.swing.JSeparator; 
import javax.swing.JRadioButton; 
import javax.swing.SwingConstants; 
import javax.swing.JTextArea; 
import javax.swing.ImageIcon; 
import javax.swing.ButtonGroup; 
import java.awt.event.ActionListener; 
import java.util.LinkedList; 
import java.awt.event.ActionEvent; 
import javax.swing.JComboBox; 
import javax.swing.DefaultComboBoxModel; 
import javax.swing.event.AncestorListener; 
import javax.swing.event.AncestorEvent; 
import javax.swing.JSplitPane; 
import javax.swing.JScrollPane; 
import javax.swing.JInternalFrame; 
import javax.swing.JProgressBar; 
import java.awt.SystemColor; 
 
public class scene extends JFrame { 
  
 public static LinkedList<Student> alex = new LinkedList<Student>(); 
 public String student_year; 
 public int student_term; 
 public int student_faculty; 
 public int student_dep; 
 public String student_num; 
 public String student_passport; 
 public String nationality; 
 public String reg_num; 
 public String type_of_ID; 
 public String tt; 
 public String nn; 
 public int num; 
  
  
 
 private JPanel contentPane; 
 private JButton ok_btn; 
 private JLabel lblNewLabel; 
 private JTextField f_name; 
 private JSeparator separator; 
 private JLabel lblNewLabel_1; 
 private JTextField m_name; 
 private JSeparator separator_1; 
 private JLabel lblNewLabel_2; 
 private JTextField l_name; 
 private JSeparator separator_2; 
 private JLabel lblNewLabel_3; 
 private JRadioButton male_btn; 
 private JRadioButton female_btn; 
 private final ButtonGroup buttonGroup = new ButtonGroup(); 
 private final ButtonGroup buttonGroup_1 = new ButtonGroup(); 
  
 private String firstName; 
 private String middleName; 
 private String lastName; 
 private String gender; 
 private JComboBox term; 
 private JComboBox faculty; 
 private JComboBox dep; 
 private JLabel lblNewLabel_5; 
 private JLabel lblNewLabel_6; 
 private JLabel i_of_student; 
 private JComboBox year; 
 private JComboBox nat; 
 private JLabel lblNewLabel_7; 
 private JLabel lblNewLabel_8; 
 private JLabel lblNewLabel_9; 
 private JLabel lblNewLabel_10; 
 private JLabel lblNewLabel_11; 
 private JTextField passpor; 
 private JLabel lblNewLabel_12; 
 private JComboBox typeID; 
 private JButton submit_btn; 
 private JLabel id; 
 private JLabel lblNewLabel_4;
 private JLabel lblNewLabel_13;
 private JButton btnNewButton;
 private JLabel lblNewLabel_14;
 private JTextField textField;
 private JLabel lblNewLabel_15;
 private JTextField textField_1;
  
 

 public static void main(String[] args) { 
  EventQueue.invokeLater(new Runnable() { 
   public void run() { 
    try { 
     scene frame = new scene(); 
     
     frame.setVisible(true); 
    } catch (Exception e) { 
     e.printStackTrace(); 
    } 
   } 
  }); 
 } 
 
 public scene() { 
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  setBounds(100, 100, 1200, 800); 
  contentPane = new JPanel(); 
  contentPane.setBackground(new Color(255, 255, 255)); 
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
  setContentPane(contentPane); 
  contentPane.setLayout(null);
  setTitle("Alexandria university");
  setResizable(false);
   
  ok_btn = new JButton("click to generate your registration number"); 
  ok_btn.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
      
     // handle first name 
     String first,mid ,last,gender; 
      
     first= f_name.getText(); 
     mid = m_name.getText(); 
     last =l_name.getText(); 
     mid = m_name.getText(); 
     last = l_name.getText(); 
     if (male_btn.isSelected()) gender = "male"; 
     else if(female_btn.isSelected()) gender = "female"; 
     else gender = "Others"; 
      
     // Num patter year + term + facutly + dep + reg_num 
//    String pattern = ""; 
      
     if (alex.size()>=1) { 
         reg_num = String.format("%s%d%02d%02d%02d",student_year,student_term,student_faculty,student_dep,alex.getLast().getNum()+1); 
       
     }else { 
      reg_num = String.format("%s%d%02d%02d%02d",student_year,student_term,student_faculty,student_dep,1); 
     } 
      
 
     // Create New Student 
     num++; 
     Student s = new Student(first, mid, last, gender, nationality,reg_num, num); 
     alex.add(s); 
      
          id.setText(reg_num); 
      
    } 
     
   } 
 ); 
  ok_btn.setBackground(Color.LIGHT_GRAY); 
  ok_btn.setFont(new Font("Tahoma", Font.BOLD, 15)); 
  ok_btn.setBounds(753, 441, 423, 43); 
  contentPane.add(ok_btn);
   
  lblNewLabel = new JLabel("First Name:"); 
  lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel.setBounds(10, 181, 127, 43); 
  contentPane.add(lblNewLabel); 
   
  f_name = new JTextField(); 
  f_name.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
   } 
  }); 
  f_name.setBounds(171, 189, 218, 31); 
  contentPane.add(f_name); 
  f_name.setColumns(10); 
   
  separator = new JSeparator(); 
  separator.setBounds(171, 189, 218, 31); 
  contentPane.add(separator); 
   
  lblNewLabel_1 = new JLabel("Middle Name:"); 
  lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_1.setBounds(10, 221, 153, 50); 
  contentPane.add(lblNewLabel_1); 
   
  m_name = new JTextField(); 
  m_name.setBounds(171, 233, 218, 31); 
  contentPane.add(m_name); 
  m_name.setColumns(10); 
   
  separator_1 = new JSeparator(); 
  separator_1.setBounds(171, 233, 218, 31); 
  contentPane.add(separator_1); 
   
  lblNewLabel_2 = new JLabel("Last Name:"); 
  lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_2.setBounds(10, 261, 134, 50); 
  contentPane.add(lblNewLabel_2); 
   
  l_name = new JTextField(); 
  l_name.setBounds(171, 273, 218, 31); 
  contentPane.add(l_name); 
  l_name.setColumns(10); 
   
  separator_2 = new JSeparator(); 
  separator_2.setBounds(171, 275, 218, 31); 
  contentPane.add(separator_2); 
   
  lblNewLabel_3 = new JLabel("Gendar:"); 
  lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_3.setBounds(10, 309, 200, 50); 
  contentPane.add(lblNewLabel_3); 
   
  male_btn = new JRadioButton("Male"); 
  buttonGroup.add(male_btn); 
  male_btn.setToolTipText("Gendar"); 
  male_btn.setBackground(new Color(255, 255, 255)); 
  male_btn.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
  male_btn.setBounds(170, 309, 99, 50); 
  contentPane.add(male_btn); 
   
  female_btn = new JRadioButton("Female"); 
  buttonGroup.add(female_btn); 
  female_btn.setToolTipText("Gendar"); 
  female_btn.setBackground(new Color(255, 255, 255)); 
  female_btn.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
  female_btn.setBounds(290, 309, 99, 50); 
  contentPane.add(female_btn); 
   
  term = new JComboBox(); 
  term.setBackground(Color.LIGHT_GRAY); 
  term.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    student_term = term.getSelectedIndex()+1; 
   } 
  }); 
  term.setModel(new DefaultComboBoxModel(new String[] {"First Term", "Second Term"})); 
  term.setBounds(1006, 273, 170, 31); 
  contentPane.add(term); 
   
  faculty = new JComboBox(); 
  faculty.setBackground(Color.LIGHT_GRAY); 
  faculty.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    student_faculty = faculty.getSelectedIndex()+24; 
   }}); 
  faculty.setModel(new DefaultComboBoxModel(new String[] {"Faculty of Engineering", "Faculty of Data Science", "Faculty of Science", "Faculty of medicine", "Faculty of Education", "Faculty of Physical Education", "college of Literature"})); 
  faculty.setBounds(1006, 321, 170, 31); 
  contentPane.add(faculty); 
   
  dep = new JComboBox(); 
  dep.setBackground(Color.LIGHT_GRAY); 
  dep.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    student_dep = dep.getSelectedIndex()+1; 
   } 
  }); 
  dep.setModel(new DefaultComboBoxModel(new String[] {"General", "Credit"})); 
  dep.setBounds(1006, 365, 170, 31); 
  contentPane.add(dep); 
   
  lblNewLabel_5 = new JLabel("Nationality:"); 
  lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_5.setBounds(753, 177, 117, 50); 
  contentPane.add(lblNewLabel_5); 
   
  i_of_student = new JLabel("Your registration number:"); 
  i_of_student.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
  i_of_student.setBounds(349, 512, 231, 50); 
  contentPane.add(i_of_student); 
   
  year = new JComboBox(); 
  year.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    student_year =year.getSelectedItem().toString(); 
   } 
  }); 
  year.setBackground(Color.LIGHT_GRAY); 
  year.setModel(new DefaultComboBoxModel(new String[] {"2019", "2020", "2021", "2022"})); 
  year.setBounds(1006, 233, 170, 31); 
  contentPane.add(year);
   
  nat = new JComboBox(); 
  nat.setBackground(Color.LIGHT_GRAY); 
  nat.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    nationality=nat.getSelectedItem().toString(); 
   } 
  }); 
  nat.setModel(new DefaultComboBoxModel(new String[] {"Egyptian", "Other"})); 
  nat.setBounds(1006, 189, 170, 31); 
  contentPane.add(nat); 
   
  lblNewLabel_7 = new JLabel("Year Of Enrollment:"); 
  lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_7.setBounds(753, 221, 183, 50); 
  contentPane.add(lblNewLabel_7); 
   
  lblNewLabel_8 = new JLabel("Current Term:"); 
  lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_8.setBounds(753, 261, 155, 50); 
  contentPane.add(lblNewLabel_8); 
   
  lblNewLabel_9 = new JLabel("Your Faculty:"); 
  lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_9.setBounds(753, 309, 145, 50); 
  contentPane.add(lblNewLabel_9); 
   
  lblNewLabel_10 = new JLabel("Department:"); 
  lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_10.setBounds(753, 351, 155, 50); 
  contentPane.add(lblNewLabel_10); 
   
  lblNewLabel_11 = new JLabel("Your ID:"); 
  lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_11.setBounds(10, 399, 99, 50); 
  contentPane.add(lblNewLabel_11); 
   
  passpor = new JTextField(); 
  passpor.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
     
     
   } 
  }); 
  passpor.setBounds(171, 411, 218, 31); 
  contentPane.add(passpor); 
  passpor.setColumns(10); 
   
  lblNewLabel_12 = new JLabel("Type Of Your ID:"); 
  lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16)); 
  lblNewLabel_12.setBounds(10, 351, 200, 50); 
  contentPane.add(lblNewLabel_12); 
   
  typeID = new JComboBox(); 
  typeID.setBackground(Color.LIGHT_GRAY); 
  typeID.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    type_of_ID=typeID.getSelectedItem().toString(); 
    
   } 
  }); 
  typeID.setModel(new DefaultComboBoxModel(new String[] {"national ID", "passport"})); 
  typeID.setBounds(171, 363, 218, 31); 
  contentPane.add(typeID); 
   
  submit_btn = new JButton("next"); 
  submit_btn.setBackground(Color.LIGHT_GRAY); 
  submit_btn.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    MyFrame myframe = new MyFrame();
    myframe.setVisible(true);
    dispose();
   } 
  }); 
  submit_btn.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
  submit_btn.setBounds(562, 598, 134, 24); 
  contentPane.add(submit_btn); 
   
  id = new JLabel(""); 
  id.setFont(new Font("Tahoma", Font.PLAIN, 20));
  id.setBounds(590, 512, 200, 50); 
  contentPane.add(id); 
  
  lblNewLabel_4 = new JLabel("Student information");
  lblNewLabel_4.setBackground(Color.WHITE);
  lblNewLabel_4.setForeground(Color.BLACK);
  lblNewLabel_4.setFont(new Font("Arial", Font.ITALIC, 24));
  lblNewLabel_4.setBounds(477, 49, 238, 43);
  contentPane.add(lblNewLabel_4);
  
  lblNewLabel_13 = new JLabel("______________________");
  lblNewLabel_13.setBackground(Color.WHITE);
  lblNewLabel_13.setBounds(502, 79, 283, 13);
  contentPane.add(lblNewLabel_13);
  
  btnNewButton = new JButton("Back");
  btnNewButton.addActionListener(new ActionListener() {
  	public void actionPerformed(ActionEvent e) {
  		Second second = new Second();
  		second.setVisible(true);
  		dispose();
  	}
  });
  btnNewButton.setBackground(Color.LIGHT_GRAY);
  btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
  btnNewButton.setBounds(400, 598, 134, 24);
  contentPane.add(btnNewButton);
  
  lblNewLabel_14 = new JLabel("Tutor name:");
  lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
  lblNewLabel_14.setBounds(10, 441, 200, 50);
  contentPane.add(lblNewLabel_14);
  
  textField = new JTextField();
  textField.setBounds(171, 452, 218, 31);
  contentPane.add(textField);
  textField.setColumns(10);
  
  lblNewLabel_15 = new JLabel("Tutor code:");
  lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
  lblNewLabel_15.setBounds(753, 399, 200, 50);
  contentPane.add(lblNewLabel_15);
  
  textField_1 = new JTextField();
  textField_1.setBounds(1006, 406, 170, 31);
  contentPane.add(textField_1);
  textField_1.setColumns(10);
 } 
 private static class __Tmp { 
  private static void __tmp() { 
     javax.swing.JPanel __wbp_panel = new javax.swing.JPanel(); 
  } 
 } 
}