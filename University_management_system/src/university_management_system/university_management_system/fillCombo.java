
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

 
public class fillCombo {
   Connection con = null;
   PreparedStatement ps = null;
   ResultSet rs = null;
   
   public fillCombo(){
   con = MyConnection.getconnection();
   }
   
}
