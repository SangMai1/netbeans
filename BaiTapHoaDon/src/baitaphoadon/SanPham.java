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
public class SanPham {
    private int masanpham;
    private String tensanpham;
    private int soluong;
    private double dongia;
    private String mota;

    public SanPham() {
    }

    public SanPham(int masanpham, int soluong) {
        this.masanpham = masanpham;
        this.soluong = soluong;
    }

    
    
    public SanPham(int masanpham, String tensanpham, int soluong, double dongia, String mota) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.mota = mota;
    }

    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
}
