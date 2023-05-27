package JDBC;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
public class DBdriver{
    public static void main(String[] Args) throws Exception{
        String url = "JDBC:mysql://localhost:3306/JDBC";
        String uname ="root";
        String pass ="JOEL2:28";
        String Driver = "com.mysql.cj.jdbc.Driver";
        String query = "SELECT * FROM student";
        Class.forName(Driver);
        Connection conn = DriverManager.getConnection(url,uname,pass);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
        String name = rs.getString("name");
        String rolno = rs.getString("rolno");
        System.out.println(name+" "+rolno);
        }
        st.close();
        conn.close();




    }

         }