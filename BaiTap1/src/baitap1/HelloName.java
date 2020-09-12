/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho va Ten:");
        String name = sc.nextLine();
        System.out.println("Tuoi:");
        int age = sc.nextInt();
        System.out.println("diem:");
        float diem = sc.nextFloat();
        System.out.println("Hello "+name);
        System.out.println("Tuoi "+age);
        System.out.println("Diem "+diem);
    }
}
