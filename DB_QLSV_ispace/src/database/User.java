/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SANG
 */
public class User {
    public int add() throws SQLException{
        Connection conn = DatabaseUtils.getDBConnect();
        PreparedStatement sttm = null;
        String sSQL = "insert into Users(username,password,role) values('admin3','123',1)";
        try {
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            if (sttm.executeUpdate() > 0) {
                System.out.println("them thanh cong");
                return 1;
            } 
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        finally {
            sttm.close();
            conn.close();
        }
        return -1;
    }
    public int edit() throws SQLException{
        Connection conn = DatabaseUtils.getDBConnect();
        PreparedStatement sttm = null;
        String sSQL = "update Users set username='TeoNV', password = '55555', role = 0 where username = 'admin2'";
        try {
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            if (sttm.executeUpdate() > 0) {
                System.out.println("sua thanh cong");
                return 1;
            } 
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        finally {
            sttm.close();
            conn.close();
        }
        return -1;
    }
    public int del() throws SQLException{
        Connection conn = DatabaseUtils.getDBConnect();
        PreparedStatement sttm = null;
        String sSQL = "Delete from USers where username = 'TeoNV'";
        try {
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            if (sttm.executeUpdate() > 0) {
                System.out.println("xoa thanh cong");
                return 1;
            } 
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        finally {
            sttm.close();
            conn.close();
        }
        return -1;
    }
    public void getAllUser(){
        Connection conn = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from users";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            ResultSet rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                System.out.println("=>"+rs.getString(1));
                System.out.println("=>"+rs.getString(2));
                System.out.println("=>"+rs.getString(3));

            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("Error"+e.toString());
            }
        }
    }
}
