/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author SANG
 */
public class TestDB {
    public static void main(String[] args) throws SQLException {
        Connection conn = DatabaseUtils.getDBConnect();
        if (conn != null) {
            System.out.println("ket noi thanh cong");
            User u = new User();
//            u.add();
//            u.edit();
              u.del();
//              u.getAllUser();
        } else {
            System.out.println("ket noi khong thanh cong");
        }
    }
}
