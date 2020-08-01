
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
public class InstructorTb {
    String insid,email,fname,lname;
    Connection con = null;
    PreparedStatement ps = null;
    public InstructorTb(){
        con = MyConnection.getconnection();
    }

    
}
