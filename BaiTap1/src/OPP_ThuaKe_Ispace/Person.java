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
public class Person {

    private int id;
    private String name;

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

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input id: ");
        setId(sc.nextInt());
        sc = new Scanner(System.in);
        System.out.println("Input name:");
        setName(sc.nextLine());
    }

    public void output() {
        System.out.println("=>" + getId() + "-" + getName());
    }

    public static void main(String[] args) {
        Person sp = new Person();
        sp.input();
        sp.output();
    }
}
