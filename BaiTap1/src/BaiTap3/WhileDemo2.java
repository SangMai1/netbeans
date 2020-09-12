/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author SANG
 */
public class WhileDemo2 {

    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i < 100) {
            System.out.println("=>" + i);
            sum = sum + i;
            i++;
        }
        System.out.println("tong " + sum);
    }
}
