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
public class MaxABC {
    public static void main(String[] args) {
        int a, b, c,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();
        max = a;
        if (b > max){
           max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("max :"+max);
    }
}
