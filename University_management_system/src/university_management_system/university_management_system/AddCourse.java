
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AddCourse extends javax.swing.JFrame {

    /**
     * Creates new form AddCourse
     */
    CrsTb ct =new CrsTb();
    fillCombo fc = new fillCombo();
    public AddCourse() {
        initComponents();
        fc.fillcombo1();
    }

    

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox cmb_location;
    private javax.swing.JComboBox cmb_type;
    public static javax.swing.JComboBox combLecId;
    private javax.swing.JComboBox combo_fac;
    private javax.swing.JComboBox combo_sem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_assignment;
    private javax.swing.JTextField txt_cost;
    private javax.swing.JTextField txt_credits;
    private javax.swing.JTextField txt_crsid;
    private javax.swing.JTextField txt_crsname;
    private javax.swing.JTextField txt_duration;
    // End of variables declaration                   
}
