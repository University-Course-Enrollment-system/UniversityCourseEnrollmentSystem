
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 *
 * @author USER
 */
public class AddPractical extends javax.swing.JFrame {

    /**
     * Creates new form AddPractical
     */
    PracticalTb pt = new PracticalTb();
    fillCombo fc = new fillCombo();
    public AddPractical() {
        initComponents();
        fc.fillStrItems(comb_sid,"SELECT * FROM `subjects` WHERE `credits`>2",1);
        fc.fillStrItems(comb_labid,"SELECT * FROM `labs`",1);
        fc.fillStrItems(comb_insid,"SELECT * FROM `instructor`",1);
    }

    

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox comb_insid;
    private javax.swing.JComboBox comb_labid;
    private javax.swing.JComboBox comb_sid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   
}
