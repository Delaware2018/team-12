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
                    " phone_number VARCHAR(20), "+
                    " zipcode INTEGER,"+
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
        //Hard coding database for now
        int counter = 0;
        System.out.println("Populating the database...."); 
        stmt = conn.createStatement();
        
        String sql = "INSERT INTO USERS " + "VALUES (" + counter + ",'Ryan Kim', 21, 'male', 'ryankim360@gmail.com', '2677463689', 19044, 0)"; 
        stmt.executeUpdate(sql);
        counter++;
        
        sql = "INSERT INTO ITEMS " + "VALUES (" + counter + ",'furniture', 12.99, 1, 'A red loveseat with leather cushions', 'couch')";
        stmt.executeUpdate(sql);
        
        //Testing (printing database values)
        ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
            while(rs.next()) { 
            // Retrieve by column name 
                int id  = rs.getInt("user_id"); 
                String name = rs.getString("name"); 
                int age = rs.getInt("age"); 
                String gender = rs.getString("gender"); 
                String email_address = rs.getString("email_address");
                String phone_number = rs.getString("phone_number");
                int zipcode = rs.getInt("zipcode");
                int user_credit = rs.getInt("user_credit");
            
                // Display values 
                System.out.print("user_id: " + id); 
                System.out.print(", name: " + name); 
                System.out.print(", age: " + age); 
                System.out.print(", gender: " + gender);
                System.out.print(", email_address: " + email_address); 
                System.out.print(", phone_number: " + phone_number); 
                System.out.print(", zipcode: " + zipcode); 
                System.out.println(", user_credit: " + user_credit); 
            }
            
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM ITEMS");
            while(rs1.next()) { 
            // Retrieve by column name 
                int id  = rs1.getInt("item_id"); 
                String item_type = rs1.getString("item_type"); 
                float item_price = rs1.getFloat("item_price"); 
                int item_quantity = rs1.getInt("item_quantity"); 
                String item_description = rs1.getString("item_description");
                String item_name = rs1.getString("item_name");
            
                // Display values 
                System.out.print("item_id: " + id); 
                System.out.print(", item_type: " + item_type); 
                System.out.print(", item_price: " + item_price); 
                System.out.print(", item_quantity: " + item_quantity);
                System.out.print(", item_description: " + item_description);  
                System.out.println(", item_name: " + item_name);  
            }
            
            System.out.println("Done populating the database...");
    }
    
    public static void closeDatabase() throws SQLException {
        // STEP 4: Clean-up environment 
            stmt.close(); 
            conn.close(); 
            System.out.println("Goodbye!");
    }
    
    
    
    
}
