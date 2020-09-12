/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class QuanLyThuVien {
    List<TheMuon> tm = new ArrayList<>();
    public void inputs(){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {            
            TheMuon t = new TheMuon();
            t.input();
            tm.add(t);
            System.out.println("continue(1/0)?");
            choice = sc.nextInt();
        } while (choice != 0);
    }
    public void outputs(){
        for (TheMuon theMuon : tm) {
            theMuon.output();
        }
    }
    public void sachTra(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyThuVien qltv = new QuanLyThuVien();
        qltv.inputs();
        qltv.outputs();
    }
}
