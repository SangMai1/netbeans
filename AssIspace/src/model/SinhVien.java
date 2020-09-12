/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SANG
 */
public class SinhVien {
    private String maSinhVien;
    private String hotenSinhVien;
    private String email;
    private String phone;
    private boolean gioitinh;
    private String diachi;
    private String hinhanh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hotenSinhVien) {
        this.maSinhVien = maSinhVien;
        this.hotenSinhVien = hotenSinhVien;
    }

    public SinhVien(String maSinhVien, String hotenSinhVien, String email, String phone, boolean gioitinh, String diachi, String hinhanh) {
        this.maSinhVien = maSinhVien;
        this.hotenSinhVien = hotenSinhVien;
        this.email = email;
        this.phone = phone;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.hinhanh = hinhanh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHotenSinhVien() {
        return hotenSinhVien;
    }

    public void setHotenSinhVien(String hotenSinhVien) {
        this.hotenSinhVien = hotenSinhVien;
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

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
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

    

    @Override
    public String toString() {
        return this.getHotenSinhVien();
    }
    
    
    
    
}
