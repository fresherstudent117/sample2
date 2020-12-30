    import java.sql.*;
import java.util.*;
public class insert {
    public static void main(String args[])throws Exception
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp","root","");
          Statement st=con.createStatement();
            st.executeUpdate("create table emp(eid int,ename varchar(20))");
}catch(Exception e)
        {
            System.out.println(e);
        }
}
}
