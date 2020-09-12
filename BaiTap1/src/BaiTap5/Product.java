/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap5;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Product {

    //1.thuoc tinh
    //2.ham dung constructor
    //3.setter vs getter
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        setId(sc.nextInt());
        System.out.println("input name: ");
        sc = new Scanner(System.in);
        setName(sc.nextLine());
        System.out.println("input price:");
        setPrice(sc.nextDouble());
    }

    public void output() {
        System.out.println("=>" + getId() + "-" + getName() + "-" + getPrice());
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.input();
        p1.output();
        Product p2 = new Product();
        p2.input();
        p2.output();
    }
}
