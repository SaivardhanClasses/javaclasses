package JDBC;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        String sql="select * from student_m  ";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe ","System","manager");
            System.out.println("Connection established.........");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            rs.getString(0);
            con.close();
            System.out.println("executed");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
