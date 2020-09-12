/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_thi;

import java.util.Scanner;
import sun.nio.cs.ext.IBM861;

/**
 *
 * @author SANG
 */
public class StudentJava extends Student{
    private double pointJava;
    private double pointSQL;

    public double getPointJava() {
        return pointJava;
    }

    public void setPointJava(double pointJava) {
        this.pointJava = pointJava;
    }

    public double getPointSQL() {
        return pointSQL;
    }

    public void setPointSQL(double pointSQL) {
        this.pointSQL = pointSQL;
    }

    public StudentJava(double pointJava, double pointSQL, int id, String name, int age, String address) {
        super(id, name, age, address);
        this.pointJava = pointJava;
        this.pointSQL = pointSQL;
    }

    public StudentJava() {
    }

    @Override
    public void inputStudent() {
        super.inputStudent();//To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Java");
        setPointJava(sc.nextDouble());
        System.out.println("Nhap diem SQL");
        setPointSQL(sc.nextDouble());
    }

    @Override
    public void printStudent() {
        super.printStudent();//To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getPointJava()+"-"+getPointSQL()+"-"+doAveradge());
    }

    public double doAveradge(){
        return (getPointJava()+getPointSQL())/2;
    }

    
    
}
