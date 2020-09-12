/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class EmployeeDAO {

    //ArrayList<Employee>
    List<Employee> ls = new ArrayList<>();

    public void inputs() {
        String tt = "y";
        Scanner sc = new Scanner(System.in);
        do {
            Employee ee = new Employee();
            ee.input();
            ls.add(ee);
            System.out.println("tiep tuc: (y/n)");
            tt = sc.next();
        } while (tt.equalsIgnoreCase("y"));
    }

    public void outputs() {
        for (Employee ee : ls) {
            ee.output();
        }
    }

    public void dummydata() {
        ls.add(new Employee(9000, 1, "A1"));
        ls.add(new Employee(19000, 2, "A2"));
        ls.add(new Employee(10000, 3, "A3"));
        ls.add(new Employee(7000, 5, "A4"));
        ls.add(new Employee(13000, 4, "A5"));
        ls.add(new Employee(14000, 6, "A6"));
        ls.add(new Employee(17000, 7, "A7"));
        ls.add(new Employee(20000, 9, "A8"));
        ls.add(new Employee(11000, 8, "A9"));
    }

    public void maxSalary() {
        double max = ls.get(0).doSalary();
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            if (ee.doSalary() > max) {
                max = ee.doSalary();
                pos = i;
            }
        }
        if (pos >= 0) {
            Employee ee = ls.get(pos);
            ee.output();
        } else {
            System.out.println("k tim thay");
        }
    }
    public int findEmployee(int id){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            if(ee.getId() == id){
                pos = i;
            }
        }
        return pos;
    }
    public int findEmployee(String name){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            if(ee.getName().equalsIgnoreCase(name)){
                pos = i;
            }
        }
        return pos;
    }
    public double salaryAVG(){
        double sum = 0;
        double avg = 0;
        for (Employee e : ls) {
            sum = sum + e.doSalary();
        }
        return sum/ls.size();
    }
    public int deleteEmployee(int id){
        int pos = findEmployee(id);
        if (pos>=0) {
            ls.remove(pos);
        }
        return pos;
    }
    public int updateEMployee(int id){
        int pos = findEmployee(id);
        if (pos>=0) {
            Employee e = new Employee();
            e.input();
            ls.set(pos, e);
        }
        return pos;
    }
    public void arrangement(){
//        Collections.sort(ls, c);
        for (int i = 0; i < ls.size()-1; i++) {
            for (int j = i; j < ls.size(); j++) {
                Employee temp;
                if (ls.get(i).getId() > ls.get(j).getId()) {
                    temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
        }
    }
    public void outputs1() {
        for (int i = 0; i < ls.size(); i++) {
            Employee ee = ls.get(i);
            ee.output();
        }
    }

    public static void main(String[] args) {
        EmployeeDAO eed = new EmployeeDAO();
        eed.menu();
    }

    public void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.println("1.input");
            System.out.println("2.output");
            System.out.println("3.add list");
            System.out.println("4.Max salary");
            System.out.println("5.find id");
            System.out.println("6.find ten");
            System.out.println("7.avg");
            System.out.println("8.sort");
            System.out.println("Ban chon");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputs();
                    break;
                case 2:
                    arrangement();
                    outputs();
                    break;
                case 3:
                    dummydata();
                    break;
                case 4:
                    maxSalary();
                    break;
                case 5:
                    System.out.println("nhap id can tim");
                    int pos = findEmployee(sc.nextInt());
                    if (pos < 0) {
                        System.out.println("k tim thay");
                    } else {
//                        ls.get(pos).output();
                          Employee e = ls.get(pos);
                          e.output();
                    }
                    
                case 6:
                    System.out.println("nhap id can tim");
                    int pos1 = findEmployee(sc.next());
                    if (pos1 < 0) {
                        System.out.println("k tim thay");
                    } else {
//                        ls.get(pos).output();
                          Employee e = ls.get(pos1);
                          e.output();
                    }
                case 7:
                    salaryAVG();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
