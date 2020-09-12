/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_thuviensach;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author SANG
 */
public class Test {
    ArrayList<PhieuMuon> pm1 = new ArrayList<>();
    public void test() {
        
        pm1.add(new PhieuMuon("conan", "A01", "12/12/2010", "12/1/2011", "B01", "sang", "vansang1532000@gmail.com", "0987654"));
        pm1.add(new PhieuMuon("doremon", "A02", "1/1/2018", "2/2/2018", "B02", "hau", "adsdfe@gmail.com", "0123456"));
        pm1.add(new PhieuMuon("trang quynh", "A03", "11/1/2010", "12/2/2010", "B03", "hai", "ads1234@gmail.com", "0987654"));
        pm1.add(new PhieuMuon("trang ti", "A04", "1/1/2018", "2/2/2019", "B04", "ha", "sdfrsdfe@gmail.com", "06123"));
        pm1.add(new PhieuMuon("chi pheo", "A05", "8/7/2018", "7/8/2018", "B05", "hoa", "iuyrefe@gmail.com", "09865512"));

        if (ObjectInputThuvien.ghifile(pm1, "D:/netbean/file7.txt")) {
            System.out.println("ghi file thanh cong");
        }
            
        else {
            System.out.println("Eroor");
        }
    }
    public void inputs(){
        ArrayList<PhieuMuon> pm2 = ObjectInputThuvien.ghifile(pm1, "D:/netbean/file7.txt");
    }
    public static void main(String[] args) throws IOException{
//        test();
        ArrayList<PhieuMuon> pm1 = ObjectInputThuvien.docfile( "D:/netbean/file7.txt");
        System.out.println("Danh sach muon:");
        for (PhieuMuon phm : pm1) {
            System.out.println(phm);
        }
    }
}
  