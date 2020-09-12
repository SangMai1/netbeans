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
public class QuanLyDiem {
    private SinhVien sv;
    private float diemTin;
    private float diemAnhVan;
    private float diemGDTC;

    public QuanLyDiem() {
    }

    public QuanLyDiem(SinhVien sv, float diemTin, float diemAnhVan, float diemGDTC) {
        this.sv = sv;
        this.diemTin = diemTin;
        this.diemAnhVan = diemAnhVan;
        this.diemGDTC = diemGDTC;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public float getDiemTin() {
        return diemTin;
    }

    public void setDiemTin(float diemTin) {
        this.diemTin = diemTin;
    }

    public float getDiemAnhVan() {
        return diemAnhVan;
    }

    public void setDiemAnhVan(float diemAnhVan) {
        this.diemAnhVan = diemAnhVan;
    }

    public float getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(float diemGDTC) {
        this.diemGDTC = diemGDTC;
    }
    
    
   
    public double getDiemTB(){
        return(diemTin + diemAnhVan + diemGDTC) / 3;
    }
    public String xepLoai(){
        double dtb = getDiemTB();
        String xl;
        if (dtb >= 9) {
            xl = "Xuat sac";
        } else if (dtb >= 8) {
            xl = "Gioi";
        } else {
            xl = "Kha";
        }
        return xl;
    }
}
