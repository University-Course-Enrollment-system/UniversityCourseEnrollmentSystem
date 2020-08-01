
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
