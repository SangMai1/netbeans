/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class MobileDAO {
    List<Moblie> mb = new ArrayList<>();
    public void inputs(){
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        String tt = "y";
        do {            
            Moblie mo = new Moblie();
            mo.input();
            mb.add(mo);
            System.out.println("continue(y/n)");
            tt = sc.next();
        } while (tt.equalsIgnoreCase("y"));
    }
    public void outputs(){
        for (Moblie mle : mb) {
            mle.output();
        }
    }
    public void dummyData(){
        mb.add(new Moblie(1000, 4, "samsung", 1, "oppa"));
        mb.add(new Moblie(2000, 10, "oppa", 6, "iphone1"));
        mb.add(new Moblie(4000, 1, "samsung", 4, "iphone2"));
        mb.add(new Moblie(3000, 3, "oppa", 7, "iphone3"));
        mb.add(new Moblie(5000, 2, "samsung", 8, "iphon4"));
        mb.add(new Moblie(7000, 6, "samsung", 3, "iphon5"));
        mb.add(new Moblie(8000, 8, "samsung", 2, "iphon6"));
        mb.add(new Moblie(12000, 7, "samsung", 9, "iphon7"));
        mb.add(new Moblie(8000, 5, "samsung", 10, "iphon8"));
        mb.add(new Moblie(9000, 9, "samsung", 5, "iphon9"));
        
    }
    public int findPhone(String tensp){
        int pos = -1;
        for (int i = 0; i < mb.size(); i++) {
            Product pd = mb.get(i);
            if (pd.getTensp().equalsIgnoreCase(tensp)) {
                pos = i;
            }
        }
        return pos;
    }
    public int findPhonid(int masp){
        int pos = -1;
        for (int i = 0; i < mb.size(); i++) {
            Product pd = mb.get(i);
            if (pd.getMasp() == masp) {
                pos = i;
            }
        }
        return pos;
    }
    public int remove(int masp){
        int pos1 = findPhonid(masp);
        if (pos1 >= 0) {
            mb.remove(pos1);
        }
        return pos1;
    }
    public void sapxep(){
        for (int i = 0; i < mb.size()-1; i++) {
            for (int j = i; j < mb.size(); j++) {
                Moblie employee;
                if (mb.get(i).getGiaban() > mb.get(j).getGiaban()) {
                    employee = mb.get(i);
                    mb.set(i, mb.get(j));
                    mb.set(j, employee);
                }
            }
        }
    }
    public static void main(String[] args) {
        MobileDAO mob = new MobileDAO();
         mob.menu();
    }
    public void menu(){
        while (true) {            
            int choice = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Input");
            System.out.println("2.OutPut");
            System.out.println("3.Tim dien thoai theo ten");
            System.out.println("4.Xoa dien thoai theo id");
            System.out.println("5.Sap xep");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    inputs();
                    break;
                case 2:
                    dummyData();
                    outputs();
                    break;
                case 3:
                    System.out.println("Nhap ten can tim");
                    int pos1 = findPhone(sc.next());
                    if (pos1 < 0) {
                        System.out.println("k tim thay");
                    } else {
                        Product pr = mb.get(pos1);
                        pr.output();
                    }
                break;
                case 4:
                    System.out.println("Nhap id can xoa");
                    int pos2 = remove(sc.nextInt());
                    if (pos2 < 0) {
                        System.out.println("k tim thay");
                    } else {
                        for (Moblie moblie : mb) {
                            moblie.output();
                        }
                    }
                break;
                case 5:
                    sapxep();
                    outputs();
                    break;
            }
        }
    }
}
