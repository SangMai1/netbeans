/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.DatabaseUtils;
import common.DateHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class MajorDAO {
    public List<Major> getAll(){
        Connection conn = null;
        PreparedStatement sttm = null;
        List<Major> ls = new ArrayList();
        try {
            String sSQL = "select * from Major";
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {                
                Major m = new Major();
                m.setId(rs.getInt(1));
                m.setName(rs.getString(2));
                ls.add(m);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.toString());
        } finally {
            try {
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        
        MajorDAO dao = new MajorDAO();
        System.out.println("size"+dao.getAll());
    }
}
