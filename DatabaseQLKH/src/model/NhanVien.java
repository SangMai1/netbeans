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
public class NhanVien {
    private String manhanvien;
    private String matkhau;
    private String hoten;
    private boolean vaitro;

    public NhanVien() {
    }

    public NhanVien(String manhanvien) {
        this.manhanvien = manhanvien;
    }
    
    public NhanVien(String manhanvien, String matkhau, String hoten, boolean vaitro) {
        this.manhanvien = manhanvien;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.vaitro = vaitro;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isVaitro() {
        return vaitro;
    }

    public void setVaitro(boolean vaitro) {
        this.vaitro = vaitro;
    }

    @Override
    public String toString() {
        return this.getManhanvien();
    }

    

    
    
}
