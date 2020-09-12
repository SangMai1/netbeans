/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap6;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        setId(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        setName(sc.nextLine());
        System.out.println("Luong");
        setSalary(sc.nextDouble());
    }
    public void output(){
        System.out.println("=>"+getId()+"-"+getName()+"-"+getSalary()+"-"+(salary-getTax(salary)));
    }
    public double getTax(double salary){
        double tax = 0;
        if(salary <= 9000){
            tax = 0;
        } else if(salary <= 12000){
            tax = getTax(9000)+(salary-9000)*0.1;
        } else if(salary <= 15000){
            tax = getTax(9000)+getTax(12000)+(salary-12000)*0.15;
        } else {
            tax = getTax(9000)+getTax(12000)+getTax(15000)+(salary-15000)*0.2;
        }
        return tax;
    }
    
    public double getSalaryAfterTax(){
        return getSalary() - getTax(getSalary());
    }
    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Employee em = new Employee();
        //em.input();
        //em.output();
        System.out.println("=>"+em.getTax(9000));
        System.out.println("=>"+em.getTax(10000));
        System.out.println("=>"+em.getTax(12000));
        System.out.println("=>"+em.getTax(15000));


    }
}
