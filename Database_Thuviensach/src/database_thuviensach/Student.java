/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_thuviensach;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Student implements Serializable{
    private String id;
    private String name;
    private String email;
    private String phone;

    public Student(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student: Id student:" + this.id+"- Ten student:"+this.name+"- Gmail:"+this.email+"-SDT:"+this.phone;
    }
    
    }

