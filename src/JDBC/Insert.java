package JDBC;

import java.sql.*;

public class Insert {
    public static void main(String[] Args) throws Exception {
        String driver ="com.mysql.cj.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/JDBC";
        //String url = "JDBC:mysql://localhost:3306/JDBC";
        String name= "N";
        String rolno ="3";

        Class.forName(driver);
        String uname ="root";
        String pass = "JOEL2:28";
        Connection conn = DriverManager.getConnection(url,uname,pass);
        String query="INSERT INTO student VALUES (?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1,name);
        ps.setString(2,rolno);
        int count = ps.executeUpdate();
        System.out.println("rows affected: "+count);
        ps.close();
        conn.close();
    }
}
