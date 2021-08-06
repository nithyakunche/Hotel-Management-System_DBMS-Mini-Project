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
public class tables {
    public static void main(String args[]){
        Connection con=null;
        Statement st=null;
        try
        {
            con=connectionprovider.getCon();
            st=con.createStatement();
            //st.executeUpdate("create table employeeinfo(eid int not null AUTO_INCREMENT,name varchar(200),emailid varchar(200),password varchar(50),securityquestion varchar(500),answer varchar(200),gender varchar(50),age int(2),phonenumber varchar(200),address varchar(200),status varchar(20),primary key(eid)) ENGINE=InnoDB AUTO_INCREMENT=1000");
            //st.executeUpdate("create table room(roomno varchar(10),roomtype varchar(200),bed varchar(200),price int,status varchar(20))");
            st.executeUpdate("create table customers(cid int,name varchar(200),age int(2),gender varchar(100),mobilenumber varchar(200),aadhar varchar(300),nationality varchar(200),emailid varchar(100),address varchar(500),checkin varchar(100),roomno varchar(50),bed varchar(200),roomtype varchar(100),priceperday int(10),noofdaysstay int(10),totalamount varchar(300),checkout varchar(100),primary key(cid))");
            //st.executeUpdate("create table customer(cid int not null AUTO_INCREMENT,name varchar(200),age int(2),gender varchar(50),mobilenumber varchar(200),aadhar varchar(200),nationality varchar(200),emailid varchar(100),address varchar(200),checkin varchar(50),roomno varchar(10),bed varchar(200),roomtype varchar(100),priceperday int(10),noofdaysstay int(10),totalamount varchar(200),checkout varchar(50),primary key(cid)) ENGINE=InnoDB AUTO_INCREMENT=00000001");
            JOptionPane.showMessageDialog(null,"Tables Inserted Successfully");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
            try{
                con.close();
                st.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
    
}
