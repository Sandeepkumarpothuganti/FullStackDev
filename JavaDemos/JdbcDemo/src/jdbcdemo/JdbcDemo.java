/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Pre-requisites.
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pwd = "root";
//        Step1: Load driver
        Class.forName(driver);
//        Step2:Create connection
        Connection con = DriverManager.getConnection(url, user, pwd);
//        Step3:Create Statement
        Statement statement = con.createStatement();
//        Step4:Perform operations
        String query = "select * from student";
        ResultSet rs = statement.executeQuery(query);
        System.out.println("Before insertion:");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString("Sname")
                    + " " + rs.getString(3) + " " + rs.getString(4));
        }

        String insert = "INSERT INTO student VALUES (7, 'Shannu', 'St.Anns', 'hyd')";
        statement.executeUpdate(insert);

        System.out.println("After ");
        query = "select * from student";
        rs = statement.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString("Sname")
                    + " " + rs.getString(3) + " " + rs.getString(4));
        }
//        Step5:close statement and con
        statement.close();
        con.close();

    }

}
