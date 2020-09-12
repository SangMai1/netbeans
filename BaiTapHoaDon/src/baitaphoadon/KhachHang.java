/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphoadon;

/**
 *
 * @author SANG
 */
public class KhachHang {
    private String makhachhang;
    private String hovatenlot;
    private String ten;
    private String email;
    private String phone;
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    
    
    public KhachHang(String makhachhang, String hovatenlot, String ten, String email, String phone, String diachi) {
        this.makhachhang = makhachhang;
        this.hovatenlot = hovatenlot;
        this.ten = ten;
        this.email = email;
        this.phone = phone;
        this.diachi = diachi;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getHovatenlot() {
        return hovatenlot;
    }

    public void setHovatenlot(String hovatenlot) {
        this.hovatenlot = hovatenlot;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return this.getMakhachhang();
    }
    
}
