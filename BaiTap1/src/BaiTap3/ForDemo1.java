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
public class ForDemo1 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("=>" + i);
                sum += i;
                count++;
            }
        }
        System.out.println("tong " + sum);
        System.out.println("dem " + count);
        System.out.println("avg " + (sum / count));
    }
}
