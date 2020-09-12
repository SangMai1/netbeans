/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasehinhanh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SANG
 */
public class Databasehinhanh {
    public static final String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=DBQLSV;user=sa;password=123456";
    public static Connection getDBConnect(){
        try {
            Connection con = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Where is driver");
            System.out.println(""+ex.toString());
        } catch (SQLException ex) {
            System.err.println("Error"+ex.toString());
        }
        return null;
    }
    
}
