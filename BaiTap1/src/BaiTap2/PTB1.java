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
public class PTB1 {
    public static void main(String[] args) {
        int a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        x = -b/a;
        System.out.println("x :"+x);
    }
    
}