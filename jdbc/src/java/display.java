
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class display {
     public static void main(String args[])throws Exception
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp","root","");
            Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from emp;");
          while(rs.next())
          {
              System.out.println(rs.getInt(1)+" " + rs.getString(2));
          }
        }
          catch(Exception e)
        {
            System.out.println(e);
        }
    
}
}
