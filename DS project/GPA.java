import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class GPA extends  JFrame
{ 
     
    private JLabel subjectLabel, cHoursLabel, gradeLabel;        
    private JTextField subject, cHours; 
    private JButton addSubjectButton, calcGPAButton, clearAllButton; 
    private JTextArea tArea; 
    private JComboBox grade; 
 
    String[] subjectArray = new String[6];                   
    String[] gradeArray = new String[6]; 
    int[] cHoursArray = new int[6]; 
    double[] gradeValue = { 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.33, 1.00, 0.00 }; 
    String[] gradeLetter= { "A",  "A-", "B+", "B",  "B-", "C+", "C",  "D",  "D-", "E",  "F"};                   
 
 
    public GPA() 
    {    
        getContentPane().setLayout (null); 
        setPreferredSize (new Dimension(500, 529)); 
        setBackground (Color.WHITE);  
		setBounds(100, 100, 500, 600);

 
        subjectLabel = new JLabel ("Subject Name: ");                        
        subject = new JTextField (33); 
        subject.addActionListener (new TempListener()); 
 
        gradeLabel = new JLabel ("Grade: "); 
        grade = new JComboBox (gradeLetter);  
        grade.setBackground(Color.LIGHT_GRAY);
        grade.addActionListener (new TempListener()); 
 
        cHoursLabel = new JLabel ("Credit Hours: "); 
        cHours = new JTextField (1); 
        cHours.addActionListener (new TempListener()); 
 
        addSubjectButton = new JButton("Add Another Subject"); 
        addSubjectButton.setBackground(Color.LIGHT_GRAY);
        addSubjectButton.addActionListener(new TempListener()); 
        calcGPAButton = new JButton("Calculate GPA"); 
        calcGPAButton.setBackground(Color.LIGHT_GRAY);
        calcGPAButton.addActionListener(new TempListener()); 
        clearAllButton = new JButton("Clear All"); 
        clearAllButton.setBackground(Color.LIGHT_GRAY);
        clearAllButton.addActionListener(new TempListener()); 
 
        tArea = new JTextArea(5, 5);                 
        tArea.setBackground(Color.LIGHT_GRAY); 
        tArea.setEditable(false);      
 
        getContentPane().add (subjectLabel); 
        getContentPane().add (subject); 
        getContentPane().add (gradeLabel); 
        getContentPane().add (grade); 
        getContentPane().add (cHoursLabel); 
        getContentPane().add (cHours); 
        getContentPane().add (addSubjectButton); 
        getContentPane().add (calcGPAButton); 
        getContentPane().add (clearAllButton); 
        getContentPane().add (tArea); 
 
        subjectLabel.setBounds      (20, 20, 150, 20);               
        subject.setBounds           (120, 20, 350, 20); 
        gradeLabel.setBounds        (20, 50, 50, 20); 
        grade.setBounds             (120, 50, 50, 20); 
        cHoursLabel.setBounds       (20, 80, 100, 20); 
        cHours.setBounds            (120, 80, 50, 20); 
        addSubjectButton.setBounds  (20, 120, 200, 30); 
        calcGPAButton.setBounds     (215, 440, 132, 30); 
        clearAllButton.setBounds    (85, 440, 120, 30); 
        tArea.setBounds             (20, 170, 450, 250);  
         
        JButton btnback = new JButton("back"); 
        btnback.setBackground(Color.LIGHT_GRAY);
        btnback.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
        	    RemainingHours student = new RemainingHours();
        	    student.setVisible(true);
        	    dispose();
         } 
        }); 
        btnback.setBounds(120, 498, 85, 21); 
        getContentPane().add(btnback); 
         
        JButton btnNext = new JButton("next"); 
        btnNext.setBackground(Color.LIGHT_GRAY);
        btnNext.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
        	 frame2 framee = new frame2();
        	 framee.setVisible(true);
        	 dispose();
         } 
        }); 
        btnNext.setBounds(215, 498, 85, 21); 
        getContentPane().add(btnNext); 
    } 
 
 
    private class TempListener implements ActionListener 
    { 
 
        double tCrPoints = 0.00, tCrHours = 0.00, tGPA = 0.00;   
        String status;  
 
        public void actionPerformed(ActionEvent event) 
        { 
            if (event.getSource() == addSubjectButton)                    
            { 
                for (int i=0; i<6; i++) 
                { 
                    subjectArray[i] = subject.getText(); 
                    gradeArray[i] = (String) grade.getSelectedItem(); 
                    cHoursArray[i] = Integer.parseInt(cHours.getText());  
                } 
 
                tArea.append (subject.getText() + "\t\t\t" +  
                              grade.getSelectedItem() + "\t"  +  
                              cHours.getText() + "\n");  
                subject.setText(""); 
                cHours.setText("");} 
 
 
            if (event.getSource() == calcGPAButton)    
            { 
                for (int i=0 ; i<gradeArray.length; i++) 
                { 
                    for (int j=0; j<gradeLetter.length; j++) 
                    { 
                        if(gradeArray[i].equals(gradeLetter[j])) 
                        { 
                            tCrHours += cHoursArray[i];  
                            tCrPoints += gradeValue[j] * cHoursArray[i]; 
                        } 
                    } 
                } 
 
                tGPA = tCrPoints/tCrHours; 
                if (tGPA >= 2) 
                    status = ("Pass"); 
                else 
                    status = ("Fail");  
 
                tArea.setText("Total Credit Points : " + tCrPoints + "\n" + 
                              "Total Credit Hours : " + tCrHours + "\n\n" +  
                              "Grade Point Average (GPA) : " + tGPA + "\n" + 
                              "Status : " + status);  
            }  
 
 
            if (event.getSource() == clearAllButton)   
            { 
                tArea.setText(""); 
                cHours.setText(""); 
                grade.setSelectedIndex(0); 
                tCrHours = 0.00; 
                tCrPoints = 0.00; 
            } 
 
 
        }}  
 public static void main(String[] args) 
  { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GPA gpa = new GPA();
					gpa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
  } 
}