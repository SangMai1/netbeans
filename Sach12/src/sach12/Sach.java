/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach12;

import java.util.Date;

/**
 *
 * @author SANG
 */
public class Sach {
    private String msach;
    private String tensach;
    private cN chuyennganh;
    private Date ngaynhap;
    private int soluong;
    private Float giaban;
    private String hinhanh;

    public Sach() {
    }

    public Sach(String msach, String tensach, cN chuyennganh, Date ngaynhap, int soluong, Float giaban, String hinhanh) {
        this.msach = msach;
        this.tensach = tensach;
        this.chuyennganh = chuyennganh;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.giaban = giaban;
        this.hinhanh = hinhanh;
    }

    public String getMsach() {
        return msach;
    }

    public void setMsach(String msach) {
        this.msach = msach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public cN getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(cN chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Float getGiaban() {
        return giaban;
    }

    public void setGiaban(Float giaban) {
        this.giaban = giaban;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
    
}
