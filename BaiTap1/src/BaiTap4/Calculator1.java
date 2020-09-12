/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Calculator1 {
    //bien toan cuc
    //bien ham
    //bien cuc bo
    static int numberA, numberB;
    public static void main(String[] args) {
        input();
        addAB();
        subAB();
        nhanAB();
        chiaAB();
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a:");
        numberA = sc.nextInt();
        System.out.println("input b: ");
        numberB = sc.nextInt();
    } 
    public static void addAB(){
        int result = numberA + numberB;
        System.out.println("ket qua "+result);
    }
    public static void subAB(){
        int result = numberA - numberB;
        System.out.println("ket qua "+result);
    }
    public static void nhanAB(){
        int result = numberA * numberB;
        System.out.println("ket qua "+result);
    }
    public static void chiaAB(){
        int result = numberA / numberB;
        System.out.println("ket qua "+result);
    }
}
