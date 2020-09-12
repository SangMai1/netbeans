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
public class StudentWeb extends Student{
    private double php1;
    private double php2;

    public StudentWeb() {
    }

    public double getPhp1() {
        return php1;
    }

    public void setPhp1(double php1) {
        this.php1 = php1;
    }

    public double getPhp2() {
        return php2;
    }

    public void setPhp2(double php2) {
        this.php2 = php2;
    }

    public StudentWeb(double php1, double php2, int id, String name, double html, double sql) {
        super(id, name, html, sql);
        this.php1 = php1;
        this.php2 = php2;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("php1:");
        setPhp1(sc.nextDouble());
        System.out.println("php2:");
        setPhp2(sc.nextDouble());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("-"+getPhp1()+"-"+getPhp2()+"-"+avg()+"-"+xeploai(avg()));
    }

    @Override
    public double avg() {
        return (getHtml()+getSql()+getPhp1()+getPhp2())/4;
    }
    public static void main(String[] args) {
        StudentWeb st = new StudentWeb();
        st.input();
        st.output();
    }
}
