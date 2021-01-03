package com.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private String USER;
    private String PASS;
    private String JDBC_DRIVER;
    private String DB_URL;

    public DatabaseConnection(String USER, String PASS, String JDBC_DRIVER, String DB_URL) {
        this.USER = USER;
        this.PASS = PASS;
        this.JDBC_DRIVER = JDBC_DRIVER;
        this.DB_URL = DB_URL;
    }

    public  Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public  void disconnect(Connection conn ) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createDb(Connection conn) {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String sql =  "CREATE TABLE   City " +
                    "(idCity INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " touristNumber INTEGER, " +
                    " description VARCHAR(255), " +
                    " PRIMARY KEY ( idCity ))";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch(SQLException se) {
            se.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            }
        }
    }

}
