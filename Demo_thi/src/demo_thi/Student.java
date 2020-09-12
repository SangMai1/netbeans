/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_thi;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    Student(int i, String a, int i0, String dn, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        setId(sc.nextInt());
        System.out.println("Nhap ten");
        setName(sc.next());
        System.out.println("Nhap tuoi");
        setAge(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.println("Nhap dia chi");
        setAddress(sc.nextLine());
    }
    public void printStudent() {
        System.out.println("=>"+getId()+"-"+getName()+"-"+getAge()+"-"+getAddress());
    }
}
