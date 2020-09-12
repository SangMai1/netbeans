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
public class WhileDemo3 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int count = 0;
        while(i < 100){
            if(i % 3 == 0 ){
                sum +=i;
                System.out.println("=>"+i);
                count++;
            }
            i++;
        }
        System.out.println("tong "+sum);
        System.out.println("dem "+count);
        System.out.println("avg "+(sum/count));
    }
            
}
