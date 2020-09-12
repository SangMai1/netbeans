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
public class StaffsDAO {
    
    public int insert(Staffs st){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO staffs(id, birthday, email, gender, name, notes, phone, photo, salary, depart_id) VALUES (?, ?, ?, ?, ?, ?, ? ,?, ?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            sttm.setString(2, DateHelper.toString(st.getBirthday()));
            sttm.setString(3, st.getEmail());
            sttm.setBoolean(4, st.isGender());
            sttm.setString(5, st.getName());
            sttm.setString(6, st.getNotes());
            sttm.setString(7, st.getPhone());
            sttm.setString(8, st.getPhoto());
            sttm.setFloat(9, st.getSalary());
            sttm.setString(10, st.getDepart_id().getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch(Exception e) {
            System.out.println("Loi 1");
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
    
    public int update(Staffs sta){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbDemo.dbo.staffs SET birthday = ?, email = ?, gender = ?, name = ?, notes = ?, phone = ?, photo = ?, salary = ?, depart_id = ? WHERE id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sta.getId());
            sttm.setString(2, DateHelper.toString(sta.getBirthday()));
            sttm.setString(3, sta.getEmail());
            sttm.setBoolean(4, sta.isGender());
            sttm.setString(5, sta.getName());
            sttm.setString(6, sta.getNotes());
            sttm.setString(7, sta.getPhone());
            sttm.setString(8, sta.getPhoto());
            sttm.setFloat(9, sta.getSalary());
            sttm.setString(10, sta.getDepart_id().getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("edit thanh cong");
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
    
    public int delete(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbDemo.dbo.staffs WHERE id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            if (sttm.executeUpdate() > 0) {
                System.out.println("Del thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error "+ e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return -1;
    }
    
    public Staffs getById(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        Staffs sta = null;
        try {
            String sSQL = "select * from staffs where id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                sta = new Staffs();
                sta.setId(rs.getString(1));
                sta.setBirthday(rs.getDate(2));
                sta.setEmail(rs.getString(3));
                sta.setGender(rs.getBoolean(4));
                sta.setName(rs.getString(5));
                sta.setNotes(rs.getString(6));
                sta.setPhone(rs.getString(7));
                sta.setPhoto(rs.getString(8));
                sta.setSalary(rs.getFloat(9));
                sta.setDepart_id(new Depart(rs.getString(10)));
                return sta;
            }
        } catch (Exception e) {
            System.out.println("loi 2");
            System.out.println("Error"+e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return sta;
    }
    
    public List<Staffs> getAll(){
        Connection conn = null;
        PreparedStatement sttm = null;
        List<Staffs> ls = new ArrayList();
        try {
            String sSQL = "select staffs.id, staffs.birthday, staffs.email, staffs.gender, staffs.name, staffs.notes, staffs.phone, staffs.photo, staffs.salary, departs.id, departs.name from staffs inner join departs on staffs.depart_id = departs.id";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                Staffs st = new Staffs();
                st.setId(rs.getString(1));
                st.setBirthday(rs.getDate(2));
                st.setEmail(rs.getString(3));
                st.setGender(rs.getBoolean(4));
                st.setName(rs.getString(5));
                st.setNotes(rs.getString(6));
                st.setPhone(rs.getString(7));
                st.setPhoto(rs.getString(8));
                st.setSalary(rs.getFloat(9));
                st.setDepart_id(new Depart(rs.getString(10), rs.getString(11)));
                ls.add(st);
            }
        } catch (Exception e) {
            System.out.println("loi 3");
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
        StaffsDAO dao = new StaffsDAO();
        System.out.println("size"+dao.getAll());
    }
}
