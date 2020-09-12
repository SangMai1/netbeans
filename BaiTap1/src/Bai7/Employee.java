/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Employee extends Person {

    private double salary;
    
    public Employee(double salary, int id, String name) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public Employee() {
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
//        System.out.println("input id");
//        setId(sc.nextInt());
//        System.out.println("input name");
//        setName(sc.next());
        System.out.println("salary");
        setSalary(sc.nextDouble());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("=>" + getSalary() + "-" + getTax(salary) + "-" + doSalary());
    }

    public double getTax(double salary) {
        double tax = 0;
        if (salary <= 9000) {
            tax = 0;
        } else if (salary <= 12000) {
            tax = getTax(9000) + (salary - 9000) * 0.1;
        } else if (salary <= 15000) {
            tax = getTax(9000) + getTax(12000) + (salary - 12000) * 0.15;
        } else {
            tax = getTax(9000) + getTax(12000) + getTax(15000) + (salary - 15000) * 0.2;
        }
        return tax;
    }

    public double doSalary() {
        return getSalary() - getTax(getSalary());
    }

    public static void main(String[] args) {
        Employee em = new Employee();
        em.input();
        em.output();
    }
}
