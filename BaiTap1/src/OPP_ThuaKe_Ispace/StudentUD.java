/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPP_ThuaKe_Ispace;

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

    public StudentUD(double java1, double java2, double java3, double sql, double html, int id, String name) {
        super(sql, html, id, name);
        this.java1 = java1;
        this.java2 = java2;
        this.java3 = java3;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("input java1");
        setJava1(sc.nextInt());;
        System.out.println("input java2");
        setJava2(sc.nextInt());
        System.out.println("input java3");
        setJava3(sc.nextInt());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getJava1()+"-"+getJava2()+"-"+getJava3());
    }

    @Override
    public double sum() {
        return super.sum()+getJava1() + getJava2() + getJava3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double avg() {
        return sum() / 5; //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        StudentUD st = new StudentUD();
        st.input();
        st.output();
        System.out.println("sum: "+ st.sum());
        System.out.println("avg: "+st.avg());
    }
}
