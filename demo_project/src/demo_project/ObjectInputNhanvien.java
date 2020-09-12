/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class ObjectInputNhanvien {
    public static void main(String[] args) {
        try {
            FileInputStream doc = new FileInputStream("D:/netbean/file3.dat");
            ObjectInputStream red = new ObjectInputStream(doc);
            NhanVien nv[] = (NhanVien[]) red.readObject();
            for (NhanVien nhanVien : nv) {
                System.out.println(nhanVien.toString());
            }
            doc.close();
            red.close();
        } catch (Exception e) {
            System.out.println("Loi doc file"+e);
        }
    }
}
