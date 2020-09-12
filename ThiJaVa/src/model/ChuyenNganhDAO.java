/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class ChuyenNganhDAO {
    public int add(ChuyenNganh cn){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "INSERT INTO ThiJaVa.dbo.Chuyen_Nganh (Ma_CN, Ten_CN) VALUES (?, ?)";
            conn = Database.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, cn.getMaCN());
            sttm.setString(2, cn.getTenCN());
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
    public List<ChuyenNganh> getAllChuyenNganh(){
        List<ChuyenNganh> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_CN, Ten_CN from Chuyen_Nganh";
            conn = Database.DatabaseQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                ChuyenNganh cn = new ChuyenNganh();
                cn.setMaCN(rs.getString(1));
                cn.setTenCN(rs.getString(2));
                ls.add(cn);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return ls;
    }
    public ChuyenNganh getAllChuyenNganhBy(String ma){
        ChuyenNganh cn = new ChuyenNganh();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs;
        try {
            String sSQL = "select Ma_CN, Ten_CN from Chuyen_Nganh where Ma_CN = ?";
            conn = Database.DatabaseQL.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ma);
            rs = sttm.executeQuery();
            while (rs.next()) {                
                
                cn.setMaCN(rs.getString(1));
                cn.setTenCN(rs.getString(2));
                return cn;
            }
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
        return null;
    }
    public int find(String maCN){
        int p = -1;
        for (int i = 0; i < getAllChuyenNganh().size(); i++) {
            System.out.println("aaaaaa"+i);
            if (getAllChuyenNganh().get(i).getMaCN().equals(maCN)) {
                p = i;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        ChuyenNganhDAO dao = new ChuyenNganhDAO();
        System.out.println("bbb"+dao.find("A02"));
    }
}
