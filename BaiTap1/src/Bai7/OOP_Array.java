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
public class OOP_Array {
    public static void main(String[] args) {
        //TODO code application logic here
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add("A1");
        arr.add(true);
        arr.add(3.3);
        System.out.println("=>"+arr.get(0));
        System.out.println("=>"+arr.get(3));
        System.out.println("=>"+arr.get(4));
    }
}
//array : nguyen thuy, co dinh
//arraylist: doi tuong, linh dong