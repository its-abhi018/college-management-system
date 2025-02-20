////package university.management.system;
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect{
        Connection c;
        Statement stmt;
         public Connect(){
                 try{
                         Class.forName("com.mysql.cj.jdbc.Driver");
                         c = DriverManager.getConnection("jdbc:mysql://root@127.0.0.1:3306/universitymanagementsystem", "root", "1326");
                         stmt = c.createStatement();
                 }
                 catch(Exception e){
                         e.printStackTrace();
                 }
         }
        public static void main(String[] args) {
                 new Connect();
        }
}



