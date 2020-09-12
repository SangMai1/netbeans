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
public class Sach {
    private String masach;
    private String tensach;
    private String chuyennganh;
    private Date ngaynhap;
    private int soluong;
    private Double giaban;

    public Sach() {
    }

    public Sach(String masach, String tensach, String chuyennganh, Date ngaynhap, int soluong, Double giaban) {
        this.masach = masach;
        this.tensach = tensach;
        this.chuyennganh = chuyennganh;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.giaban = giaban;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
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

    public Double getGiaban() {
        return giaban;
    }

    public void setGiaban(Double giaban) {
        this.giaban = giaban;
    }
    
}
