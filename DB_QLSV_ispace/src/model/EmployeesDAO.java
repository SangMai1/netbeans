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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class EmployeesDAO {
    public int add(Employees ee){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert Employees(Fullname, age, Address) values(?,? ,?);";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ee.getName());
            sttm.setInt(2, ee.getAge());
            sttm.setString(3, ee.getAddress());
            if (sttm.executeUpdate() > 0) {
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
    public int edit(Employees ee){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update Employees set Fullname = ? , age = ?, Address = ? where id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ee.getName());
            sttm.setInt(2, ee.getAge());
            sttm.setString(3, ee.getAddress());
            sttm.setInt(4, ee.getId());
            if (sttm.executeUpdate() > 0) {
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
    public int del(int id){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete from Employees where id = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1,id);
     
            if (sttm.executeUpdate() > 0) {
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
    public List<Employees> getAll(){
        List<Employees> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select id,Fullname,age,Address from Employees order by id desc;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                Employees ee = new Employees();
                ee.setId(rs.getInt(1));
                ee.setName(rs.getString(2));
                ee.setAge(rs.getInt(3));
                ee.setAddress(rs.getString(4));
                ls.add(ee);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public Employees getEmployeeById(int id){
        Employees ee = new Employees();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select id,Fullname,age,Address from Employees where id= ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, id);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                ee.setId(rs.getInt(1));
                ee.setName(rs.getString(2));
                ee.setAge(rs.getInt(3));
                ee.setAddress(rs.getString(4));
                return ee;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
   
    public static void main(String[] args) {
        EmployeesDAO dao = new EmployeesDAO();
//        System.out.println("size"+dao.getAll());
        Employees ee = new Employees(5, "Ngọc Hoa",33, "Hoi An");
//        dao.add(ee);
        dao.edit(ee);
//        dao.del(ee);
//          System.out.println("size"+dao.getEmployeeById(3));
    }
    
}
