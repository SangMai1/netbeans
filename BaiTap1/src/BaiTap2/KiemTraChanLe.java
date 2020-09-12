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
public class KiemTraChanLe {
    public static void main(String[] args) {
        int check;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so");
        check = sc.nextInt();
        if(check % 2 == 0){
            System.out.println("So chan");
        }
        else{
            System.out.println("So le");
        }
    }
}
