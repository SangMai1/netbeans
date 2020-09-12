/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author SANG
 */
public class Calculator2 {

    public static void main(String[] args) {
        addAB(4, 6);
        subAB(4, 6);
        nhanAB(4, 6);
        chiaAB(4, 6);
    }

    public static void addAB(int numberA, int numberB) {
        int result = numberA + numberB;
        System.out.println("ket qua: " + result);
    }

    public static void subAB(int numberA, int numberB) {
        int result = numberA - numberB;
        System.out.println("ket qua: " + result);
    }

    public static void nhanAB(int numberA, int numberB) {
        int result = numberA * numberB;
        System.out.println("ket qua: " + result);
    }

    public static void chiaAB(int numberA, int numberB) {
        int result = numberA / numberB;
        System.out.println("ket qua: " + result);
    }
}
