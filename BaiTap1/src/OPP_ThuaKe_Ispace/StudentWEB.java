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
public class StudentWEB extends Student {

    private double php1;
    private double php2;
    private double php3;

    public StudentWEB() {
    }

    public StudentWEB(double php1, double php2, double php3, double sql, double html, int id, String name) {
        super(sql, html, id, name);
        this.php1 = php1;
        this.php2 = php2;
        this.php3 = php3;
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

    public double getPhp3() {
        return php3;
    }

    public void setPhp3(double php3) {
        this.php3 = php3;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("input php1");
        setPhp1(sc.nextInt());
        System.out.println("input php2");
        setPhp2(sc.nextInt());
        System.out.println("input php3");
        setPhp3(sc.nextInt());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>" + getPhp1() + "-" + getPhp2() + "-" + getPhp3());
    }

    @Override
    public double sum() {

        return super.sum() + getPhp1() + getPhp2() + getPhp3(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double avg() {
        return sum() / 5; //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        StudentWEB st = new StudentWEB();
        st.input();
        st.output();
        System.out.println("sum: " + st.sum());
        System.out.println("avg: " + st.avg());
        System.out.println("xep loai: " + st.XepLoai(st.avg()));
    }
}
