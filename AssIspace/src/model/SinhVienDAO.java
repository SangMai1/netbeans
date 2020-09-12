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
public class SinhVienDAO {
    public int add(SinhVien sv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert SinhVien1(MaSinhVien,TenSinhVien,Email,Phone,Gioitinh,DiaChi,HinhAnh) values (?,?,?,?,?,?,?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sv.getMaSinhVien());
            sttm.setString(2, sv.getHotenSinhVien());
            sttm.setString(3, sv.getEmail());
            sttm.setString(4, sv.getPhone());
            sttm.setBoolean(5, sv.isGioitinh());
            sttm.setString(6, sv.getDiachi());
            sttm.setString(7, sv.getHinhanh());
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
    public int edit(SinhVien sv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE dbo.SinhVien1 SET MaSinhVien = ?, TenSinhVien = ?, Email = ?, Phone = ?, Gioitinh = ?, DiaChi = ?, HinhAnh = ? WHERE MaSinhVien = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sv.getMaSinhVien());
            sttm.setString(2, sv.getHotenSinhVien());
            sttm.setString(3, sv.getEmail());
            sttm.setString(4, sv.getPhone());
            sttm.setBoolean(5, sv.isGioitinh());
            sttm.setString(6, sv.getDiachi());
            sttm.setString(7, sv.getHinhanh());
            sttm.setString(8, sv.getMaSinhVien());
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
    public int del(String masv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.SinhVien1 WHERE MaSinhVien = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, masv);
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
    public List<SinhVien> getAllSinhVien(){
        List<SinhVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select MaSinhVien,TenSinhVien,Email,Phone,Gioitinh,DiaChi,HinhAnh from SinhVien1";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                SinhVien sv = new SinhVien();
                sv.setMaSinhVien(rs.getString(1));
                sv.setHotenSinhVien(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setPhone(rs.getString(4));
                sv.setGioitinh(rs.getBoolean(5));
                sv.setDiachi(rs.getString(6));
                sv.setHinhanh(rs.getString(7));
                ls.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public static void main(String[] args) {
        SinhVienDAO svdao = new SinhVienDAO();
        SinhVien sv = new SinhVien("A01","Minh","rrrrrr","099999",false,"Quang Binh", "sang1");
        svdao.edit(sv);
    }
}

