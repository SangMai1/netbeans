/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphoadon;

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
public class MuaHangDAO {
    public int add(MuaHang mh){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO QuanLyKhachHang.dbo.HoaDonChiTiet (Ma_HoaDon, Ma_SanPham, So_Luong, Ma_HoaDonChiTiet) VALUES (?, ?, ?, ?)";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(4, mh.getMamuahang());
            sttm.setInt(1, mh.getMahoadon().getMahoadon());
            sttm.setInt(2, mh.getMasanpham().getMasanpham());
            sttm.setInt(3, mh.getMasanpham().getSoluong());
            if (sttm.executeUpdate() > 0) {
                System.out.println("add thanh cong");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("erroradd"+e.toString());
        }
        return -1;
    }
    public List<MuaHang> getAllMuaHang(){
        List<MuaHang> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_HoaDon, Ma_SanPham, So_Luong, Ma_HoaDonChiTiet from HoaDonChiTiet";
            conn = Databaseql.Databaseqlkh.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                MuaHang mh = new MuaHang();
                mh.setMamuahang(rs.getString(1));
                mh.setMahoadon(new HoaDon(rs.getInt(2)));
                mh.setMasanpham(new SanPham(rs.getInt(3), rs.getInt(4)));
                ls.add(mh);
            }
        } catch (Exception e) {
            System.out.println("errorall"+e.toString());
        }
        return ls;
    }
    public static void main(String[] args) {
        MuaHangDAO dao = new MuaHangDAO();
        MuaHang mh = new MuaHang("a10", new HoaDon(2), new SanPham(101, 2));
        dao.add(mh);
    }
}
