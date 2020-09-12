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
public class NguoiHoc {
    private String maNH;
    private String hoTen;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String dienThoai;
    private String Email;
    private NhanVien maNV ;
    private String ghiChu;
    private Date ngayDK;

    public NguoiHoc() {
    }

    public NguoiHoc(String maNH, String hoTen) {
        this.maNH = maNH;
        this.hoTen = hoTen;
    }

    
    public NguoiHoc(String maNH, String hoTen, boolean gioiTinh, Date ngaySinh, String dienThoai, String Email, NhanVien maNV, String ghiChu, Date ngayDK) {
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.Email = Email;
        this.maNV = maNV;
        this.ghiChu = ghiChu;
        this.ngayDK = ngayDK;
    }

    NguoiHoc(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public NhanVien getMaNV() {
        return maNV;
    }

    public void setMaNV(NhanVien maNV) {
        this.maNV = maNV;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    @Override
    public String toString() {
        return this.getHoTen();
    }

    

    
}
