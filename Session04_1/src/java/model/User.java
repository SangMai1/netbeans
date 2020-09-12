/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.DateHelper;
import java.util.Date;

/**
 *
 * @author SANG
 */
public class User {
    private String username;
    private String password;
    private String fullname;
    private int age;
    private Date birthday;
    private boolean gender;

    public User() {
    }

    public User(String username, String password, String fullname, int age, Date birthday, boolean gender) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return DateHelper.toString(birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
}
