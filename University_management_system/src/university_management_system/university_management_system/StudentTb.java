import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class StudentTb {
    Connection con = null;
    PreparedStatement ps;
     String stid;
     String fname;
     String lname;
     String semid;
     String facname;
    public StudentTb(){
        con = MyConnection.getconnection();
    } 
}