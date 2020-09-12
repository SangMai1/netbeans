/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Database.DatabaseQL;
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
public class SinhVienDAO {
    public int add(SinhVien sv){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO ThiJaVa.dbo.Sinh_Vien (Ma_SV, Ten_SV, Ma_CN, Ngay_Sinh, GioiTinh, Phone) VALUES (?, ?, ?, ?, ?, ?)";
            conn = Database.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sv.getMasv());
            sttm.setString(2, sv.getTensv());
            sttm.setString(3, sv.getTencn().getMaCN());
            sttm.setString(4, DateHelper.toString(sv.getNgaysinh()));
            sttm.setBoolean(5, sv.isGioiTinh());
            sttm.setString(6, sv.getPhone());
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
    public int edt(SinhVien sv, String ma){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE ThiJaVa.dbo.Sinh_Vien SET Ten_SV = ?, Ma_CN = ?, Ngay_Sinh = ?, GioiTinh = ?, Phone = ? WHERE Ma_SV = ?;";
            conn = Database.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sv.getTensv());
            sttm.setString(2, sv.getTencn().getMaCN());
            sttm.setString(3, DateHelper.toString(sv.getNgaysinh()));
            sttm.setBoolean(4, sv.isGioiTinh());
            sttm.setString(5, sv.getPhone());
            sttm.setString(6, ma);
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
    public int del(String macd){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "DELETE FROM ThiJaVa.dbo.Sinh_Vien WHERE Ma_SV = ?;";
            conn = DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, macd);
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
    public List<SinhVien> getAllChuyenNganh(){
        List<SinhVien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_SV, Ten_SV, Ma_CN, Ngay_Sinh,GioiTinh, Phone from Sinh_Vien";
            conn = Database.DatabaseQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                SinhVien sv = new SinhVien();
                sv.setMasv(rs.getString(1));
                sv.setTensv(rs.getString(2));
                sv.setTencn(new ChuyenNganh(rs.getString(3)));
                sv.setNgaysinh(rs.getDate(4));
                sv.setGioiTinh(rs.getBoolean(5));
                sv.setPhone(rs.getString(6));
                ls.add(sv);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public int find(String maCN){
        int p = -1;
        for (int i = 0; i < getAllChuyenNganh().size(); i++) {
            if (maCN.equals(getAllChuyenNganh().get(i).getTencn().getMaCN())) {
                i = p;
                
            }
        }
        return p;
    }
    public static void main(String[] args) {
        SinhVienDAO dao = new SinhVienDAO();
        System.out.println("qqqqqqqqqq"+dao.find("A02"));
    }
}
