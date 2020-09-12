/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class SinhVien {
    public static void main(String[] args) {
        float t, l, h, sum, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap msv");
        String name = sc.nextLine();
        System.out.println("Nhap ten");
        String tensv = sc.nextLine();
        System.out.println("Toan");
        t = sc.nextFloat();
        System.out.println("Ly");
        l = sc.nextFloat();
        System.out.println("Hoa");
        h = sc.nextFloat();
        sum = t + l + h;
        avg = sum / 3;
        if (avg > 8) {
            System.out.println("Gioi: "+avg);
        }
        else {
            if (avg > 7){
                System.out.println("Kha: "+avg);
            }
            else{
                if(avg > 5){
                    System.out.println("Trung binh: "+avg);
                }
                else {
                    System.out.println("Yeu");
                }
            }
        }
    }
}
