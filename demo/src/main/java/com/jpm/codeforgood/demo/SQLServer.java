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

public class SQLServer {
    static final String JDBC_DRIVER = "org.h2.Driver";   
    static final String DB_URL = "jdbc:h2:~/test";  
   
    //  Database credentials 
    static final String USER = "sa"; 
    static final String PASS = ""; 
    
    Connection conn = null; 
    Statement stmt = null; 
    
}
