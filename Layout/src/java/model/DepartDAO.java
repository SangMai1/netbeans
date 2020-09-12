/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.DatabaseUtils;
import common.DateHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class DepartDAO {
    public int insert(Depart d){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO departs(id, name) VALUES (?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, d.getId());
            sttm.setString(2, d.getName());
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            System.out.println("Error: "+ e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    public int update(Depart d){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update departs set name = ? where id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(2, d.getId());
            sttm.setString(1, d.getName());
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: "+ e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    public int delete(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete departs where id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    
    public Depart findByID(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        Depart d = null;
        try {
            String sSQL = "select * from departs where id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                d = new Depart();
                d.setId(rs.getString(1));
                d.setName(rs.getString(2));
                return d;
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return d;
    }
    
    public List<Depart> getAll(){
        Connection conn = null;
        PreparedStatement sttm = null;
        List<Depart> ls = new ArrayList();
        try {
            String sSQL = "select * from departs";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                Depart d = new Depart();
                d.setId(rs.getString(1));
                d.setName(rs.getString(2));
                ls.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        DepartDAO dao = new DepartDAO();
        System.out.println("size"+dao.getAll());
    }
}
