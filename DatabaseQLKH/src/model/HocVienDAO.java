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
public class HocVienDAO {
    public int add(HocVien hv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO Polypro.dbo.HocVien (MaKH, MaNH, Diem) VALUES (?, ?, ?)";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, hv.getMaKH().getMaKH());
            sttm.setString(2, hv.getNguoihoc().getMaNH());
            sttm.setDouble(3, hv.getDiem());
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
    public int del(int mahv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM Polypro.dbo.HocVien WHERE MaHV = ?;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, mahv);
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
    public int edit(int maHocVien , double diem){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE Polypro.dbo.HocVien SET Diem = ? WHERE MaHV = ?;";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setDouble(1, diem);
            sttm.setInt(2, maHocVien);
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
    public List<HocVien> getAllHocVien(){
        List<HocVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select HocVien.MaHV, HocVien.MaNH, NguoiHoc.HoTen, HocVien.Diem from HocVien inner join NguoiHoc on HocVien.MaNH = NguoiHoc.MaNH";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt(1));
                hv.setNguoihoc(new NguoiHoc(rs.getString(2), rs.getString(3)));
                hv.setDiem(rs.getDouble(4));
                ls.add(hv);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public List<HocVien> getAllHocVienByMaKhoaHoc(int ma){
        List<HocVien> ls = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select HocVien.MaHV, HocVien.MaNH, NguoiHoc.HoTen, HocVien.Diem from HocVien inner join NguoiHoc on HocVien.MaNH = NguoiHoc.MaNH where MaKH = ? ";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, ma);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt(1));
                hv.setNguoihoc(new NguoiHoc(rs.getString(2), rs.getString(3)));
                hv.setDiem(rs.getDouble(4));
                ls.add(hv);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public int find(int id){
        int p = -1;
        for (int i = 0; i < getAllHocVien().size(); i++) {
            if (getAllHocVien().get(i).getMaHV() == id) {
                p = i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        HocVienDAO dao = new HocVienDAO();
//        HocVien hv = new HocVien(150, "A01", 9);
//        dao.edit(hv);
//        System.out.println("size"+dao.getAllHocVien(1).size());
        System.out.println("size"+dao.getAllHocVien());
//        System.out.println("size"+dao.getAllHocVienById(1));
    }
}
