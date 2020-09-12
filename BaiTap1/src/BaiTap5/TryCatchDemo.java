/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap5;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class TryCatchDemo {
        public static void main(String[] args) {
            try {
                int numberA, numberB;
                Scanner sc = new Scanner(System.in);
                System.out.println("Input a, b");
                numberA = sc.nextInt();
                numberB = sc.nextInt();
                System.out.println("=>"+result);
            } catch (Exception e) {
                System.out.println("Error: "+e.toString());
            }
  }
}
