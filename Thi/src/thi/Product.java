/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Product {
    private int masp;
    private String tensp;

    public Product() {
    }

    public Product(int masp, String tensp) {
        this.masp = masp;
        this.tensp = tensp;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
    
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Input ma san pham");
        setMasp(sc.nextInt());
        System.out.println("Input ten san pham");
        setTensp(sc.next());
    }
    public void output(){
        System.out.println("=>"+getMasp()+"-"+getTensp());
    }
}
