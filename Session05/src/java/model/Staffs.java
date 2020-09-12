/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class Staffs {
    private String id;
    private Date birthday;
    private String email;
    private boolean gender;
    private String name;
    private String notes;
    private String phone;
    private String photo;
    private float salary;
    private Depart depart_id;

    public Staffs() {
    }

    public Staffs(String id, Date birthday, String email, boolean gender, String name, String notes, String phone, String photo, float salary, Depart depart_id) {
        this.id = id;
        this.birthday = birthday;
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.notes = notes;
        this.phone = phone;
        this.photo = photo;
        this.salary = salary;
        this.depart_id = depart_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Depart getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(Depart depart_id) {
        this.depart_id = depart_id;
    }

    @Override
    public String toString() {
        return "Staffs{" + "id=" + id + ", birthday=" + birthday + ", email=" + email + ", gender=" + gender + ", name=" + name + ", notes=" + notes + ", phone=" + phone + ", photo=" + photo + ", salary=" + salary + ", depart_id=" + depart_id + '}';
    }
    
}
