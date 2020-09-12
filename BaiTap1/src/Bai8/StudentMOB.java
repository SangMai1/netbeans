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
public class StudentMOB extends Student{
    private double ardroid1;
    private double ardroid2;

    public StudentMOB() {
    }

    public StudentMOB(double ardroid1, double ardroid2, int id, String name, double html, double sql) {
        super(id, name, html, sql);
        this.ardroid1 = ardroid1;
        this.ardroid2 = ardroid2;
    }

    public double getArdroid1() {
        return ardroid1;
    }

    public void setArdroid1(double ardroid1) {
        this.ardroid1 = ardroid1;
    }

    public double getArdroid2() {
        return ardroid2;
    }

    public void setArdroid2(double ardroid2) {
        this.ardroid2 = ardroid2;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("ardroid1:");
        setArdroid1(sc.nextDouble());
        System.out.println("aedroid2:");
        setArdroid2(sc.nextDouble());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getArdroid1()+"-"+getArdroid2()+"-"+avg()+"-"+xeploai(avg()));
    }

    @Override
    public double avg() {
        return (getHtml()+getSql()+getArdroid1()+getArdroid2())/4;
    }
    public static void main(String[] args) {
        StudentMOB st = new StudentMOB();
        st.input();
        st.output();
    }
    
}
