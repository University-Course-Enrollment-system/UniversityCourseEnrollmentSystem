
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class LoginInstructor extends javax.swing.JFrame {

    /**
     * Creates new form LoginInstructor
     */
    Connection con = null;
    PreparedStatement ps = null;
    public LoginInstructor() {
        initComponents();
        lblU.setVisible(false);
        lblP.setVisible(false);
        con = MyConnection.getconnection();
        
    }


     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfield1 = new javax.swing.JTextField();
        pfield1 = new javax.swing.JPasswordField();
        cancelbtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        signbtn = new javax.swing.JButton();
        lblU = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Instructor Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText(" Password:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Username:");

        cancelbtn.setBackground(new java.awt.Color(204, 0, 0));
        cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/erase-128.png"))); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        loginbtn.setBackground(new java.awt.Color(255, 0, 51));
        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        loginbtn.setText("LogIn");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        signbtn.setBackground(new java.awt.Color(0, 153, 153));
        signbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signbtn.setText("Sign Up");
        signbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signbtnActionPerformed(evt);
            }
        });

        lblU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblU.setForeground(new java.awt.Color(204, 0, 0));
        lblU.setText("*");

        lblP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblP.setForeground(new java.awt.Color(204, 0, 0));
        lblP.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelbtn)
                                .addGap(18, 18, 18)
                                .addComponent(loginbtn)
                                .addGap(18, 18, 18)
                                .addComponent(signbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(pfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfield1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblP)
                                    .addComponent(lblU)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(318, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblU))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn)
                    .addComponent(loginbtn)
                    .addComponent(signbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(jLabel3)
                    .addContainerGap(167, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(429, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>                        


  private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //Startpg st = new Startpg();
        //st.setVisible(true);
        //st.pack();
        //st.setLocationRelativeTo(null);
        this.dispose();
    }

     private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        lblU.setVisible(false);
        lblP.setVisible(false);
        if(tfield1.getText().equals("")){
            lblU.setVisible(true);
        }
        if(String.valueOf(pfield1.getPassword()).equals("")){
            lblP.setVisible(true);
        }
        else{

            try {
                ps = con.prepareStatement("SELECT * FROM `instructor` WHERE insid =? AND passwd =?");
                ps.setString(1, tfield1.getText());
                ps.setString(2, String.valueOf(pfield1.getPassword()));
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    InstructorMain lm = new InstructorMain();
                    lm.setVisible(true);
                    lm.pack();
                    
                    lm.setLocationRelativeTo(null);
                    lm.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    //lm.lecname.setText("WELCOME <"+tfield1.getText()+">");
                    String lecid=rs.getString(1);
                    String fname=rs.getString(2);
                    String lname=rs.getString(3);
                     
                    InstructorMain.test.setText("USER :"+fname + " " + lname);
                    InstructorMain.lbl_insid.setText(lecid);
                    
                    this.dispose();}
                else{
                    JOptionPane.showMessageDialog(null,"Username or Password is incorrect");
                    //System.out.print("NO");
                }
            } catch (SQLException ex) {
                //Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null,ex.getMessage());
            }

        }
    } 

      private void signbtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        SignupUser su = new SignupUser();
        su.setVisible(true);
        //st.pack();
        //st.setLocationRelativeTo(null);
        this.dispose();
    } 

    // Variables declaration - do not modify                     
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblU;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pfield1;
    private javax.swing.JButton signbtn;
    private javax.swing.JTextField tfield1;
    // End of variables declaration                   
}
