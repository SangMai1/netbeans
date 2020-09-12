/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphoadon;

import Databaseql.Databaseqlkh;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SANG
 */
public class KhachHangDAO {
    public int add(KhachHang kh){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO QuanLyKhachHang.dbo.KhachHang (Ma_KhachHang, HoVaTenLot, Ten, DiaChi, Email, Phone) VALUES (?, ?, ?, ?, ?, ?);";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getMakhachhang());
            sttm.setString(2, kh.getHovatenlot());
            sttm.setString(3, kh.getTen());
            sttm.setString(4, kh.getDiachi());
            sttm.setString(5, kh.getEmail());
            sttm.setString(6, kh.getPhone());
            if(sttm.executeUpdate() > 0){
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
     public int edit(KhachHang kh){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE QuanLyKhachHang.dbo.KhachHang SET ?HoVaTenLot = ?, Ten = ?, DiaChi = ?, Email = ?, Phone = ? WHERE Ma_KhachHang = ?;";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getMakhachhang());
            sttm.setString(2, kh.getHovatenlot());
            sttm.setString(3, kh.getTen());
            sttm.setString(4, kh.getDiachi());
            sttm.setString(5, kh.getEmail());
            sttm.setString(6, kh.getPhone());
            if(sttm.executeUpdate() > 0){
                System.out.println("edt thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
     public int del(String ma){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ma);
            
            if(sttm.executeUpdate() > 0){
                System.out.println("edt thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return -1;
    }
    public List<KhachHang> getAllKhachHang(){
        List<KhachHang> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_KhachHang, HoVaTenLot, Ten, DiaChi, Email, Phone from KhachHang";
            conn = Databaseqlkh.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                KhachHang kh = new KhachHang();
                kh.setMakhachhang(rs.getString(1));
                kh.setHovatenlot(rs.getString(2));
                kh.setTen(rs.getString(3));
                kh.setDiachi(rs.getString(4));
                kh.setEmail(rs.getString(5));
                kh.setPhone(rs.getString(6));
                ls.add(kh);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public KhachHang getAllKhachHangByMaKhachHang(String mak){
        KhachHang kh = new KhachHang();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_KhachHang, HoVaTenLot, Ten, DiaChi, Email, Phone from KhachHang where Ma_KhachHang = ?";
            conn = Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, mak);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                
                kh.setMakhachhang(rs.getString(1));
                kh.setHovatenlot(rs.getString(2));
                kh.setTen(rs.getString(3));
                kh.setDiachi(rs.getString(4));
                kh.setEmail(rs.getString(5));
                kh.setPhone(rs.getString(6));
                return kh;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        KhachHangDAO dao = new KhachHangDAO();
//        System.out.println("size"+dao.getAllKhachHang());
        System.out.println("size"+dao.getAllKhachHangByMaKhachHang("A01"));
    }
}
