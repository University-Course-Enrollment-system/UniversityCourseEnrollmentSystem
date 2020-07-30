/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author O V A S Manjitha
 */
public class MyConnection {
    
    public static Connection getconnection(){
      Connection con = null;
      try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/crsdb","root","");
      System.out.print("Connected......................");
      }
      catch(Exception ex){
          System.out.println(ex.getMessage());
      }
        return con;
    }
    
}
