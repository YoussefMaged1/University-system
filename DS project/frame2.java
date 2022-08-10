import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JButton;

public class frame2 extends JFrame {

	private JPanel Panel;
	private JTextField coursesFinshedText;
	private JTextField creditHoursText;
	private JTextField finishedCourseCodeText;
	private JTextField finishedCourseNameText;
	private JTextField finishedCourseCreditHoursText;
	private JTextField numberOfTimesText;
	private JTextField courseLecturerText;
	private JTextField finishedCourseGTAText;
	private JTextField finished7thWeekText;
	private JTextField finished12thWeekText;
	private JTextField finishedWorkMarkText;
	private JTextField finishedFinalExam;
	private JTextField finishedGradText;
	private JLabel finishedPercentageLabel;
	private JTextField finishedPercentageText;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField currentCourseCodeText;
	private FinishedCourse [] finished ;
    private CurrentCourse [] current;
    private JLabel lblNewLabel_3;
    private JTextField currentCourseNameText;
    private JLabel lblNewLabel_4;
    private JTextField currentCourseCreditHourText;
    private JLabel lblNewLabel_5;
    private JTextField currentNumberOfTimesText;
    private JLabel lblNewLabel_6;
    private JComboBox currentSemesterTakingCombo;
    private JLabel lblNewLabel_7;
    private JTextField currentCourseLecturer;
    private JLabel lblNewLabel_8;
    private JTextField currentCourseGTAText;
    private JLabel lblNewLabel_9;
    private JTextField current7thWeekText;
    private JTextField current12thWeekText;
    private JTextField currentWorkMarkText;
    private JTextField currentFinalExamText;
    private JLabel lblNewLabel_10;
    private JTextField currentGradText;
    private JLabel lblNewLabel_11;
    private JTextField currentStudenPercentageText;
  


	public frame2() {
		finished = new FinishedCourse[100];
		current = new CurrentCourse[8];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		Panel = new JPanel();
		Panel.setBorder(null);
		setContentPane(Panel);
		Panel.setLayout(null);
		setBounds(100, 100, 1200, 600);
		
		JLabel simestersLabel = new JLabel("Number of simesters finished");
		simestersLabel.setBounds(44, 59, 173, 13);
		Panel.add(simestersLabel);
		
		JComboBox GPACombo = new JComboBox();

		GPACombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		GPACombo.setBounds(256, 55, 96, 21);
		Panel.add(GPACombo);
		
		JLabel coursesFinshedLabel = new JLabel("Number of courses finished");
		coursesFinshedLabel.setBounds(44, 16, 173, 13);
		Panel.add(coursesFinshedLabel);
		
		coursesFinshedText = new JTextField();

		coursesFinshedText.setBounds(256, 13, 96, 19);
		Panel.add(coursesFinshedText);
		coursesFinshedText.setColumns(10);
		
		JLabel creditHoursLabel = new JLabel("Total number of credit hours ");
		creditHoursLabel.setBounds(791, 16, 173, 13);
		Panel.add(creditHoursLabel);
		
		creditHoursText = new JTextField();

		creditHoursText.setBounds(1031, 13, 96, 19);
		Panel.add(creditHoursText);
		creditHoursText.setColumns(10);
		
		JLabel finishedcourseCodeLabel = new JLabel("Course Code");
		finishedcourseCodeLabel.setBounds(44, 132, 133, 13);
		Panel.add(finishedcourseCodeLabel);
		
		finishedCourseCodeText = new JTextField();

		finishedCourseCodeText.setBounds(256, 129, 96, 19);
		Panel.add(finishedCourseCodeText);
		finishedCourseCodeText.setColumns(10);
		
		JLabel finishedCourseNameLabel = new JLabel("Course name");
		finishedCourseNameLabel.setBounds(44, 155, 119, 13);
		Panel.add(finishedCourseNameLabel);
		
		finishedCourseNameText = new JTextField();

		finishedCourseNameText.setBounds(256, 152, 96, 19);
		Panel.add(finishedCourseNameText);
		finishedCourseNameText.setColumns(10);
		
		JLabel finishedCourseCreditHoursLabel = new JLabel("Course credit hours");
		finishedCourseCreditHoursLabel.setBounds(44, 178, 119, 13);
		Panel.add(finishedCourseCreditHoursLabel);
		
		finishedCourseCreditHoursText = new JTextField();

		finishedCourseCreditHoursText.setBounds(256, 175, 96, 19);
		Panel.add(finishedCourseCreditHoursText);
		finishedCourseCreditHoursText.setColumns(10);
		
		JLabel numberOfTimesLabel = new JLabel("Number of times taking the course");
		numberOfTimesLabel.setBounds(44, 201, 195, 13);
		Panel.add(numberOfTimesLabel);
		
		numberOfTimesText = new JTextField();

		numberOfTimesText.setBounds(256, 198, 96, 19);
		Panel.add(numberOfTimesText);
		numberOfTimesText.setColumns(10);
		
		JLabel semesterTakingLabel = new JLabel("Semester for taking the course ");
		semesterTakingLabel.setBounds(44, 224, 195, 13);
		Panel.add(semesterTakingLabel);
		
		JComboBox semesterTakingCombo = new JComboBox();

		semesterTakingCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		semesterTakingCombo.setBounds(256, 220, 96, 21);
		Panel.add(semesterTakingCombo);
		
		JLabel courseLecturerLabel = new JLabel("Course lecturer");
		courseLecturerLabel.setBounds(791, 132, 133, 13);
		Panel.add(courseLecturerLabel);
		
		courseLecturerText = new JTextField();

		courseLecturerText.setBounds(1031, 126, 96, 19);
		Panel.add(courseLecturerText);
		courseLecturerText.setColumns(10);
		
		JLabel finishedCourseGTALabel = new JLabel("Course GTA ");
		finishedCourseGTALabel.setBounds(791, 155, 133, 13);
		Panel.add(finishedCourseGTALabel);
		
		finishedCourseGTAText = new JTextField();

		finishedCourseGTAText.setBounds(1031, 152, 96, 19);
		Panel.add(finishedCourseGTAText);
		finishedCourseGTAText.setColumns(10);
		
		JLabel finishedMarksLabel = new JLabel("Marks");
		finishedMarksLabel.setBounds(791, 178, 60, 13);
		Panel.add(finishedMarksLabel);
		
		finished7thWeekText = new JTextField();

		finished7thWeekText.setText("7th Week");
		finished7thWeekText.setBounds(851, 175, 60, 19);
		Panel.add(finished7thWeekText);
		finished7thWeekText.setColumns(10);
		
		finished12thWeekText = new JTextField();

		finished12thWeekText.setText("12th Week");
		finished12thWeekText.setBounds(921, 175, 60, 19);
		Panel.add(finished12thWeekText);
		finished12thWeekText.setColumns(10);
		
		finishedWorkMarkText = new JTextField();

		finishedWorkMarkText.setText("Work mark");
		finishedWorkMarkText.setBounds(991, 175, 60, 19);
		Panel.add(finishedWorkMarkText);
		finishedWorkMarkText.setColumns(10);
		
		finishedFinalExam= new JTextField();
		finishedFinalExam.setText("Final exam");
		finishedFinalExam.setBounds(1061, 175, 66, 19);
		Panel.add(finishedFinalExam);
		finishedFinalExam.setColumns(10);
		
		JLabel finishedGradLabel = new JLabel("Grad of the course");
		finishedGradLabel.setBounds(792, 201, 119, 13);
		Panel.add(finishedGradLabel);
		
		finishedGradText = new JTextField();

		finishedGradText.setBounds(1031, 198, 96, 19);
		Panel.add(finishedGradText);
		finishedGradText.setColumns(10);
		
		finishedPercentageLabel = new JLabel("Student percentage");
		finishedPercentageLabel.setBounds(792, 224, 119, 13);
		Panel.add(finishedPercentageLabel);
		
		finishedPercentageText = new JTextField();

		finishedPercentageText.setBounds(1031, 221, 96, 19);
		Panel.add(finishedPercentageText);
		finishedPercentageText.setColumns(10);
		
		lblNewLabel = new JLabel(" Finished Course ");
		lblNewLabel.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNewLabel.setBounds(468, 82, 218, 24);
		Panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("    Current Course");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(468, 275, 218, 24);
		Panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Course Code");
		lblNewLabel_2.setBounds(44, 329, 101, 13);
		Panel.add(lblNewLabel_2);
		
		currentCourseCodeText = new JTextField();

		currentCourseCodeText.setBounds(256, 326, 96, 19);
		Panel.add(currentCourseCodeText);
		currentCourseCodeText.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Course name");
		lblNewLabel_3.setBounds(44, 352, 101, 13);
		Panel.add(lblNewLabel_3);
		
		currentCourseNameText = new JTextField();

		currentCourseNameText.setBounds(256, 349, 96, 19);
		Panel.add(currentCourseNameText);
		currentCourseNameText.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Course credit hours");
		lblNewLabel_4.setBounds(44, 375, 143, 13);
		Panel.add(lblNewLabel_4);
		
		currentCourseCreditHourText = new JTextField();

		currentCourseCreditHourText.setBounds(256, 372, 96, 19);
		Panel.add(currentCourseCreditHourText);
		currentCourseCreditHourText.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Number of times taking the course");
		lblNewLabel_5.setBounds(44, 398, 195, 13);
		Panel.add(lblNewLabel_5);
		
		currentNumberOfTimesText = new JTextField();

		currentNumberOfTimesText.setBounds(256, 395, 96, 19);
		Panel.add(currentNumberOfTimesText);
		currentNumberOfTimesText.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Semester for taking the course");
		lblNewLabel_6.setBounds(44, 421, 184, 13);
		Panel.add(lblNewLabel_6);
		
		currentSemesterTakingCombo = new JComboBox();

		currentSemesterTakingCombo.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8"}));
		currentSemesterTakingCombo.setBounds(256, 417, 96, 21);
		Panel.add(currentSemesterTakingCombo);
		
		lblNewLabel_7 = new JLabel("Course lecturer");
		lblNewLabel_7.setBounds(791, 329, 117, 13);
		Panel.add(lblNewLabel_7);
		
		currentCourseLecturer = new JTextField();

		currentCourseLecturer.setBounds(1031, 326, 96, 19);
		Panel.add(currentCourseLecturer);
		currentCourseLecturer.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Course GTA");
		lblNewLabel_8.setBounds(791, 352, 117, 13);
		Panel.add(lblNewLabel_8);
		
		currentCourseGTAText = new JTextField();

		currentCourseGTAText.setBounds(1031, 349, 96, 19);
		Panel.add(currentCourseGTAText);
		currentCourseGTAText.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Marks");
		lblNewLabel_9.setBounds(791, 375, 66, 13);
		Panel.add(lblNewLabel_9);
		
		current7thWeekText = new JTextField();

		current7thWeekText.setText("7th Week");
		current7thWeekText.setBounds(851, 372, 60, 19);
		Panel.add(current7thWeekText);
		current7thWeekText.setColumns(10);
		
		current12thWeekText = new JTextField();

		current12thWeekText.setText("12th Week");
		current12thWeekText.setBounds(921, 372, 60, 19);
		Panel.add(current12thWeekText);
		current12thWeekText.setColumns(10);
		
		currentWorkMarkText = new JTextField();

		currentWorkMarkText.setText("Work mark");
		currentWorkMarkText.setBounds(991, 372, 60, 19);
		Panel.add(currentWorkMarkText);
		currentWorkMarkText.setColumns(10);
		
		currentFinalExamText = new JTextField();

		currentFinalExamText.setText("Final exam");
		currentFinalExamText.setBounds(1061, 372, 66, 19);
		Panel.add(currentFinalExamText);
		currentFinalExamText.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Grad of the course");
		lblNewLabel_10.setBounds(791, 398, 173, 13);
		Panel.add(lblNewLabel_10);
		
		currentGradText = new JTextField();

		currentGradText.setBounds(1031, 395, 96, 19);
		Panel.add(currentGradText);
		currentGradText.setColumns(10);
		
		lblNewLabel_11 = new JLabel("Student percentage");
		lblNewLabel_11.setBounds(791, 421, 117, 13);
		Panel.add(lblNewLabel_11);
		
    	currentStudenPercentageText = new JTextField();

		currentStudenPercentageText.setBounds(1031, 418, 96, 19);
		Panel.add(currentStudenPercentageText);
		currentStudenPercentageText.setColumns(10);
		
		JButton exitButton = new JButton("Submit and Exit");
		exitButton.setBackground(Color.LIGHT_GRAY);
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == exitButton) {
					String numberSemisters = GPACombo.getSelectedItem().toString();
					String coursesFinshed = coursesFinshedText.getText();
					String creditHours = creditHoursText.getText();
					finished[0] = new FinishedCourse();
					finished[0].courseCode = finishedCourseCodeText.getText();
					finished[0].courseName =finishedCourseNameText.getText();
					finished[0].courseCreditHours =finishedCourseCreditHoursText.getText();
					finished[0].numberOfTimes = numberOfTimesText.getText();
					finished[0].semester = semesterTakingCombo.getSelectedItem().toString();
					finished[0].lecturer = courseLecturerText.getText();
					finished[0].GTA = finishedCourseGTAText.getText();
					finished[0].marks[0] = finished7thWeekText.getText();
					finished[0].marks[1] = finished12thWeekText.getText();
					finished[0].marks[2] = finishedWorkMarkText.getText();
					finished[0].marks[3] = finishedFinalExam.getText();
					finished[0].grade = finishedGradText.getText();
					finished[0].percentage = finishedPercentageText.getText();
					current[0] = new CurrentCourse(8);
					current[0].courseCode =currentCourseCodeText.getText();
					current[0].courseName =currentCourseNameText.getText();
					current[0].courseCreditHours =currentCourseCreditHourText.getText();
					current[0].numberOfTimes =currentNumberOfTimesText.getText();
					current[0].semester =currentSemesterTakingCombo.getSelectedItem().toString();
					current[0].lecturer =currentCourseLecturer .getText();
					current[0].GTA = currentCourseGTAText .getText();
					current[0].marks[0] = current7thWeekText.getText();
					current[0].marks[1] = current12thWeekText.getText();
					current[0].marks[2] = currentWorkMarkText.getText();
					current[0].marks[3] = currentFinalExamText.getText();
					current[0].grade = currentGradText.getText();
					current[0].percentage = currentStudenPercentageText.getText();					
					System.exit(NORMAL);
					
				}
			}
		});
		exitButton.setBounds(501, 477, 151, 21);
		Panel.add(exitButton);
		
		JLabel lblNewLabel_12 = new JLabel("_____________________");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_12.setBounds(478, 103, 138, 13);
		Panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("__________________");
		lblNewLabel_13.setBounds(501, 296, 141, 13);
		Panel.add(lblNewLabel_13);
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
