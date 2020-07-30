/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author O V A S Manjitha
 */
public class CrsTb {
    
    String facname,semid,crsId,crsName,lecId,location,type;
    int credits,numAssign,duration,cost;
    Connection con = null;
    PreparedStatement ps = null;
    public CrsTb(){
    con = MyConnection.getconnection();
    }
    public void fillCrsTable(JTable table,String searchval){
        try {
           ps = con.prepareStatement("SELECT `subid`, `subname`, `faculty`, `credits`, `numassign`, `cost`, `semid`, `lecid`, `duration`, `location` FROM subjects WHERE CONCAT(  `subid` ,  `subname` ,  `faculty` ) LIKE ?");
           ps.setString(1, "%"+searchval+"%");
           ResultSet rs = ps.executeQuery();
           DefaultTableModel model = (DefaultTableModel)table.getModel();
           Object[] row;
           while(rs.next()){
           row = new Object[10];
           row[0] = rs.getString(3);
           row[1] = rs.getString(7);
           row[2] = rs.getString(1);
           row[3] = rs.getString(2);
           row[4] = rs.getInt(4);
           row[5] = rs.getInt(5);
           row[6] = rs.getInt(6);
           row[7] = rs.getString(8);
           row[8] = rs.getInt(9);
           row[9] = rs.getString(10);
           model.addRow(row);
           }
       } catch (SQLException ex) {
           //Logger.getLogger(StudentTb.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
   }

}
