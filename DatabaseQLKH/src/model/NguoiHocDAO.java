/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.DateHelper;
import databaseqlkh.DatabaseQLKH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.omg.CORBA.DATA_CONVERSION;

/**
 *
 * @author SANG
 */
public class NguoiHocDAO {
   
    public int add(NguoiHoc nh){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO Polypro.dbo.NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nh.getMaNH());
            sttm.setString(2, nh.getHoTen());
            sttm.setString(3, DateHelper.toString(nh.getNgaySinh()));
            sttm.setBoolean(4, nh.isGioiTinh());
            sttm.setString(5, nh.getDienThoai());
            sttm.setString(6, nh.getEmail());
            sttm.setString(7, nh.getGhiChu());
            sttm.setString(8, nh.getMaNV().getManhanvien());
            sttm.setString(9, DateHelper.toString(DateHelper.now()));
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
    public int edit(NguoiHoc nh){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE Polypro.dbo.NguoiHoc SET HoTen = ?, NgaySinh = ?, GioiTinh = ?, DienThoai = ?, Email = ?, GhiChu = ? WHERE MaNH = ?;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(7, nh.getMaNH());
            sttm.setString(1, nh.getHoTen());
            sttm.setString(2, DateHelper.toString(nh.getNgaySinh()));
            sttm.setBoolean(3, nh.isGioiTinh());
            sttm.setString(4, nh.getDienThoai());
            sttm.setString(5, nh.getEmail());
            sttm.setString(6, nh.getGhiChu());
            
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
    public int del(String maNH){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM Polypro.dbo.NguoiHoc WHERE MaNH = ?;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNH);
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
    public List<NguoiHoc> getAllNguoiHoc(){
        List<NguoiHoc> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select NguoiHoc.MaNH,NguoiHoc.HoTen,NguoiHoc.NgaySinh,NguoiHoc.GioiTinh,NguoiHoc.DienThoai,NguoiHoc.Email,NhanVien.MaNV,NguoiHoc.NgayDK from NguoiHoc inner join NhanVien on NguoiHoc.MaNV = NhanVien.MaNV;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString(1));
                nh.setHoTen(rs.getString(2));
                nh.setNgaySinh(DateHelper.toDate(rs.getString(3)));
                nh.setGioiTinh(rs.getBoolean(4));
                nh.setDienThoai(rs.getString(5));
                nh.setEmail(rs.getString(6));
                nh.setMaNV(new NhanVien(rs.getString(7)));
                nh.setNgayDK(rs.getDate(8));
                ls.add(nh);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public List<NguoiHoc> getNguoiHocByMaNH(String maNH){
        List<NguoiHoc> ls = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = " select MaNH,HoTen,NgaySinh,GioiTinh,DienThoai,Email,MaNV,NgayDK from NguoiHoc where MaNH = ?";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, maNH);
            rs = sttm.executeQuery();
            while (rs.next()) {     
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString(1));
                nh.setHoTen(rs.getString(2));
                nh.setNgaySinh(DateHelper.toDate(rs.getString(3)));
                nh.setGioiTinh(rs.getBoolean(4));
                nh.setDienThoai(rs.getString(5));
                nh.setEmail(rs.getString(6));
                nh.setMaNV(new NhanVien(rs.getString(7)));
                nh.setNgayDK(rs.getDate(8));
                ls.add(nh);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
                
            } catch (Exception e) {
            }
        }
        return ls;
    }
    
    public List<NguoiHoc> getCourse(KhoaHoc ee){
        String sql = "SELECT MaNH,HoTen FROM NguoiHoc WHERE MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        List<NguoiHoc> ls= new ArrayList<>();
        try {
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sql);
            sttm.setInt(1, ee.getMaKH());
            rs = sttm.executeQuery();
            while (rs.next()) {     
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString(1));
                nh.setHoTen(rs.getString(2));
                ls.add(nh);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
     public int find(String id){
        int p = -1;
        for (int i = 0; i < getAllNguoiHoc().size(); i++) {
            if (getAllNguoiHoc().get(i).getMaNH().contains(id)) {
                p = i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        NguoiHocDAO ndao = new NguoiHocDAO();
//        System.out.println("size"+ndao.getCourse(new KhoaHoc(1)).size());
    }
}
