/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapphuongtiengt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class QLPTGT {

    List<PTGT> pt = new ArrayList<>();

    public void inputs() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.o to:");
        System.out.println("2.xe may:");
        System.out.println("3.xe tai:");
        choice = sc.nextInt();
        PTGT ptgt = null;
        switch (choice) {
            case 1:
                ptgt = new OTo();
                ptgt.input();
                break;
            case 2:
                ptgt = new Xemay();
                ptgt.input();
                break;
            case 3:
                ptgt = new Xetai();
                ptgt.input();
        }
        pt.add(ptgt);
    }

    public void outputs() {
        for (PTGT xe : pt) {
            xe.output();
        }
    }

    public static void main(String[] args) {
        QLPTGT ql = new QLPTGT();
        ql.menu();
    }
    public int findColor(String mau){
        int pos = -1;
        for (int i = 0; i < pt.size(); i++) {
            PTGT gt = pt.get(i);
            if (gt.getMau().equalsIgnoreCase(mau)) {
                pos = i;
            }
        }
        return pos;
    }
    public int findNamSanXuat(int namsanxuat){
        int pos = -1;
        for (int i = 0; i < pt.size(); i++) {
            PTGT gt = pt.get(i);
            if(gt.getNamsanxuat() == namsanxuat){
                pos = i;
            }
        }
        return pos;
    }
    public void menu() {
        while (true) {
            int chon = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Nhap phuong tien can dang ki:");
            System.out.println("2.Danh sach phuong tien da dang ki:");
            System.out.println("3.Mau xe can tim:");
            System.out.println("4.Nam can tim:");
            System.out.println("Lua chon:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    inputs();
                    break;
                case 2:
                    outputs();
                    break;
                case 3:
                    System.out.println("Nhap mau xe can tim:");
                    int pos = findColor(sc.next());
                    if (pos < 0) {
                        System.out.println("k tim thay");
                    } else {
                        PTGT p = pt.get(pos);
                        p.output();
                    }
                    break;
                case 4:
                    System.out.println("Nhap xe can tim theo nam:");
                    int pos1 = findNamSanXuat(sc.nextInt());
                    if (pos1 < 0) {
                        System.out.println("k tim thay");
                    } else {
                        PTGT pt1 = pt.get(pos1);
                        pt1.output();
                    }
                    break;
            }
        }

    }
}
