
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AddAssignResult extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddAssignResult
     */
    Connection con = null;
    PreparedStatement ps = null;
    fillCombo fc = new fillCombo();
    ResultTb rt = new ResultTb();
    ResultSet rs = null;
    public AddAssignResult() {
        
        initComponents();
        cmb_stid.addItem(" ");
        fc.fillStrItems(cmb_stid,"SELECT * FROM `student`",1);
        //cmb_stid.addItem(" ");
        
        
        con = MyConnection.getconnection();
        
    }

                 


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox cmb_stid;
    private javax.swing.JComboBox cmb_subid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_avgmark;
    private javax.swing.JTextField txt_numasign;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   
}
