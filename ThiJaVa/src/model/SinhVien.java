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
public class SinhVien {
    private String masv;
    private String tensv;
    private ChuyenNganh tencn;
    private Date ngaysinh;
    private boolean gioiTinh;
    private String phone;

    public SinhVien() {
    }

    public SinhVien(String masv, String tensv, ChuyenNganh tencn, Date ngaysinh, boolean gioiTinh, String phone) {
        this.masv = masv;
        this.tensv = tensv;
        this.tencn = tencn;
        this.ngaysinh = ngaysinh;
        this.gioiTinh = gioiTinh;
        this.phone = phone;
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

    public ChuyenNganh getTencn() {
        return tencn;
    }

    public void setTencn(ChuyenNganh tencn) {
        this.tencn = tencn;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
