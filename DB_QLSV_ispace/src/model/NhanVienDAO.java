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
            String sSQL = "INSERT INTO dbo.NhanVien (MaNV, TenNV, NgaySinh, GioiTinh, PhongBan) \n" +
"	VALUES (?, ?, ?, ?, ?)";
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
            String sSQL = "UPDATE dbo.NhanVien SET MaNV = ?, TenNV = ?, NgaySinh = ?, GioiTinh = ?, PhongBan = ? WHERE MaNV = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getMaNV());
            sttm.setString(2, nv.getTenNV());
            sttm.setString(3, formatDate.format(nv.getNgaySinh()));
            sttm.setBoolean(4, nv.isGioiTinh());
            sttm.setString(5, nv.getPhongBan());
            sttm.setString(6, nv.getMaNV());
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
    
    public int del(String id){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM dbo.NhanVien WHERE MaNV = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,id);
     
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
            String sSQL = "select MaNV,TenNV,NgaySinh,GioiTinh, PhongBan from NhanVien order by MaNV desc;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setGioiTinh(rs.getBoolean(4));
                nv.setPhongBan(rs.getString(5));
                ls.add(nv);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    
    public NhanVien getNhanVienById(String id){
        NhanVien nv = new NhanVien();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select MaNV,TenNV,NgaySinh,GioiTinh, PhongBan from NhanVien where MaNV = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                nv.setMaNV(rs.getString(1));
                nv.setTenNV(rs.getString(2));
                nv.setNgaySinh(rs.getDate(3));
                nv.setGioiTinh(rs.getBoolean(4));
                nv.setPhongBan(rs.getString(5));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
    public static void main(String[] args) throws ParseException {
        NhanVien nv = new NhanVien("P03", "cong son", formatDate.parse("11/11/2000"), false, "Nhan su");
        NhanVienDAO ndao = new NhanVienDAO();
//        ndao.add(nv);
//        ndao.edit(nv);
//    ndao.del("PD12");
//            System.out.println("size"+ndao.getAllNhanVien());
System.out.println("size"+ndao.getNhanVienById("P02"));
    }

    
}
