/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachjava3;

import common.DateHelper;
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
public class SachDAO {
    public int add(Sach s){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO QuanLySachJaVa.dbo.Sach (ma_sach, tensach, gia, ma_nxb, NgayNhap) VALUES (?, ?, ?, ?, ?)";
            conn = DatabaseQuanLySach.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, s.getMasach());
            sttm.setString(2, s.getTensach());
            sttm.setFloat(3, s.getGia());
            sttm.setInt(4, s.getMaxb().getManxb());
            sttm.setString(5, DateHelper.toString(s.getNgaynhap()));
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
    public int edit(Sach s){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE QuanLySachJaVa.dbo.Sach SET tensach = ?, gia = ?, ma_nxb = ?, NgayNhap = ? WHERE ma_sach = ?;";
            conn = DatabaseQuanLySach.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(5, s.getMasach());
            sttm.setString(1, s.getTensach());
            sttm.setFloat(2, s.getGia());
            sttm.setInt(3, s.getMaxb().getManxb());
            sttm.setString(4, DateHelper.toString(s.getNgaynhap()));
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
    public int del(int ma){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM QuanLySachJaVa.dbo.Sach WHERE ma_sach = ?;";
            conn = DatabaseQuanLySach.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, ma);
            if (sttm.executeUpdate() > 0) {
                System.out.println("edit thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
    public List<Sach> getAllSach(){
        List<Sach> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select ma_sach, tensach,gia, ma_nxb, NgayNhap from Sach;";
            conn = DatabaseQuanLySach.DatabaseQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                Sach s = new Sach();
                s.setMasach(rs.getInt(1));
                s.setTensach(rs.getString(2));
                s.setGia(rs.getFloat(3));
                s.setMaxb(new NhaXuatBan(rs.getInt(4),rs.getString(4)));
                s.setNgaynhap(rs.getDate(5));
                ls.add(s);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
}
