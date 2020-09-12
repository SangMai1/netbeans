/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thietkemediaonline;

/**
 *
 * @author SANG
 */
public class Sach {
   private String masach;
   private String tensach;
   private String nhaxuatban;
   private String tacgia;
   private HinhThuc hinhthuc;
   private int soluong;
   private float giamua;
   private float giaban;

    public Sach() {
    }

    public Sach(String masach, String tensach, String nhaxuatban, String tacgia, HinhThuc hinhthuc, int soluong, float giamua, float giaban) {
        this.masach = masach;
        this.tensach = tensach;
        this.nhaxuatban = nhaxuatban;
        this.tacgia = tacgia;
        this.hinhthuc = hinhthuc;
        this.soluong = soluong;
        this.giamua = giamua;
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

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public HinhThuc getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(HinhThuc hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGiamua() {
        return giamua;
    }

    public void setGiamua(float giamua) {
        this.giamua = giamua;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }
   
}
