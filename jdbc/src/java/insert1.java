import java.sql.*;
import java.util.*;
public class insert1 {
     public static void main(String args[])throws Exception
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp","root","");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter no.of records");
            int n=sc.nextInt();
            PreparedStatement ps=con.prepareStatement("insert into emp values(?,?)");
            for(int i=0;i<=n;i++)
            {
                System.out.println("enter eid,ename");
                int id=sc.nextInt();
                String name=sc.next();
                ps.setInt(1,id);
                ps.setString(2, name);
                ps.executeUpdate();
            }
            con.close();
        }
    
catch(Exception e)
        {
            System.out.println(e);
        }
}
}