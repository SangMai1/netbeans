/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap6;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class StudentWeb {
    private int id;
    private String name;
    private double php1;
    private double php2;
    //Sắp xếp sinh viên theo điểm trung bình tăng dần.
    //in ra sinh viên có điểm tb cao nhất.
    //tìm sinh viên với tên nhập từ bàn phím.
    public StudentWeb() {
    }

    public StudentWeb(int id, String name, double php1, double php2) {
        this.id = id;
        this.name = name;
        this.php1 = php1;
        this.php2 = php2;
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
    
    public double avg(double m1, double m2){
        return (m1 + m2)/2;
    }
    
    public double avg1(){
        return (getPhp1() + getPhp2())/2;
    }
    
    public double sum1(){
        return getPhp1() + getPhp2();
    }
    public double sum(double m1, double m2){
        return m1 + m2;
    }
    
    public String getXepLoai(double tbc){
        String xl= "";
        if(tbc >= 8){
            xl = "Gioi";
        } else if (tbc >= 6.5){
            xl = "Kha";
        } else if (tbc >= 5){
            xl = "Trung binh";
        } else {
            xl = "Yeu";
        }
        return xl;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id:");
        setId(sc.nextInt());
        System.out.println("Input name:");
        setName(sc.next());
        System.out.println("Input php1");
        setPhp1(sc.nextDouble());
        System.out.println("Input php2");
        setPhp2(sc.nextDouble());
    }
    
    public void output(){
        //double tbc = avg(php1, php2);
        //System.out.println("=>"+getId()+"-"+sum(php1, php2)+"-"+avg(php1, php2)+"-"+getXepLoai(tbc));
        double tbc = avg1();
        System.out.println("=>"+getId()+ "-" + sum1() + "-" + avg1() + "-" + getXepLoai(tbc));
    }
    
    
    public static void main(String[] args) {
        StudentWeb st = new StudentWeb();
        st.input();
        st.output();
    }
}
