/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_thuviensach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



/**
 *
 * @author SANG
 */
public class ObjectInputThuvien {
    public static boolean ghifile(ArrayList<PhieuMuon> pm, String path){
        try {
            FileOutputStream fos = new FileOutputStream("D:/netbean/file7.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pm);
            fos.close();
            oos.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<PhieuMuon>docfile(String path){
        ArrayList<PhieuMuon> pm = new ArrayList<PhieuMuon>();
        try {
            FileInputStream foc = new FileInputStream("D:/netbean/file7.txt");
            ObjectInputStream red = new ObjectInputStream(foc);
            Object data = red.readObject();
            pm = (ArrayList<PhieuMuon>) data;
            foc.close();
            red.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pm;
    }
}
