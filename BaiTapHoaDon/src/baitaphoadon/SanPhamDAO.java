/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphoadon;

import Databaseql.Databaseqlkh;
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
public class SanPhamDAO {
    public int add(SanPham sp){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO QuanLyKhachHang.dbo.SanPham (Ma_SanPham, Ten_SanPham, So_Luong, Don_Gia, Mo_Ta) VALUES (?, ?, ?, ?, ?)";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sp.getMasanpham());
            sttm.setString(2, sp.getTensanpham());
            sttm.setInt(3, sp.getSoluong());
            sttm.setDouble(4, sp.getDongia());
            sttm.setString(5, sp.getMota());
            if(sttm.executeUpdate() > 0){
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
    public int edt(SanPham sp){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE QuanLyKhachHang.dbo.SanPham SET  Ten_SanPham = ?, So_Luong = ?, Don_Gia = ?, Mo_Ta = ?  WHERE Ma_SanPham = ?";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sp.getTensanpham());
            sttm.setInt(2, sp.getSoluong());
            sttm.setDouble(3, sp.getDongia());
            sttm.setString(4, sp.getMota());
            sttm.setInt(5, sp.getMasanpham());
            if(sttm.executeUpdate() > 0){
                System.out.println("edit thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
    public int del(int masp){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM QuanLyKhachHang.dbo.SanPham WHERE Ma_SanPham = ?";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, masp);
            if (sttm.executeUpdate() > 0) {
                System.out.println("del thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
    public List<SanPham> getAllSanPham(){
        List<SanPham> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_SanPham, Ten_SanPham, So_Luong, Don_Gia, Mo_Ta from SanPham";
            conn = Databaseqlkh.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                SanPham sp = new SanPham();
                sp.setMasanpham(rs.getInt(1));
                sp.setTensanpham(rs.getString(2));
                sp.setSoluong(rs.getInt(3));
                sp.setDongia(rs.getDouble(4));
                sp.setMota(rs.getString(5));
                ls.add(sp);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public SanPham getAllSanPhamNyMaSanPham(int id) throws SQLException{
        SanPham sp = new SanPham();
        Connection conn = null;
        PreparedStatement sttm = null;
        
        ResultSet rs;
        try {
            String sSQL = "select Ma_SanPham, Ten_SanPham, So_Luong, Don_Gia, Mo_Ta from SanPham where Ma_SanPham = ?";
            conn = Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, id);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                sp.setMasanpham(rs.getInt(1));
                sp.setTensanpham(rs.getString(2));
                sp.setSoluong(rs.getInt(3));
                sp.setDongia(rs.getDouble(4));
                sp.setMota(rs.getString(5));
                return sp;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
}
