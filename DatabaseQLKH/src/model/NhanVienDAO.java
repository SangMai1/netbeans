/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import databaseqlkh.DatabaseQLKH;
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
public class NhanVienDAO {
    public int add(NhanVien nv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO Polypro.dbo.NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nv.getManhanvien());
            sttm.setString(2, nv.getMatkhau());
            sttm.setString(3, nv.getHoten());
            sttm.setBoolean(4, nv.isVaitro());
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
            String sSQL = "UPDATE Polypro.dbo.NhanVien SET MatKhau = ?, HoTen = ?, VaiTro = ? WHERE MaNV = ?;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            
            sttm.setString(1, nv.getMatkhau());
            sttm.setString(2, nv.getHoten());
            sttm.setBoolean(3, nv.isVaitro());
            sttm.setString(4, nv.getManhanvien());
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
    public int del(String manv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM Polypro.dbo.NhanVien WHERE MaNV = ?;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, manv);
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
    public List<NhanVien> getAllSinhVien(){
        List<NhanVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select MaNV, MatKhau, HoTen, VaiTro from NhanVien";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                NhanVien nv = new NhanVien();
                nv.setManhanvien(rs.getString(1));
                nv.setMatkhau(rs.getString(2));
                nv.setHoten(rs.getString(3));
                nv.setVaitro(rs.getBoolean(4));
                ls.add(nv);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public NhanVien getByMaNhanVien(String maNV){
        NhanVien nv = new NhanVien();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select MaNV, MatKhau, HoTen, VaiTro from NhanVien where MaNV = ?";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNV);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                nv.setManhanvien(rs.getString(1));
                nv.setMatkhau(rs.getString(2));
                nv.setHoten(rs.getString(3));
                nv.setVaitro(rs.getBoolean(4));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        NhanVienDAO nvdao = new NhanVienDAO();
        NhanVien nv = new NhanVien("A01", "123", "Van Sang", false);
        nvdao.edit(nv);
//System.out.println("size"+nvdao.getAllSinhVien().size());
    }
}
