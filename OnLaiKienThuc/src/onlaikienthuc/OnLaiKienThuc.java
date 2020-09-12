/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlaikienthuc;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class OnLaiKienThuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {            
            double numberA, numberB, result;
            String phepTinh;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a, b");
            numberA = sc.nextDouble();
            numberB = sc.nextDouble();
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
