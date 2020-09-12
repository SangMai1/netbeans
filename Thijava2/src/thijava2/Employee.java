/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thijava2;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class Employee {
    private String id;
    private String name;
    private boolean gender;
    private Date birthday;
    private Float salary;
    private Phong deparment;

    public Employee() {
    }

    public Employee(String id, String name, boolean gender, Date birthday, Float salary, Phong deparment) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.salary = salary;
        this.deparment = deparment;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Phong getDeparment() {
        return deparment;
    }

    public void setDeparment(Phong deparment) {
        this.deparment = deparment;
    }

    
    
    
}
