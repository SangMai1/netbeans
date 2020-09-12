/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphoadon;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class HoaDon {
    private int mahoadon;
    private Date ngaymuahang;
    private KhachHang maKhachHang;
    private String trangthai;

    public HoaDon() {
    }

    public HoaDon(int mahoadon) {
        this.mahoadon = mahoadon;
    }
    
    public HoaDon(int mahoadon, Date ngaymuahang, KhachHang maKhachHang, String trangthai) {
        this.mahoadon = mahoadon;
        this.ngaymuahang = ngaymuahang;
        this.maKhachHang = maKhachHang;
        this.trangthai = trangthai;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public Date getNgaymuahang() {
        return ngaymuahang;
    }

    public void setNgaymuahang(Date ngaymuahang) {
        this.ngaymuahang = ngaymuahang;
    }

    public KhachHang getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(KhachHang maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "mahoadon=" + mahoadon + '}';
    }
    
}
