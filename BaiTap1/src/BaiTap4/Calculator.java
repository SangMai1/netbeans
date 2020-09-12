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
public class Calculator {

    public static void main(String[] args) {
        addAB();
        subAB();
        nhanAB();
        chiaAB();
    }

    public static void addAB() {
        int numberA, numberB;
        int result;
        numberA = 4;
        numberB = 5;
        result = numberA + numberB;
        System.out.println("Ket qua " + result);
    }
    public static void subAB(){
        int numberA, numberB;
        int result;
        numberA = 4;
        numberB = 5;
        result = numberA - numberB;
        System.out.println("Ket qua "+result);
    }
    public static void nhanAB(){
        int numberA, numberB;
        int result;
        numberA = 4;
        numberB = 5;
        result = numberA * numberB;
        System.out.println("Ket qua "+result);
    }
    public static void chiaAB(){
        int numberA, numberB;
        int result;
        numberA = 4;
        numberB = 5;
        result = numberA / numberB;
        System.out.println("Ket qua "+result);
    }
}
