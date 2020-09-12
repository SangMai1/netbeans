/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapthithu;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id");
        setId(sc.nextInt());
        System.out.println("Input name");
        setName(sc.next());
        System.out.println("Input age");
        setAge(sc.nextInt());
        System.out.println("Input address");
        setName(sc.next());
    }
    public void printStudent(){
        System.out.println("=>"+getId()+"-"+getName()+"-"+getAge()+"-"+getAddress());
    }
  
}
