/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachjava3;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class Sach {
    private int masach;
    private String tensach;
    private float gia;
    private Date ngaynhap;
    private NhaXuatBan maxb;

    public Sach() {
    }

    public Sach(int masach, String tensach, float gia, Date ngaynhap, NhaXuatBan maxb) {
        this.masach = masach;
        this.tensach = tensach;
        this.gia = gia;
        this.ngaynhap = ngaynhap;
        this.maxb = maxb;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public NhaXuatBan getMaxb() {
        return maxb;
    }

    public void setMaxb(NhaXuatBan maxb) {
        this.maxb = maxb;
    }
    
}
