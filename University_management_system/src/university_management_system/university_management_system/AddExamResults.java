
import java.sql.ResultSet;
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
public class AddExamResults extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddExamResults
     */
    fillCombo fc = new fillCombo();
    ResultTb rt = new ResultTb();
    ResultSet rs = null;
    public AddExamResults() {
        initComponents();
        cmb_stid.addItem(" ");
        fc.fillStrItems(cmb_stid,"SELECT * FROM `student`",1);
    }

                             


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox cmb_stid;
    private javax.swing.JComboBox cmb_subid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_asignmarks;
    private javax.swing.JLabel lbl_finalmark;
    private javax.swing.JLabel lbl_grade;
    private javax.swing.JTextField txt_exammark;
    private javax.swing.JTextField txt_presentage;
    // End of variables declaration                   
}
