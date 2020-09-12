/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphoadon;

import Databaseql.Databaseqlkh;
import common.DateHelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class HoaDonDAO {
    public int add(HoaDon hd){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO QuanLyKhachHang.dbo.HoaDon (Ma_HoaDon, Ngay_Mua_Hang, Ma_KhachHang, Trang_Thai) VALUES (?, ?, ?, ?)";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, hd.getMahoadon());
            sttm.setString(2, DateHelper.toString(hd.getNgaymuahang()));
            sttm.setString(3, hd.getMaKhachHang().getMakhachhang());
            sttm.setString(4, hd.getTrangthai());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
    public int edit(HoaDon hd){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE QuanLyKhachHang.dbo.HoaDon SET Ngay_Mua_Hang = ?, Ma_KhachHang = ?, Trang_Thai = ? WHERE Ma_HoaDon = ?;";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, hd.getMahoadon());
            sttm.setString(2, DateHelper.toString(hd.getNgaymuahang()));
            sttm.setString(3, hd.getMaKhachHang().getMakhachhang());
            sttm.setString(4, hd.getTrangthai());
            
            if (sttm.executeUpdate() > 0) {
                System.out.println("edit thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
    public int del(int ma){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM QuanLyKhachHang.dbo.HoaDon WHERE Ma_HoaDon = ?;";
            conn = Databaseql.Databaseqlkh.getDBConnect();
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
    public List<HoaDon> getAllHoaDon(){
        List<HoaDon> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_HoaDon, Ngay_Mua_Hang, Ma_KhachHang, Trang_Thai from HoaDon";
            conn = Databaseqlkh.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                HoaDon hd = new HoaDon();
                hd.setMahoadon(rs.getInt(1));
                hd.setNgaymuahang(rs.getDate(2));
                hd.setMaKhachHang(new KhachHang(rs.getString(3)));
                hd.setTrangthai(rs.getString(4));
                ls.add(hd);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public static void main(String[] args) {
        HoaDonDAO dao = new HoaDonDAO();
        System.out.println("size"+dao.getAllHoaDon());
    }
}
