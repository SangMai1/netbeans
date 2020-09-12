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
public class ChuyenDe {
    private String maCD;
    private String tenCD;
    private int thoiLuong;
    private double hocPhi;
    private String mota;
    private String hinh;

    public ChuyenDe() {
    }

    public ChuyenDe(String maCD) {
        this.maCD = maCD;
    }

    

    
    
    public ChuyenDe(String maCD, String tenCD, int thoiLuong, double hocPhi, String mota, String hinh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.thoiLuong = thoiLuong;
        this.hocPhi = hocPhi;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return this.getMaCD();
    }


    
}
