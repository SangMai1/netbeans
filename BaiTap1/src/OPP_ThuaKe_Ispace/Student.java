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
public class Student extends Person {
    public static final double GIOI = 8;
    public static final double KHA = 6.5;
    public static final double TRUNG_BINH = 5;
    private double sql;
    private double html;
    
    public Student(double sql, double html, int id, String name) {
        super(id, name);
        this.sql = sql;
        this.html = html;
    }


    public double getSql() {
        return sql;
    }

    public void setSql(double sql) {
        this.sql = sql;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public Student(double sql, double html) {
        this.sql = sql;
        this.html = html;
    }

    public Student() {
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("SQL:");
        setSql(sc.nextDouble());
        System.out.println("HTML:");
        setHtml(sc.nextDouble());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>" + getHtml() + "-" + getSql());
    }

    public double sum() {
        return getHtml() + getSql();
    }

    public double avg() {
        return sum() / 2;
    }

    public String XepLoai(double mark) {
        String xl = "";
        if(mark >= GIOI) {
            xl = "GIOI";
        } else if (mark >= KHA) {
            xl = "KHA";
        } else if (mark >= TRUNG_BINH){
            xl = "TRUNG_BINH";
        } else {
            xl = "YEU";
        }
        return xl;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.input();
        st.output();
    }
}
