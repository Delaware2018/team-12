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
     *
     */
    public static void startServer() {
        try {
            // STEP 1: Register JDBC driver 
            Class.forName(JDBC_DRIVER);
            
            // STEP 2: Open a DS connection
            System.out.println("Connecting to database..."); 
            conn = DriverManager.getConnection(DB_URL,USER,PASS);  
            
            //STEP 3: Execute a query 
            System.out.println("Creating table in given database..."); 
            stmt = conn.createStatement();
                
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SQLServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
