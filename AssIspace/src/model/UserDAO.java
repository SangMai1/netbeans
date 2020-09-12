/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class UserDAO {
    List<User> ls = new ArrayList<>();
    public UserDAO(){
        

    }
    public boolean checkLogin(String username, String pass){
        boolean check = false;
//        for (int i = 0; i < ls.size(); i++) {
//            User u = ls.get(i);
//            if (u.getUsername().equals(username) && u.getPassword().equals(pass)) {
//                check = true;
//                break;
//            }
//        }
        User user = getUserById(username);
        if (user != null) {
            if (user.getPassword().equals(pass)) {
                return true;
            }
        }
        return check;
    }
    public int add(User us){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert Users(username, password, role) values (?, ?, ?);";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, us.getUsername());
            sttm.setString(2, us.getPassword());
            sttm.setBoolean(3, us.isRole());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
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
    public int edit(User us){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update Users set username = ?, password = ?, role = ? where username = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, us.getUsername());
            sttm.setString(2, us.getPassword());
            sttm.setBoolean(3, us.isRole());
            sttm.setString(4, us.getUsername());
            if (sttm.executeUpdate() > 0) {
                System.out.println("edit thanh cong");
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
    public int del(String username){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete from Users where username = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            if (sttm.executeUpdate() > 0) {
                System.out.println("del thanh cong");
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
    public List<User> getAll(){
        List<User> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select username, password, role from Users;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                User us = new User();
                us.setUsername(rs.getString(1));
                us.setPassword(rs.getString(2));
                us.setRole(rs.getBoolean(3));
                
                ls.add(us);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public User getUserById(String username){
        User nv = new User();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select * from users where username = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                nv.setUsername(rs.getString(1));
                nv.setPassword(rs.getString(2));
                nv.setRole(rs.getBoolean(3));
                
                return nv;
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
    public static void main(String[] args) {
        UserDAO udao = new UserDAO();
        User u = new User("hoa", "123456", false);
//        udao.add(u);
//        System.out.println("size"+udao.getUserById("admin3"));
    }
}
