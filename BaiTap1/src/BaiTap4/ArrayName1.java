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
public class ArrayName1 {

    static int index = 0;
    static String a[] = new String[100];

    public static void main(String[] args) {
        input();
        output();
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);

        String tt = "y";
        do {
            System.out.println("input name:");
            a[index] = sc.nextLine();
            index++;
            System.out.println("countinue?(y/n)");
            tt = sc.nextLine();
        } while (tt.equalsIgnoreCase("y"));
    }

    public static void output() {
        for (int i = 0; i < index; i++) {
            System.out.println("=>" + a[i]);
        }
    }
}
