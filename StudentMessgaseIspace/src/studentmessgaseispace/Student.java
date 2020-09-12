/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmessgaseispace;

import java.util.Date;

/**
 *
 * @author SANG
 */
public abstract class Student {
    public static  final double GIOI = 8.0;
    public static  final double KHA = 7.0;
    public static  final double TRUNG_BINH = 5.0;
    public static  final double YEU = 4.0;
    private int id;
    private String name;
    private boolean gender;
    private Date birthay;
    private double sql;
    private double english;

    public Student() {
    }

    public Student(int id, String name, boolean gender, Date birthay, double sql, double english) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthay = birthay;
        this.sql = sql;
        this.english = english;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthay() {
        return birthay;
    }

    public void setBirthay(Date birthay) {
        this.birthay = birthay;
    }

    public double getSql() {
        return sql;
    }

    public void setSql(double sql) {
        this.sql = sql;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }
    public abstract double sum();
    public abstract double avg();
    public String arrangement(double avg){
        String xl = "";
        if (avg >= GIOI) {
            xl = "GIOI";
        } else if (avg >= KHA) {
            xl = "KHA";
        } else if (avg >= TRUNG_BINH) {
            xl = "TRUNG BINH";
        } else if (avg >= YEU) {
            xl = "YEU";
        } else 
            xl = "KEM";
            return  xl;
    }
}
