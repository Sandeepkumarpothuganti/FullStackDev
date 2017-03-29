package com.ipivot.java.jdbc.con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbccon {

	    //static reference to itself
	    private static Jdbccon instance = new Jdbccon();
	    public static final String URL = "jdbc:postgresql://127.0.0.1:5432/traveldb";
	    public static final String USER = "postgres";
	    public static final String PASSWORD = "flower123";
	    public static final String DRIVER_CLASS = "org.postgresql.Driver"; 
	     
	    //private constructor
	    private Jdbccon() {
	        try {
	            //Step 2: Load MySQL Java driver
	        	
	            Class.forName(DRIVER_CLASS);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	     
	    private Connection createConnection() {
	 
	        Connection connection = null;
	        try {
	            //Step 3: Establish Java MySQL connection
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (SQLException e) {
	            System.out.println("ERROR: Unable to Connect to Database.");
	        }
	        return connection;
	    }   
	     
	    public static Connection getConnection() {
	        return instance.createConnection();
	    }
	}

