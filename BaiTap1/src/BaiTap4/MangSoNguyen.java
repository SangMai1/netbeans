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
public class MangSoNguyen {
    static int x;
    static int index = 0;
    static int a[] = new int[100];
    public static void main(String[] args) {
        input();
        output();
        chan();
        le();
        tbc();
        max();
        elementNoInput();
        xuatNguyenTo();
        deleteElement();
    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int tt = 1;
        do {
            System.out.println("mang: ");
            a[index] = sc.nextInt();
            index++;
            System.out.println("continue?(0/1)");
            tt = sc.nextInt();
        } while (tt == 1);
    }
    public static void output(){
        for (int i = 0; i < index; i++) {
            System.out.println("=>"+a[i]);
        }
    }
    public static void chan(){
        System.out.println("So chan: ");
        for (int i = 0; i < index; i++) {
                if(a[i] % 2 == 0)
                System.out.println("=>"+a[i]);
            }
        }
    public static void le(){
        int sum = 0;
        System.out.println("so le :");
        for (int i = 0; i < index; i++){
            if(a[i] % 2 != 0){
                System.out.println("=> "+a[i]);
                sum += a[i];
            }
        }
        System.out.println("tong so le: "+sum);
    }
    public static void tbc(){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < index; i++){
            if (a[i] % 3 == 0){
                sum += a[i];
                count++;
            }
        }
        System.out.println("sum"+sum);
        System.out.println("count"+count);
        System.out.println("avg"+sum/count);
    }
    public static void max(){
        int max = a[0];
        for(int i = 0; i < index; i++){
            if (max < a[i]);
                max = a[i];
        }
        System.out.println("max"+max);
    }
    //7.tìm phần tử k nhập từ bàn phím
    
    public static void elementNoInput(){
        Scanner sp = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sp.nextInt();
        for( int i = 0; i < index; i++){
               if(a[i] == x)
                   System.out.println("=>"+true);
           }
           System.out.println("=>"+false);
    }
//8.in các số nguyên tố có trong mảng
    public static boolean nguyenTo(int index){
        if(index < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(index);i++){
            if(index % i == 0){
                return false;
            }
        }
        return true;
}
    
    public static void xuatNguyenTo(){
        for(int i = 0; i < index; i++){
            if(nguyenTo(a[i])){
                System.out.println("=>"+a[i]);
            }
        }
        System.out.println();
 }
    

//xóa 1 phần tử bất kỳ trong mảng

public static void deleteElement(){
    int c, i;
    Scanner sv = new Scanner(System.in);
    System.out.println("Nhap phan tu can xoa: ");
    int k = sv.nextInt();
    for( c = i = 0; i < index; i++){
        if(a[i] != k){
            a[c] = a[i];
            c++;
        }
    }
    index = c;
    System.out.println("Mang con lai sau khi xoa: ");
    for(i = 0; i < index; i++){
        System.out.println("=>"+a[i]);
    }
}
   
