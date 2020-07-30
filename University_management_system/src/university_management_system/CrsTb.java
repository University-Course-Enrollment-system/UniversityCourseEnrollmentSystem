/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
    
}
