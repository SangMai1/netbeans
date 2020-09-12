/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_project;

import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class NhanVien {
    private int manv;
    private String hoten;
    private int age;
    private double salary;

    public NhanVien() {
    }

    public NhanVien(int manv, String hoten, int age, double salary) {
        this.manv = manv;
        this.hoten = hoten;
        this.age = age;
        this.salary = salary;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return manv + "-" + hoten + "-" + age + "-" + salary;
    }
   
}
