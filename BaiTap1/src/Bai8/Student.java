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
public abstract class Student {
    private int id;
    private String name;
    private double html;
    private double sql;

    public Student() {
    }

    public Student(int id, String name, double html, double sql) {
        this.id = id;
        this.name = name;
        this.html = html;
        this.sql = sql;
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

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getSql() {
        return sql;
    }

    public void setSql(double sql) {
        this.sql = sql;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id:");
        setId(sc.nextInt());
        System.out.println("name:");
        setName(sc.next());
        System.out.println("html:");
        setHtml(sc.nextDouble());
        System.out.println("sql:");
        setSql(sc.nextDouble());
    }
    public void output(){
        System.out.println("=>"+getId()+"-"+getName()+"-"+getHtml()+"-"+getSql());
    }
    public String xeploai(double avg){
        String xl = "";
        if (avg >= 8) {
            xl = "GIOI";
        }
        else if(avg >= 6.5){
            xl = "KHA";
        }
        else if(avg >= 5){
            xl = "TRUNG BINH";
        }
        else {
            xl = "YEU";
        }
        return xl;
    }
    public abstract double avg();
}
