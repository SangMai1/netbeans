/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SANG
 */
public class DatabaseUtils {
    public static final String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
			"databaseName=Ontap;user=sa;password=songlong";
    public static Connection getDBConnection(){
        try {
            Connection conn = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException ex) {
            System.out.println("Where is Driver?");
            System.out.println(""+ex.toString());
        } catch (SQLException ex){
            System.out.println("error"+ex.toString());
        }
        return null;
    }
}
