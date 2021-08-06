/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MYPC
 */
public class select {
    public static ResultSet getData(String query)
    {
        ResultSet rs=null;

        try
        {
          Connection con=connectionprovider.getCon();
          Statement st=con.createStatement();
          rs=st.executeQuery(query);
          return rs;
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e); 
          return  null;
        }
    }
}
