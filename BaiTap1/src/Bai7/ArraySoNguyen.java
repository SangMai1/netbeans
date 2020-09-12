/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.ArrayList;

/**
 *
 * @author SANG
 */
public class ArraySoNguyen {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(9);
        System.out.println("So phan tu trong mang: "+arr.size());
        for (Integer aa : arr) {
            System.out.println("=>"+aa);
        }
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println("=>"+arr.get(i));
//        }
        arr.remove(3);
        System.out.println(arr.toString());
        for (Integer bb : arr) {
            if (bb % 2 == 0) {
                
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                
            }
        }
    }
}
