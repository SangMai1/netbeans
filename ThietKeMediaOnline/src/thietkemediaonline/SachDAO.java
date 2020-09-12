/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thietkemediaonline;

import database.DatabaseMedia;
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
public class SachDAO {
    public int add(Sach s){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert Sach(MaSanPham,TenSanPham,NhaXuatBan,TacGia,HinhThuc,SoLuong,GiaMua,GiaBan) values (?,?,?,?,?,?,?,?);";
            conn = DatabaseMedia.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, s.getMasach());
            sttm.setString(2, s.getTensach());
            sttm.setString(3, s.getNhaxuatban());
            sttm.setString(4, s.getTacgia());
            sttm.setString(5,s.getHinhthuc().toString());
            sttm.setInt(6, s.getSoluong());
            sttm.setFloat(7, s.getGiamua());
            sttm.setFloat(8, s.getGiaban());
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
    public List<Sach> getAll(){
        List<Sach> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "";
            conn = DatabaseMedia.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                Sach s = new Sach();
                s.setMasach(rs.getString(1));
                s.setTensach(rs.getString(2));
                s.setNhaxuatban(rs.getString(3));
                s.setTacgia(rs.getString(4));
                s.setHinhthuc(rs.getString(5).toString());
                ls.add(us);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
}
