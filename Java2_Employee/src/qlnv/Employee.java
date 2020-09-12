/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class Employee {
    private int maNV;
    private String tenNV;
    private Date ngaysinh;
    private boolean gioiTinh;
    private String phongban;
    private String hinhanh;

    public Employee() {
    }

    public Employee(int maNV, String tenNV, Date ngaysinh, boolean gioiTinh, String phongban, String hinhanh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaysinh = ngaysinh;
        this.gioiTinh = gioiTinh;
        this.phongban = phongban;
        this.hinhanh = hinhanh;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
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

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    @Override
    public String toString() {
        return "Employee{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", ngaysinh=" + ngaysinh + ", gioiTinh=" + gioiTinh + ", phongban=" + phongban + ", hinhanh=" + hinhanh + '}';
    }

    
    
}
