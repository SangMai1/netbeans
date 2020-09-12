/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_sinhvien;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author SANG
 */
public class SinhVien {
    private String id;
    private String name;
    private Date Birthday;
    private boolean gender;
    private Lop lop;

    public SinhVien() {
    }

    public SinhVien(String id, String name, Date Birthday, boolean gender, Lop lop) {
        this.id = id;
        this.name = name;
        this.Birthday = Birthday;
        this.gender = gender;
        this.lop = lop;
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

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    
    
}
