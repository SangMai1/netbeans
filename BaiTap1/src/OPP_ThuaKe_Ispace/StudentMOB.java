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
public class StudentMOB extends Student{
    private double android1;
    private double ardorid2;

    public StudentMOB() {
    }

    public StudentMOB(double android1, double ardorid2, double sql, double html, int id, String name) {
        super(sql, html, id, name);
        this.android1 = android1;
        this.ardorid2 = ardorid2;
    }

    public double getAndroid1() {
        return android1;
    }

    public void setAndroid1(double android1) {
        this.android1 = android1;
    }

    public double getArdorid2() {
        return ardorid2;
    }

    public void setArdorid2(double ardorid2) {
        this.ardorid2 = ardorid2;
    }

    @Override //ghi đè
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("input android 1: ");
        setAndroid1(sc.nextInt());
        System.out.println("input android 2 :");
        setArdorid2(sc.nextInt());
        
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getAndroid1() + "-" + getArdorid2());
    }

    @Override
    public double sum() {
        return super.sum() + getAndroid1() + getArdorid2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double avg() {
        return sum() / 4; //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        StudentMOB st = new StudentMOB();
        st.input();
        st.output();
        System.out.println("sum: "+st.sum());
        System.out.println("avg: "+st.avg());
    }
}
//StudenWEB<--Student<--Person: thùa kế nhiều tầng không phải đa câu hình
//@Override : có 2 cách: ghi đè và xóa ghi lại
//overload : hàm trùng tên khác số lượng tham số và kiểu tham số