
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LecturerTb {
    String lecid,email,fname,lname;
    Connection con = null;
    PreparedStatement ps = null;
    public LecturerTb(){
        con = MyConnection.getconnection();
    }
    public void fillLecTable(JTable table,String searchVal){
        try {
            ps = con.prepareStatement("SELECT `empid`, `fname`, `lname`, `email` FROM `lecture` WHERE CONCAT(  `fname` ,  `lname` ,  `email` ) LIKE ?");
            ps.setString(1, "%"+searchVal+"%");
  
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] row;
            while(rs.next()){
            row = new Object[4];
            row[0] = rs.getString(1);
            row[1] = rs.getString(2);
            row[2] = rs.getString(3);
            row[3] = rs.getString(4);
            
            model.addRow(row);
            }
        } catch (SQLException ex) {
            //Logger.getLogger(StudentTb.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
            
         
    }

    
}
