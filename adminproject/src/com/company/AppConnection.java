package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppConnection {
    public static Connection conn;
    public static void createConnection () throws ClassNotFoundException, SQLException {
        Class.forName ("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/app_db","admin","adminadmin");



    }


}
