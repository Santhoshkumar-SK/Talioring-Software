/*
 * Myconnection.java
 *
 * Created on March 20, 2007, 9:35 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Administrator
 */
public class Myconnection {
    
    /** Creates a new instance of Myconnection */
    public Myconnection() {
    }
    public static java.sql.Connection myconn()
    {   java.sql.Connection Con = null;
        try {
  
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
             String path="E:\\Tailor_Project_Final\\TailorDB.accdb";
             String url="jdbc:ucanaccess://"+path;
             Con = DriverManager.getConnection(url);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
       
       
        return Con;
    }
}
