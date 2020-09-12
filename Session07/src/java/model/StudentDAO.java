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
public class StudentDAO {
    
    public int insert(Student st){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO Student(id, name, bithday, MajorId) VALUES (?, ?, ?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, st.getId());
            sttm.setString(2, st.getName());
            sttm.setString(3, DateHelper.toString(st.getBirthday()));
            sttm.setInt(4, st.getMajor().getId());
            
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
    
    public int update(Student st){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE QuanLySinhVien.dbo.Student SET name = ?, bithday = ?, MajorId = ? WHERE id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(4, st.getId());
            sttm.setString(1, st.getName());
            sttm.setString(2, DateHelper.toString(st.getBirthday()));
            sttm.setInt(3, st.getMajor().getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Edit thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("sai o day");
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
            String sSQL = "delete Student where id = ?";
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
    
    public Student findByID(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        Student st = null;
        try {
            String sSQL = "select * from Student where id = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                st = new Student();
                st.setId(rs.getString(1));
                st.setName(rs.getString(2));
                st.setBirthday(rs.getDate(3));
                st.setMajor(new Major(rs.getInt(4), rs.getString(4)));
                return st;
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
        return st;
    }
    
    public List<Student> getAll(){
        Connection conn = null;
        PreparedStatement sttm = null;
        List<Student> ls = new ArrayList();
        try {
            String sSQL = "select Student.id, Student.name, Student.bithday, Major.id, Major.name from Student inner join Major on Student.MajorId = Major.id";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                Student st = new Student();
                st.setId(rs.getString(1));
                st.setName(rs.getString(2));
                st.setBirthday(rs.getDate(3));
                st.setMajor(new Major(rs.getInt(4), rs.getString(5)));
                ls.add(st);
            }
        } catch (Exception e) {
            System.out.println("Day la dau");
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
//    public static void main(String[] args) {
//        Student st = new Student();
//        StudentDAO dao = new StudentDAO();
//        System.out.println("size"+dao.getAll());
//    }
}
