/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class NhanVienDAO {
    static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    public int add(NhanVien nv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaNV());
            sttm.setString(2, nv.getTenNV());
            sttm.setString(3, formatDate.format(nv.getNgaySinh()));
            sttm.setBoolean(4, nv.isGioiTinh());
            sttm.setString(5, nv.getPhongBan());
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
    
    public int edit(NhanVien nv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
//            sttm.setString(1, ee.getName());
//            sttm.setInt(2, ee.getAge());
//            sttm.setString(3, ee.getAddress());
//            sttm.setInt(4, ee.getId());
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
    
    public List<NhanVien> getAllNhanVien(){
        List<NhanVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select id,Fullname,age,Address from Employees order by id desc;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                NhanVien ee = new NhanVien();
//                ee.setId(rs.getInt(1));
//                ee.setName(rs.getString(2));
//                ee.setAge(rs.getInt(3));
//                ee.setAddress(rs.getString(4));
                ls.add(ee);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    
    public NhanVien getNhanVienById(int id){
        NhanVien ee = new NhanVien();
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
//                ee.setId(rs.getInt(1));
//                ee.setName(rs.getString(2));
//                ee.setAge(rs.getInt(3));
//                ee.setAddress(rs.getString(4));
                return ee;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
    public static void main(String[] args) throws ParseException {
        NhanVien nv = new NhanVien("PD12", "son", formatDate.parse("12/12/2000"), true, "Giam doc");
        NhanVienDAO ndao = new NhanVienDAO();
        ndao.add(nv);
    }

    
}
