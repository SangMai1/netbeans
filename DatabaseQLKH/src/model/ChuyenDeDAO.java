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
public class ChuyenDeDAO {
    public int add(ChuyenDe cd){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into ChuyenDe(MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa) values (?,?,?,?,?,?);";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, cd.getMaCD());
            sttm.setString(2, cd.getTenCD());
            sttm.setDouble(3, cd.getHocPhi());
            sttm.setInt(4, cd.getThoiLuong());
            sttm.setString(5, cd.getHinh());
            sttm.setString(6, cd.getMota());
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
    public int edit(ChuyenDe cd){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE Polypro.dbo.ChuyenDe SET TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ? WHERE MaCD = ?";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(6, cd.getMaCD());
            sttm.setString(1, cd.getTenCD());
            sttm.setDouble(2, cd.getHocPhi());
            sttm.setInt(3, cd.getThoiLuong());
            sttm.setString(4, cd.getHinh());
            sttm.setString(5, cd.getMota());
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
            String sSQL = "DELETE FROM Polypro.dbo.ChuyenDe WHERE MaCD = ?;";
            conn = DatabaseQLKH.getDBConnect();
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
    public List<ChuyenDe> getAllChuyenDe(){
        List<ChuyenDe> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa from ChuyenDe";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString(1));
                cd.setTenCD(rs.getString(2));
                cd.setHocPhi(rs.getDouble(3));
                cd.setThoiLuong(rs.getInt(4));
                cd.setHinh(rs.getString(5));
                cd.setMota(rs.getString(6));
                ls.add(cd);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public ChuyenDe getChuyenDeByMaSV(String macd){
        ChuyenDe cd = new ChuyenDe();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa from ChuyenDe where MaCD = ?";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, macd);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                cd.setMaCD(rs.getString(1));
                cd.setTenCD(rs.getString(2));
                cd.setHocPhi(rs.getDouble(3));
                cd.setThoiLuong(rs.getInt(4));
                cd.setMota(rs.getString(5));
                cd.setHinh(rs.getString(6));
                
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
        ChuyenDeDAO dao = new ChuyenDeDAO();
//        System.out.println("size"+dao.getChuyenDeByMaSV("JS02"));
    }
}
