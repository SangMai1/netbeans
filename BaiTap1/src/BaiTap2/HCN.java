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
public class HCN {
    public static void main(String[] args) {
        float cd, cr, cv, dt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
         cd = sc.nextFloat();
        System.out.println("Nhap chieu rong");
         cr = sc.nextFloat();
         cv = 2 * (cd + cr);
         dt = cd * cr;
        System.out.println("Chu vi: "+cv);
        System.out.println("Dien tich: "+dt);
    }
}
