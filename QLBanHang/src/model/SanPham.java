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
public class SanPham {
    private String masp;
    private String tensp;
    private Date ngayNhap;
    private int soluong;
    private double giaban;
    private LoaiSanPham loaiSP;//doi tuong

    public SanPham() {
    }

    public SanPham(String masp, String tensp, Date ngayNhap, int soluong, double giaban, LoaiSanPham loaiSP) {
        this.masp = masp;
        this.tensp = tensp;
        this.ngayNhap = ngayNhap;
        this.soluong = soluong;
        this.giaban = giaban;
        this.loaiSP = loaiSP;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }
    public double sum(){
        return getGiaban() * getSoluong();
    }
}
