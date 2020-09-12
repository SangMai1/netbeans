/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachjava3;

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
public class XuatBanDAO {
    public int add(NhaXuatBan nxb){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO QuanLySachJaVa.dbo.NhaXuatBan (ma_nxb, ten_nxb, dia_chi) VALUES (?, ?, ?)";
            conn = DatabaseQuanLySach.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, nxb.getManxb());
            sttm.setString(2, nxb.getTennxb());
            sttm.setString(3, nxb.getDiachi());
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
    public List<NhaXuatBan> getAllNhaXuatBan(){
        List<NhaXuatBan> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select ma_nxb, ten_nxb, dia_chi from NhaXuatBan";
            conn = DatabaseQuanLySach.DatabaseQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setManxb(rs.getInt(1));
                nxb.setTennxb(rs.getString(2));
                nxb.setDiachi(rs.getString(3));
                ls.add(nxb);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public NhaXuatBan getByMa(int ma){
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select ma_nxb, ten_nxb, dia_chi from NhaXuatBan where ma_nxb = ?;";
            conn = DatabaseQuanLySach.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, ma);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setManxb(rs.getInt(1));
                nxb.setTennxb(rs.getString(2));
                nxb.setDiachi(rs.getString(3));
                return nxb;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
}
