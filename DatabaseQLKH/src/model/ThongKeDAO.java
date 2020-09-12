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
public class ThongKeDAO {
    public List<Object[]> getAllNguoiHoc(){
        List<Object[]> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
            try {
                String sSQL = "select YEAR(NgayDK) Nam, COUNT(*) SoLuong , MIN(NgayDK) DauTien, MAX(NgayDK) CuoiCung from NguoiHoc group by YEAR(NgayDK)";
                conn = DatabaseQLKH.getDBConnect();
                sttm = conn.createStatement();
                rs = sttm.executeQuery(sSQL);
                while (rs.next()) {                
                    Object[] model= {
                    rs.getInt("Nam"),
                    rs.getInt("SoLuong"),
                    rs.getDate("DauTien"),
                    rs.getDate("CuoiCung")
                };
                  ls.add(model);
                }
            } catch (Exception e) {
                System.out.println("Error"+e.toString());
            }
            return ls;
        }
    public List<Object[]> getBangDiem(int makh){
        List<Object[]> ls = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select NguoiHoc.MaNH, NguoiHoc.HoTen, HocVien.Diem from HocVien inner join NguoiHoc on NguoiHoc.MaNH = HocVien.MaNH where HocVien.MaKH = ? order by HocVien.Diem desc";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, makh);
            rs = sttm.executeQuery();
            while (rs.next()) {     
                double diem = rs.getDouble("Diem");
                String xepLoai = "Xuat sac";
                if (diem < 0) {
                    xepLoai = "Chua nhap";
                }
                else if (diem < 3) {
                    xepLoai = "Kem";
                }
                else if (diem < 5) {
                    xepLoai = "Yeu";
                }
                else if (diem < 6.5) {
                    xepLoai = "Trung binh";
                }
                else if (diem < 7.5) {
                    xepLoai = "Kha";
                }
                else if (diem < 9) {
                    xepLoai = "Gioi";
                }
                Object[] model = {
                    rs.getString("MaNH"),
                    rs.getString("HoTen"),
                    diem,
                    xepLoai
                };
                ls.add(model);
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
    public List<Object[]> getDiemChuyenDe(){
        List<Object[]> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
            try {
                String sSQL = "select ChuyenDe.TenCD ChuyenDe,COUNT(HocVien.MaHV) SoHV, MAX(HocVien.Diem) CaoNhat, MIN(HocVien.Diem) ThapNhat, AVG(HocVien.Diem) TrungBinh  from KhoaHoc inner join HocVien on HocVien.MaKH = KhoaHoc.MaKH inner join ChuyenDe on ChuyenDe.MaCD = KhoaHoc.MaCD group by ChuyenDe.TenCD";
                conn = DatabaseQLKH.getDBConnect();
                sttm = conn.createStatement();
                rs = sttm.executeQuery(sSQL);
                while (rs.next()) {                
                    Object[] model= {
                    rs.getString("ChuyenDe"),
                    rs.getInt("SoHV"),
                    rs.getDouble("CaoNhat"),
                    rs.getDouble("ThapNhat"),
                    rs.getDouble("TrungBinh")
                };
                  ls.add(model);
                }
            } catch (Exception e) {
                System.out.println("Error"+e.toString());
            }
            return ls;
        }
    public List<Object[]> getDoanhThu(int nam){
        List<Object[]> ls = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select ChuyenDe.TenCD ChuyenDe,COUNT(DISTINCT KhoaHoc.MaKH) SoKH,COUNT(HocVien.MaHV) SoHV,SUM(KhoaHoc.HocPhi) DoanhThu, MAX(KhoaHoc.HocPhi) CaoNhat, MIN(KhoaHoc.HocPhi) ThapNhat, AVG(KhoaHoc.HocPhi) TrungBinh  from KhoaHoc inner join HocVien on HocVien.MaKH = KhoaHoc.MaKH inner join ChuyenDe on ChuyenDe.MaCD = KhoaHoc.MaCD where YEAR(NgayKG)= ? group by ChuyenDe.TenCD";
            conn = DatabaseQLKH.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, nam);
            rs = sttm.executeQuery();
            while (rs.next()) {     
                Object[] model = {
                    rs.getString("ChuyenDe"),
                    rs.getInt("SoKH"),
                    rs.getInt("SoHV"),
                    rs.getDouble("DoanhThu"),
                    rs.getDouble("CaoNhat"),
                    rs.getDouble("ThapNhat"),
                    rs.getDouble("TrungBinh")
                };
                ls.add(model);
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
    
}

