import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Try extends JFrame {

  private JPanel contentPane;
  private JTextField txttotalamountpaidsofar;
  private JTextField txtamountpereach;
  private JTextField txttransactionnumber;
  private JTextField txtbankoftransaction;
  private int NumberOfPaymentsDone;
  private int YearOfTransaction;
  private int MonthOfTransaction;
  private int DayOfTransaction;
  private String TypeOfFunding; 
  private String TotalAmountPaidSoFar;
  private String AmountPerEach;
  private String TransactionNumber;
  private String BankOfTransaction;
  static String DetailsOfEachPayment[] = new String[4];
  {
  DetailsOfEachPayment[0]=AmountPerEach;
  DetailsOfEachPayment[1]=TransactionNumber;
  DetailsOfEachPayment[2]=BankOfTransaction;
  DetailsOfEachPayment[3]=DayOfTransaction+"/"+MonthOfTransaction+"/"+YearOfTransaction;
  }
  

  public static void main(String[] args) {
    try {
    } catch (Exception e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Try frame = new Try();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

 
  public Try() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 450);
    contentPane = new JPanel();
    contentPane.setToolTipText("Payment");
    contentPane.setBackground(Color.WHITE);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Type of funding");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblNewLabel.setBounds(10, 25, 113, 23);
    contentPane.add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("Number of payments done");
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblNewLabel_1.setBounds(10, 56, 159, 29);
    contentPane.add(lblNewLabel_1);
    
    JLabel lblNewLabel_2 = new JLabel("Total amount paid so far");
    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
    lblNewLabel_2.setBounds(10, 98, 159, 23);
    contentPane.add(lblNewLabel_2);
    
    JLabel lblNewLabel_3 = new JLabel("Amount paid");
    lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
    lblNewLabel_3.setBounds(10, 166, 104, 13);
    contentPane.add(lblNewLabel_3);
    
    JLabel lblNewLabel_4 = new JLabel("Transaction number");
    lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
    lblNewLabel_4.setBounds(10, 204, 132, 13);
    contentPane.add(lblNewLabel_4);
    
    JLabel lblNewLabel_5 = new JLabel("Bank of Transaction");
    lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
    lblNewLabel_5.setBounds(10, 239, 141, 13);
    contentPane.add(lblNewLabel_5);
    
    JLabel lblNewLabel_6 = new JLabel("Date of transaction");
    lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
    lblNewLabel_6.setBounds(10, 282, 151, 23);
    contentPane.add(lblNewLabel_6);
    
    JLabel lblNewLabel_7 = new JLabel("Details of each payment");
    lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
    lblNewLabel_7.setBounds(117, 131, 185, 25);
    contentPane.add(lblNewLabel_7);
    
    txttotalamountpaidsofar = new JTextField();
    this.TotalAmountPaidSoFar = txttotalamountpaidsofar.getText();
    txttotalamountpaidsofar.setBounds(285, 101, 96, 19);
    contentPane.add(txttotalamountpaidsofar);
    txttotalamountpaidsofar.setColumns(10);
    
    txtamountpereach = new JTextField();
    this.AmountPerEach = txtamountpereach.getText();
    txtamountpereach.setBounds(285, 164, 96, 19);
    contentPane.add(txtamountpereach);
    txtamountpereach.setColumns(10);
    
    txttransactionnumber = new JTextField();
    this.TransactionNumber= txttransactionnumber.getText();
    txttransactionnumber.setBounds(285, 202, 96, 19);
    contentPane.add(txttransactionnumber);
    txttransactionnumber.setColumns(10);
    txtbankoftransaction = new JTextField();
    this.BankOfTransaction= txtbankoftransaction.getText();
    txtbankoftransaction.setBounds(285, 237, 96, 19);
    contentPane.add(txtbankoftransaction);
    txtbankoftransaction.setColumns(10);
    
    JComboBox comboxday = new JComboBox();
    comboxday.setBackground(Color.LIGHT_GRAY);
    this.DayOfTransaction = comboxday.getSelectedIndex();
    comboxday.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
    comboxday.setMaximumRowCount(32);
    comboxday.setBounds(217, 284, 43, 23);
    contentPane.add(comboxday);
    
    JComboBox comboxmonth = new JComboBox();
    comboxmonth.setBackground(Color.LIGHT_GRAY);
    this.MonthOfTransaction = comboxmonth.getSelectedIndex();
    comboxmonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
    comboxmonth.setMaximumRowCount(13);
    comboxmonth.setBounds(259, 284, 43, 23);
    contentPane.add(comboxmonth);
    
    JComboBox comboxyear = new JComboBox();
    comboxyear.setBackground(Color.LIGHT_GRAY);
    this.YearOfTransaction = comboxyear.getSelectedIndex();
    comboxyear.setModel(new DefaultComboBoxModel(new String[] {"2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"}));
    comboxyear.setMaximumRowCount(30);
    comboxyear.setBounds(300, 284, 81, 23);
    contentPane.add(comboxyear);
    
    JComboBox comboxnumberofpaymentsdone = new JComboBox();
    comboxnumberofpaymentsdone.setBackground(Color.LIGHT_GRAY);
    this.NumberOfPaymentsDone= comboxnumberofpaymentsdone.getSelectedIndex();
    comboxnumberofpaymentsdone.setMaximumRowCount(10);
    comboxnumberofpaymentsdone.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
    comboxnumberofpaymentsdone.setBounds(285, 60, 96, 23);
    contentPane.add(comboxnumberofpaymentsdone);
    
    JRadioButton rdbtnNewRadioButton = new JRadioButton("Self-funded");
    rdbtnNewRadioButton.setBackground(SystemColor.text);
    rdbtnNewRadioButton.setBounds(187, 25, 103, 21);
    contentPane.add(rdbtnNewRadioButton);
    
    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Grant-funded");
    rdbtnNewRadioButton_1.setBackground(Color.WHITE);
    rdbtnNewRadioButton_1.setBounds(298, 27, 103, 21);
    contentPane.add(rdbtnNewRadioButton_1);
    
    JButton btnNewback = new JButton("back");
    btnNewback.setBackground(Color.LIGHT_GRAY);
    btnNewback.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		MyFrame myframe = new MyFrame();
    		myframe.setVisible(true);
    		dispose();
    	}
    });
    btnNewback.setBounds(125, 375, 85, 21);
    contentPane.add(btnNewback);
    
    JButton btnNext = new JButton("next");
    btnNext.setBackground(Color.LIGHT_GRAY);
    btnNext.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    	    Students student = new Students();
    	    student.setVisible(true);
    	    dispose();
    	}
    });
    btnNext.setBounds(220, 375, 85, 21);
    contentPane.add(btnNext);
  }
}