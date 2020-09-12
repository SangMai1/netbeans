/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_project;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class ObjectOutputNhanvien {
    public static void main(String[] args) {
        List<NhanVien> nv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fs = new FileOutputStream("D:/netbean/file3.dat");
            ObjectOutputStream doc = new ObjectOutputStream(fs);
            System.out.println("Ma nhan vien");
            
            fs.write(sc.nextInt());
            sc = new Scanner(System.in);
            System.out.println("Ho va ten nhan vien");
            fs.write(sc.next());
            System.out.println("Tuoi");
            fs.write(sc.nextInt());
            System.out.println("Luong");
            fs.write(sc.nextInt());
            
            fs.close();
            
        } catch (Exception e) {
            System.out.println("Done!"+e);
        }
    }
}
