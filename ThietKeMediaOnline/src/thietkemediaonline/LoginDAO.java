/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thietkemediaonline;

import database.DatabaseMedia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SANG
 */
public class LoginDAO {
    public LoginDAO(){
        
    }
    public boolean check(String user, String pass){
        boolean check = false;
        if (true) {
            Login lg = getUserByUser(user);
            if (lg.getUsername().equals(user) && lg.getPassword().equals(pass)) {
                return true;
            }
        }
        return check;
    }
    public int add(Login lg){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert Login(username, password) values (?,?); ";
            conn = DatabaseMedia.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, lg.getUsername());
            sttm.setString(2, lg.getPassword());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Login thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
                
            }
        }
        return -1;
    }
    public Login getUserByUser(String username){
        Login lg = new Login();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select * from Login where username = ?";
            conn = DatabaseMedia.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                lg.setUsername(rs.getString(1));
                lg.setPassword(rs.getString(2));
                return lg;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
                
            } catch (Exception e) {
            }
        }
        return null;
    }
}
