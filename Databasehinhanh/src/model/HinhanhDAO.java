/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import databasehinhanh.Databasehinhanh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SANG
 */
public class HinhanhDAO {
    public int add(Hinhanh ha){
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert Hinh_Anh(id, hinhanh) values (?, ?);";
            conn = Databasehinhanh.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, ha.getId());
            sttm.setBytes(2, ha.getHinhanh());
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
            } catch (SQLException ex) {
                Logger.getLogger(HinhanhDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }
}
