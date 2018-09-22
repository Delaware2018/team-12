package com.jpm.codeforgood.demo;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    
    public static void main(String[] args) throws SQLException {
	SpringApplication.run(DemoApplication.class, args);
        
        SQLServer.startServer();
        SQLServer.createTables();
        
        SQLServer.populateDatabase();
        
        SQLServer.closeDatabase();
    }
}
