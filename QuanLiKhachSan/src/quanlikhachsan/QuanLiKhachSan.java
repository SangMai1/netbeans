/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlikhachsan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class QuanLiKhachSan {
    List<Khachsan> ks = new ArrayList<>();
    public void inputs(){
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {            
            Khachsan k = new Khachsan();
            k.input();
            ks.add(k);
            System.out.println("continue(1/0)?");
            chon = sc.nextInt();
        } while (chon != 0);
    }
    public void outputs(){
        for (Khachsan k : ks) {
            k.output();
        }
    }
    public int findName(String name){
        int pos = -1;
        for (int i = 0; i < ks.size(); i++) {
            Nguoi n = ks.get(i);
            if (n.getName().equalsIgnoreCase(name)) {
                pos = i;
            }
        }
        return pos;
    }
    public int removeKhach(String name){
        int pos = findName(name);
        if (pos >= 0) {
            ks.remove(pos);
        }
        return pos;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLiKhachSan ql = new QuanLiKhachSan();
        ql.menu();
    }
    public void menu(){
        while (true) {            
            int choice = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Nhap:");
            System.out.println("2.xuat:");
            System.out.println("3.Xoa:");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    inputs();
                    break;
                case 2:
                    outputs();
                    break;
                case 3:
                    System.out.println("Nhap ten can xoa:");
                    int pos = findName(sc.next());
                    if (pos < 0) {
                        System.out.println("k tim thay");
                    } else {
                        Nguoi n = ks.get(pos);
                        n.output();
                    }
                    break;
            }
        }
    }
}
