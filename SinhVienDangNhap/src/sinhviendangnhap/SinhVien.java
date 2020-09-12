/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhviendangnhap;

/**
 *
 * @author SANG
 */
public class SinhVien {
    private String masv;
    private String tensv;
    private String email;
    private String phone;
    private boolean dender;
    private String diachi;
    private String hinhanh;

    public SinhVien() {
    }

    public SinhVien(String masv, String tensv, String email, String phone, boolean dender, String diachi, String hinhanh) {
        this.masv = masv;
        this.tensv = tensv;
        this.email = email;
        this.phone = phone;
        this.dender = dender;
        this.diachi = diachi;
        this.hinhanh = hinhanh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
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

    public boolean isDender() {
        return dender;
    }

    public void setDender(boolean dender) {
        this.dender = dender;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
    
}
