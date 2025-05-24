package quiss;

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiLogin {

     public static Connection conn = null;
    public static final String URL = "jdbc:mysql://localhost/db_Login";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    
       public static Connection getConnection() throws SQLException{
        if (conn == null || conn.isClosed()){
            try {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("connection to the database");
            } catch (SQLException e) {
                e.printStackTrace();
                throw new SQLException("connection failed");
            }
        }
         return conn;
    }
}