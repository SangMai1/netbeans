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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class KhoaHocDAO {
    public int add(KhoaHoc kh){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO Polypro.dbo.KhoaHoc (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao) VALUES (?, ?, ?, ?, ?, ?, ?)";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getChuyenDe().getMaCD());
            sttm.setFloat(2, kh.getHocPhi());
            sttm.setInt(3, kh.getThoiLuong());
            sttm.setString(4, DateHelper.toString(kh.getNgayKhaiGiang()));
            sttm.setString(5, kh.getGhiChu());
            sttm.setString(6, kh.getNguoiTao().getManhanvien());
            sttm.setString(7, DateHelper.toString(kh.getNgayTao()));
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
    public int edit(KhoaHoc kh, int p){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE Polypro.dbo.KhoaHoc SET MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, MaNV = ?, NgayTao = ? WHERE MaKH = ?";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getChuyenDe().getMaCD());
            sttm.setFloat(2, kh.getHocPhi());
            sttm.setInt(3, kh.getThoiLuong());
            sttm.setString(4, DateHelper.toString(kh.getNgayKhaiGiang()));
            sttm.setString(5, kh.getNguoiTao().getManhanvien());
            sttm.setString(6, DateHelper.toString(kh.getNgayTao()));
            sttm.setInt(7, p);
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
    public int del(int maKH){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM Polypro.dbo.KhoaHoc WHERE MaKH = ?;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, maKH);
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
    public List<KhoaHoc> getAllKhoaHoc(){
        List<KhoaHoc> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "SELECT  dbo.KhoaHoc.MaKH, dbo.KhoaHoc.MaCD, dbo.KhoaHoc.ThoiLuong, dbo.KhoaHoc.HocPhi, dbo.KhoaHoc.NgayKG, dbo.KhoaHoc.MaNV, dbo.KhoaHoc.NgayTao FROM dbo.ChuyenDe INNER JOIN dbo.KhoaHoc ON dbo.ChuyenDe.MaCD = dbo.KhoaHoc.MaCD INNER JOIN  dbo.NhanVien ON dbo.KhoaHoc.MaNV = dbo.NhanVien.MaNV";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(rs.getInt(1));
                kh.setChuyenDe(new ChuyenDe(rs.getString(2)));
                kh.setThoiLuong(rs.getInt(3));
                kh.setHocPhi(rs.getFloat(4));
                kh.setNgayKhaiGiang(rs.getDate(5));
                kh.setNguoiTao(new NhanVien(rs.getString(6)));
                kh.setNgayTao(rs.getDate(7));
                ls.add(kh);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
     public int find(int id){
         int p = -1;
        for (int i = 0; i < getAllKhoaHoc().size(); i++) {
            System.out.println("ssssssssssss"+i);
            if (getAllKhoaHoc().get(i).getMaKH() == id) {
                p = i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        KhoaHocDAO khdao = new KhoaHocDAO();
     // System.out.println("size"+khdao.getAllKhoaHoc());
//        KhoaHoc kh = new KhoaHoc(5, new ChuyenDe("JAV01"), DateHelper.toDate("2000-01-01"), 1000, 65550, new NhanVien("TeoNV"), DateHelper.toDate("2000-02-02"), "aaaaaaa");
//        khdao.edit(kh);
        System.out.println("siez"+khdao.find(4));
    }
}
