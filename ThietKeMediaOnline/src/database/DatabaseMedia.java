/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author SANG
 */
public class DatabaseMedia {
    public static final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
			"databaseName=DBMedia;user=sa;password=123456";
    public static Connection getDBConnect(){
        try {
            Connection con = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Where is Driver?");
            System.out.println(""+ex.toString());
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
        
    }
}
