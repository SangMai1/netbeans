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
public class PTB2 {
    public static void main(String[] args) {
        double a, b, c;
        double d, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        a = sc.nextInt();
        System.out.println("Nhap b");
        b = sc.nextInt();
        System.out.println("Nhap c");
        c = sc.nextInt();
        d = b * b - 4 * a * c;
        System.out.println("denta"+d);
        if(d > 0){
            x1 = (-b + Math.sqrt(d))/ (2 * a);
            x2 = (-b - Math.sqrt(d))/ (2 * a);
            System.out.println("x1 "+x1);
            System.out.println("x2 "+x2);
        }
        else{
            if(d == 0){
                System.out.println("PT co 1 nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        }
        
}
