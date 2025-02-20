//package university.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://root@127.0.0.1:3306/universitymanagementsystem", "root", "1326");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}