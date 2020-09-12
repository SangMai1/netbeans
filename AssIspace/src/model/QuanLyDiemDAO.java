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
public class QuanLyDiemDAO {
//    List<QuanLyDiem> lsDiem = new ArrayList<>();
    public int add(QuanLyDiem d){
//        lsDiem.add(d);
//        return 1;
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO dbo.DiemSV (masv, tinhoc, anhvan, gdtc) VALUES (?, ?, ?, ?)";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, d.getSv().getMaSinhVien());
            sttm.setFloat(2, d.getDiemTin());
            sttm.setFloat(3, d.getDiemAnhVan());
            sttm.setFloat(4, d.getDiemGDTC());
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
//    public int count(){
//        return lsDiem.size();
//    }
//    public List<QuanLyDiem> getQuanLyDiem(){
//        return lsDiem;
//    }
//    public QuanLyDiem find(String id){
//        for (QuanLyDiem ql : lsDiem) {
//            if (ql.getSv().getMaSinhVien().equalsIgnoreCase(id)) {
//                return ql;
//            }
//        }
//        return null;
//    }
//    public int del(String id){
//        QuanLyDiem ql = find(id);
//        if (ql != null) {
//            lsDiem.remove(ql);
//            return 1;
//        }
//        return -1;
//    }
//    public QuanLyDiem getAtPointDiem(int position){
//       return lsDiem.get(position);
//    }
    
    public int edit(QuanLyDiem d){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update DiemSV set tinhoc = ?, anhvan = ?, gdtc = ? where masv = ?";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(4, d.getSv().getMaSinhVien());
            sttm.setFloat(1, d.getDiemTin());
            sttm.setFloat(2, d.getDiemAnhVan());
            sttm.setFloat(3, d.getDiemGDTC());

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
//    public QuanLyDiem getDiem(int id){
//        return lsDiem.get(id);
//    }
    public int del(String masv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete from DiemSV where masv = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, masv);
            if (sttm.executeUpdate() > 0) {
                System.out.println("xoa thanh cong");
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
   public List<QuanLyDiem> getAll(){
        List<QuanLyDiem> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select DiemSV.masv, SinhVien1.TenSinhVien, DiemSV.tinhoc, DiemSV.anhvan, DiemSV.gdtc from SinhVien1 inner join DiemSV on SinhVien1.MaSinhVien = DiemSV.masv;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                QuanLyDiem qld = new QuanLyDiem();
                qld.setSv(new SinhVien(rs.getString(1), rs.getString(2)));
                qld.setDiemTin(rs.getFloat(3));
                qld.setDiemAnhVan(rs.getFloat(4));
                qld.setDiemGDTC(rs.getFloat(5));
                ls.add(qld);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public QuanLyDiem getQuanLyDiemByMaSV(String masv){
        QuanLyDiem qld = new QuanLyDiem();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select DiemSV.masv, SinhVien1.TenSinhVien, DiemSV.tinhoc, DiemSV.anhvan, DiemSV.gdtc from SinhVien1 inner join DiemSV on SinhVien1.MaSinhVien = DiemSV.masv where masv = ?;";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, masv);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                qld.setSv(new SinhVien(rs.getString(1), rs.getString(2)));
                qld.setDiemTin(rs.getFloat(3));
                qld.setDiemAnhVan(rs.getFloat(4));
                qld.setDiemGDTC(rs.getFloat(5));
                
                return qld;
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
        return null;
    }
    public static void main(String[] args) {
        QuanLyDiemDAO qldao = new QuanLyDiemDAO();
//        QuanLyDiem ql = new QuanLyDiem( 10, 10, 10, 6);
        System.out.println("size"+qldao.getAll().size());
//        qldao.edit(d);
    }
}
