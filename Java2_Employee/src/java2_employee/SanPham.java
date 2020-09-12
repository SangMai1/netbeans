/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_employee;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private Date ngayNhap;
    private int soLuong;
    private double gia;
    private LoaiSanPham loaiSP;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, Date ngayNhap, int soLuong, double gia, LoaiSanPham loaiSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.gia = gia;
        this.loaiSP = loaiSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", ngayNhap=" + ngayNhap + ", soLuong=" + soLuong + ", gia=" + gia + ", loaiSP=" + loaiSP + '}';
    }

    
    
}
