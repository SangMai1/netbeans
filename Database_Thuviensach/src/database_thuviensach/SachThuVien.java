/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_thuviensach;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class SachThuVien extends Student implements Serializable{

    private String idsach;
    private String TenSach;
    private String tacgia;
    private int NXB;
    private double price;

    public SachThuVien() {
    }

    public SachThuVien(String idsach, String TenSach, String tacgia, int NXB, double price, String id, String name, String email, String phone) {
        super(id, name, email, phone);
        this.idsach = idsach;
        this.TenSach = TenSach;
        this.tacgia = tacgia;
        this.NXB = NXB;
        this.price = price;
    }

    public String getIdsach() {
        return idsach;
    }

    public void setIdsach(String idsach) {
        this.idsach = idsach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getNXB() {
        return NXB;
    }

    public void setNXB(int NXB) {
        this.NXB = NXB;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   

    @Override
    public String toString() {
        return "Thu vien: id sach:"+this.idsach+"-Ten sach:"+this.TenSach+"-Tac gia:"+this.tacgia + "-Nha xuat ban:"+this.NXB+"-Gia:"+this.price;
    }

}
