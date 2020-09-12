/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Calculator {

    public static void main(String[] args) {
        while (true) {
            double numberA, numberB, result;
            String phepTinh;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a, b");
            numberA = sc.nextDouble();
            numberB = sc.nextDouble();
            System.out.println("Phep tinh ");
            phepTinh = sc.next();
            if (phepTinh.equals("+")) {
                result = numberA + numberB;
                System.out.println(numberA + "+" + numberB + "=" + result);
                
            } else {
                if (phepTinh.equals("-")) {
                    result = numberA - numberB;
                    System.out.println(numberA + "-" + numberB + "=" + result);
                } else {
                    if (phepTinh.equals("*")) {
                        result = numberA * numberB;
                        System.out.println(numberA + "*" + numberB + "=" + result);
                    } else {
                        if (phepTinh.equals("/")) {
                            result = numberA / numberB;
                            System.out.println(numberA + "/" + numberB + "=" + result);
                        } else {
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }
}
