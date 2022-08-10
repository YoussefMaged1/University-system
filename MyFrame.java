import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.ArrayList;

class MyFrame
  extends JFrame
  implements ActionListener {


  
  // Components of the Form
  private Container c;
  private JLabel title;
  private JLabel flat;
  private JTextField tflat;
  private JLabel house;
  private JTextField thouse;
  private JLabel street;
  private JTextField tstreet;
  private JLabel city;
  private JTextField tcity;
  private JLabel postal;
  private JTextField tpostal;
  private JLabel mno;
  private JTextField tmno;
  private JLabel gender;
  private JRadioButton male;
  private JRadioButton female;
  private ButtonGroup gengp;
  private JLabel dob;
  private JComboBox date;
  private JComboBox month;
  private JComboBox year;
  private JLabel add;
  private JTextArea tadd;
  private JCheckBox term;
  private JButton sub;
  private JTextArea tout;
  private JTextArea resadd;

  private String dates[]
    = { "1", "2", "3", "4", "5",
      "6", "7", "8", "9", "10",
      "11", "12", "13", "14", "15",
      "16", "17", "18", "19", "20",
      "21", "22", "23", "24", "25",
      "26", "27", "28", "29", "30",
      "31" };
  private String months[]
    = { "Jan", "feb", "Mar", "Apr",
      "May", "Jun", "July", "Aug",
      "Sup", "Oct", "Nov", "Dec" };
  private String years[]
    = { "1995", "1996", "1997", "1998",
      "1999", "2000", "2001", "2002",
      "2003", "2004", "2005", "2006",
      "2007", "2008", "2009", "2010",
      "2011", "2012", "2013", "2014",
      "2015", "2016", "2017", "2018",
      "2019" };
  private JLabel lblNewLabel;
  private JTextField txtInCaseYou;
  private JButton btnNewButton;
  private JButton btnNewButton_1;

  // constructor, to initialize the components
  // with default values.
  public MyFrame()
  {
    setTitle("Registration Form");
    setBounds(300, 90, 900, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);

    c = getContentPane();
    c.setLayout(null);

    title = new JLabel("Address information");
    title.setFont(new Font("Arial", Font.ITALIC, 24));
    title.setSize(300, 30);
    title.setLocation(300, 30);
    c.add(title);

    mno = new JLabel("Mail");
    mno.setFont(new Font("Arial", Font.PLAIN, 16));
    mno.setSize(100, 20);
    mno.setLocation(35, 99);
    c.add(mno);

    tmno = new JTextField();
    tmno.setFont(new Font("Arial", Font.PLAIN, 15));
    tmno.setSize(205, 20);
    tmno.setLocation(150, 100);
    c.add(tmno);

    gender = new JLabel("Gender");
    gender.setFont(new Font("Arial", Font.PLAIN, 16));
    gender.setSize(100, 20);
    gender.setLocation(35, 140);
    c.add(gender);

    male = new JRadioButton("Male");
    male.setFont(new Font("Arial", Font.PLAIN, 15));
    male.setSelected(true);
    male.setSize(75, 20);
    male.setLocation(150, 141);
    c.add(male);

    female = new JRadioButton("Female");
    female.setFont(new Font("Arial", Font.PLAIN, 15));
    female.setSelected(false);
    female.setSize(80, 20);
    female.setLocation(227, 141);
    c.add(female);

    gengp = new ButtonGroup();
    gengp.add(male);
    gengp.add(female);

    dob = new JLabel("Date of birth");
    dob.setFont(new Font("Arial", Font.PLAIN, 16));
    dob.setSize(114, 20);
    dob.setLocation(35, 175);
    c.add(dob);

    date = new JComboBox(dates);
    date.setBackground(Color.LIGHT_GRAY);
    date.setFont(new Font("Arial", Font.PLAIN, 15));
    date.setSize(62, 20);
    date.setLocation(150, 176);
    c.add(date);

    month = new JComboBox(months);
    month.setBackground(Color.LIGHT_GRAY);
    month.setFont(new Font("Arial", Font.PLAIN, 15));
    month.setSize(70, 20);
    month.setLocation(210, 176);
    c.add(month);

    year = new JComboBox(years);
    year.setBackground(Color.LIGHT_GRAY);
    year.setFont(new Font("Arial", Font.PLAIN, 15));
    year.setSize(75, 20);
    year.setLocation(280, 176);
    c.add(year);add = new JLabel("Address");
    add.setFont(new Font("Arial", Font.PLAIN, 16));
    add.setSize(100, 20);
    add.setLocation(35, 218);
    c.add(add);
    
    flat = new JLabel("flat number");
    flat.setFont(new Font("Arial", Font.PLAIN, 15));
    flat.setSize(80, 20);
    flat.setLocation(150, 219);
    c.add(flat);
    
    tflat = new JTextField();
    tflat.setFont(new Font("Arial", Font.PLAIN, 15));
    tflat.setSize(70, 20);
    tflat.setLocation(285, 219);
    c.add(tflat);
    
    house = new JLabel("house num");
    house.setFont(new Font("Arial", Font.PLAIN, 15));
    house.setSize(80, 20);
    house.setLocation(150, 249);
    c.add(house);
    
    thouse = new JTextField();
    thouse.setFont(new Font("Arial", Font.PLAIN, 15));
    thouse.setSize(70, 20);
    thouse.setLocation(285, 249);
    c.add(thouse);
    
    street = new JLabel("Street");
    street.setFont(new Font("Arial", Font.PLAIN, 15));
    street.setSize(80, 20);
    street.setLocation(150, 279);
    c.add(street);
    
    tstreet = new JTextField();
    tstreet.setFont(new Font("Arial", Font.PLAIN, 15));
    tstreet.setSize(70, 20);
    tstreet.setLocation(285, 279);
    c.add(tstreet);
    
    city = new JLabel("city");
    city.setFont(new Font("Arial", Font.PLAIN, 15));
    city.setSize(80, 20);
    city.setLocation(150, 309);
    c.add(city);
    
    tcity = new JTextField();
    tcity.setFont(new Font("Arial", Font.PLAIN, 15));
    tcity.setSize(70, 20);
    tcity.setLocation(285, 309);
    c.add(tcity);
    
    postal = new JLabel("postal");
    postal.setFont(new Font("Arial", Font.PLAIN, 15));
    postal.setSize(80, 20);
    postal.setLocation(150, 339);
    c.add(postal);
    
    tpostal = new JTextField();
    tpostal.setFont(new Font("Arial", Font.PLAIN, 15));
    tpostal.setSize(70, 20);
    tpostal.setLocation(285, 339);
    c.add(tpostal);


    term = new JCheckBox("Accept Terms And Conditions.");
    term.setFont(new Font("Arial", Font.PLAIN, 15));
    term.setSize(250, 20);
    term.setLocation(150, 456);
    c.add(term);

    sub = new JButton("print");
    sub.setBackground(Color.LIGHT_GRAY);
    sub.setFont(new Font("Arial", Font.PLAIN, 15));
    sub.setSize(100, 20);
    sub.setLocation(614, 513);
    sub.addActionListener(this);
    c.add(sub);

    tout = new JTextArea();
    tout.setFont(new Font("Arial", Font.PLAIN, 15));
    tout.setSize(300, 400);
    tout.setLocation(500, 100);
    tout.setLineWrap(true);
    tout.setEditable(false);
    c.add(tout);

    resadd = new JTextArea();
    resadd.setFont(new Font("Arial", Font.PLAIN, 15));
    resadd.setSize(200, 75);
    resadd.setLocation(580, 175);
    resadd.setLineWrap(true);
    c.add(resadd);
    
    lblNewLabel = new JLabel("Mailing address");
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblNewLabel.setBounds(35, 389, 133, 13);
    getContentPane().add(lblNewLabel);
    
    txtInCaseYou = new JTextField();
    txtInCaseYou.setText(" in case you lives in different address");
    txtInCaseYou.setBounds(154, 388, 201, 19);
    getContentPane().add(txtInCaseYou);
    txtInCaseYou.setColumns(10);
    
    btnNewButton = new JButton("Back");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		scene Scene = new scene();
    		Scene.setVisible(true);
    		dispose();
    	}
    });
    btnNewButton.setBackground(Color.LIGHT_GRAY);
    btnNewButton.setBounds(175, 494, 85, 21);
    getContentPane().add(btnNewButton);
    
    btnNewButton_1 = new JButton("Next");
    btnNewButton_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		Try trr = new Try();
    		trr.setVisible(true);
    		dispose();
    	}
    });
    btnNewButton_1.setBackground(Color.LIGHT_GRAY);
    btnNewButton_1.setBounds(270, 494, 85, 21);
    getContentPane().add(btnNewButton_1);
    
    JLabel lblNewLabel_1 = new JLabel("_______________________________");
    lblNewLabel_1.setBounds(310, 57, 205, 13);
    getContentPane().add(lblNewLabel_1);

    setVisible(true);
  }// method actionPerformed()
  // to get the action performed
  // by the user and act accordingly
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() == sub) {
      if (term.isSelected()) {
        String data1;
        String data =

          "Mail : "
          + tmno.getText() + "\n";
        if (male.isSelected())
          data1 = "Gender : Male"
              + "\n";
        else
          data1 = "Gender : Female"
              + "\n";
        
         int number = Integer.parseInt((String)year.getSelectedItem());
               int age = 2022 - number ;
               
               String data2
          = "DOB : "
          + (String)date.getSelectedItem()
          + "/" + (String)month.getSelectedItem()
          + "/" + (String)year.getSelectedItem()
          + "\n"+
          "age :"+age
          + "\n";
               

      String data3 = "Address :\n" +"Flat :"+ tflat.getText()+ "\n"
          +"house :"+ thouse.getText()+"\n"+"street :"+ tstreet.getText()+"\n"
              +"city :"+ tcity.getText()+"\n"+"postal :"+ tpostal.getText()+"\n" ;
        tout.setText(data + data1 + data2 + data3 );
        tout.setEditable(false);
        
      }
    }




  }



// Driver Code


  public static void main(String[] args) throws Exception
  {
    MyFrame f = new MyFrame();
  }
}