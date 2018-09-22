/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm.codeforgood.demo;

/**
 *
 * @author ryankim
 */

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLServer {
    static final String JDBC_DRIVER = "org.h2.Driver";   
    static final String DB_URL = "jdbc:h2:~/test";  
   
    //  Database credentials 
    static final String USER = "sa"; 
    static final String PASS = ""; 
    
    static Connection conn = null; 
    static Statement stmt = null; 
    
    /**
     *This method creates a connection to a local server.
     */
    public static void startServer() {
        try {
            // STEP 1: Register JDBC driver 
            Class.forName(JDBC_DRIVER);
            
            // STEP 2: Open a DS connection
            System.out.println("Connecting to database..."); 
            conn = DriverManager.getConnection(DB_URL,USER,PASS);  
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SQLServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void createTables() throws SQLException {
        //STEP 3: Execute a query 
            System.out.println("Creating table in given database..."); 
            stmt = conn.createStatement();
            stmt.execute("DROP TABLE IF EXISTS USERS");
            stmt.execute("DROP TABLE IF EXISTS ITEMS");
            stmt.execute("DROP TABLE IF EXISTS  DONATE");
            
            //Create Users table
            String sql = "CREATE TABLE USERS " + 
                    "(user_id INTEGER, " + 
                    " name VARCHAR(255), " +   
                    " age INTEGER, " +  
                    " gender VARCHAR(15), "+
                    " email_address VARCHAR(255), "+
                    " phone_number INTEGER, "+
                    " zipcode INTEGER, "+
                    " user_credit INTEGER, "+
                    " PRIMARY KEY ( user_id ))"; 
            stmt.executeUpdate(sql);
            
            //Create Items table
            sql =  "CREATE TABLE ITEMS " + 
                    "(item_id INTEGER, " + 
                    " item_type VARCHAR(255), " +  
                    " item_price DECIMAL(8,2), " +  
                    " item_quantity INTEGER, " +  
                    "item_description VARCHAR(255)," +
                    "item_name VARCHAR(255)," +
                    " PRIMARY KEY ( item_id ))"; 
            stmt.executeUpdate(sql);
            
            
           //Create Donate table
            sql = "CREATE TABLE DONATE "+
            		"(donate_id INTEGER, "+
            		"donation_date DATE, "+
            		"amount_donated INTEGER, " +
            		"location INTEGER, " +
                        "user_id INTEGER," +
                        "item_id INTEGER, " +
            		"FOREIGN KEY(user_id) REFERENCES USERS(user_id), " +
            		"FOREIGN KEY(item_id) REFERENCES ITEMS(item_id))";
            stmt.executeUpdate(sql);
            
            
    }
    
    public static void populateDatabase() throws SQLException {
        
        
        //Holder variables for the input
        int intHolder = 0;
        String stringHolder = "";
        
        //Using JSON for inputting data into tables

        
        
            
    }
    
    public static void closeDatabase() throws SQLException {
        // STEP 4: Clean-up environment 
            stmt.close(); 
            conn.close(); 
            System.out.println("Goodbye!");
    }
    
    
    
    
}
