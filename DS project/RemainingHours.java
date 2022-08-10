import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class RemainingHours extends javax.swing.JFrame {

        int Max;
        int Finished;
        int Current;
        String Remaining;
    public RemainingHours() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MaxHourstxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        currenttxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Finishedtxt = new javax.swing.JTextField();
        calcbtn = new javax.swing.JButton();
        screen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Max Hours For Degree: ");

        MaxHourstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxHourstxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Current Hours:");

        currenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currenttxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Finished Hours:");

        Finishedtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishedtxtActionPerformed(evt);
            }
        });

        calcbtn.setFont(new Font("Tahoma", Font.PLAIN, 14)); // NOI18N
        calcbtn.setText("Calculate");
        calcbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calcbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbtnActionPerformed(evt);
            }
        });

        screen.setBackground(new java.awt.Color(102, 255, 102));
        screen.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Remaining Hours:");
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Students students = new Students();
        		students.setVisible(true);
        		dispose();
        	}
        });
        
        JButton btnNewButton_1 = new JButton("Next");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		GPA gpa = new GPA();
        		gpa.setVisible(true);
        		dispose();
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel3)
        								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(screen, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
        								.addComponent(Finishedtxt, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(MaxHourstxt, Alignment.LEADING)
        									.addComponent(currenttxt, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(119)
        					.addComponent(calcbtn, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(74)
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)
        					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(484, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(26)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        						.addComponent(MaxHourstxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(73)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        						.addComponent(currenttxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        				.addComponent(Finishedtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(screen, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGap(50)
        			.addComponent(calcbtn, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNewButton_1)
        				.addComponent(btnNewButton))
        			.addGap(55))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void MaxHourstxtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void currenttxtActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void FinishedtxtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void calcbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
               Max = Integer.parseInt(MaxHourstxt.getText()); 
       Finished = Integer.parseInt(Finishedtxt.getText()); 
       Current= Integer.parseInt(currenttxt.getText()); 
       Remaining=Integer.toString(Max - Finished - Current);
    
        screen.setText(Remaining); 
    
    }                                       


    public static void main(String args[]) {
               try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RemainingHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemainingHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemainingHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemainingHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemainingHours().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField Finishedtxt;
    private javax.swing.JTextField MaxHourstxt;
    private javax.swing.JButton calcbtn;
    private javax.swing.JTextField currenttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel screen;
}