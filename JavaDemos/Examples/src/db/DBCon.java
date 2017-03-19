/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBCon {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pwd = "root";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, pwd);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student");
        while (rs.next()) {
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
        }
        stmt.close();
        con.close();
    }
}
