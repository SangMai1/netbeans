/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class StudentUD extends Student{
    private double java1;
    private double java2;
    private double java3;

    public StudentUD() {
    }

    public StudentUD(double java1, double java2, double java3, int id, String name, double html, double sql) {
        super(id, name, html, sql);
        this.java1 = java1;
        this.java2 = java2;
        this.java3 = java3;
    }

    public double getJava1() {
        return java1;
    }

    public void setJava1(double java1) {
        this.java1 = java1;
    }

    public double getJava2() {
        return java2;
    }

    public void setJava2(double java2) {
        this.java2 = java2;
    }

    public double getJava3() {
        return java3;
    }

    public void setJava3(double java3) {
        this.java3 = java3;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("java1:");
        setJava1(sc.nextDouble());
        System.out.println("java2:");
        setJava2(sc.nextDouble());
        System.out.println("java3:");
        setJava3(sc.nextDouble());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getJava1()+"-"+getJava2()+"-"+getJava3()+"-"+avg()+"-"+xeploai(avg()));
    }

    @Override
    public double avg() {
        return (getHtml()+getSql()+getJava1()+getJava2()+getJava3())/5;
    }
    public static void main(String[] args) {
        StudentUD st = new StudentUD();
        st.input();
        st.output();
    }
}
