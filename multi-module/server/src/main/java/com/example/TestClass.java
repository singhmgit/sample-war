package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is a class.
 */
public class TestClass {

  static {
    String host = System.getenv("HOSTNAME");
    String user = System.getenv("USER");
    String password = System.getenv("PASSWORD");
    String schema = System.getenv("SCHEMA");

    Connection conn = null;
    try {
        conn =
           DriverManager.getConnection("jdbc:mysql://"+host+"/"+schema+"?" +
                                       "user="+user+"&password="+password);
    
    } catch (SQLException ex) {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
        System.exit(0);
    }    
  }
}
