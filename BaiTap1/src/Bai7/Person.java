/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input id:");
        setId(sc.nextInt());
        System.out.println("input name");
        setName(sc.next());
    }
    
    public void output(){
        System.out.println("=>"+getId()+"-"+getName());
    }
}
