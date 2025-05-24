package quis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Quis {

    public static Connection con;
    
    public static Statement stm;
    
    public static void main(String args[]){
        
        try {
           
            String url = "jdbc:mysql://localhost/phpmyadmin/index.php?route=/database/structure&db=percubaan";
            
            String user = "root";
            
            String pass = "";
            
            class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url,user,pass);
            
            stm = con.createStatement();
            
            System.out.println("koneksi berhasil");
        }
        
        catch (Exception e){
            
            System.out.println("Koneksi gagal" + e.getMessage());
        }
    }
    
}
