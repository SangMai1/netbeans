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
public class Student {
    private int id;
    private String name;
    private double markJava;
    private double markSQL;

    public Student() {
    }

    public Student(int id, String name, double markJava, double markSQL) {
        this.id = id;
        this.name = name;
        this.markJava = markJava;
        this.markSQL = markSQL;
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

    public double getMarkJava() {
        return markJava;
    }

    public void setMarkJava(double markJava) {
        this.markJava = markJava;
    }

    public double getMarkSQL() {
        return markSQL;
    }

    public void setMarkSQL(double markSQL) {
        this.markSQL = markSQL;
    }

    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        setId(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.println("Name:");
        setName(sc.nextLine());
        System.out.println("markJava");
        setMarkJava(sc.nextInt());
        System.out.println("markSQL");
        setMarkSQL(sc.nextInt());
    }
    public void output(){
        //sum();
        System.out.println("sum"+sum1(getMarkJava(), getMarkSQL()));
        System.out.println("avg"+avg(getMarkJava(), getMarkSQL()));
        xepLoai();
    }
  public void sum(){
     double rs = getMarkJava() + getMarkSQL();
      System.out.println("sum"+rs);
  }
  public double sum1(double m1, double m2){
      return m1 + m2;
  }
  public double avg(double m1, double m2){
      return (m1 + m2)/2;
  }
 
  public void xepLoai(){
      double tb = (getMarkJava() + getMarkSQL()) / 2;
      if(tb > 8){
          System.out.println("gioi");
      } else {
          if (tb > 7){
              System.out.println("Kha");
          } else {
              if (tb > 5){
                  System.out.println("Trung binh");
              } else
                  System.out.println("Yeu");
          }
      }
  }
    public static void main(String[] args) {
        Student st = new Student();
        st.input();
        st.output();
    }
}
