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
public class HocVien {
    private int maHV;
    private KhoaHoc maKH;
    private NguoiHoc nguoihoc;
    private double diem;

    public HocVien() {
    }

    public HocVien(int maHV, KhoaHoc maKH, NguoiHoc nguoihoc, double diem) {
        this.maHV = maHV;
        this.maKH = maKH;
        this.nguoihoc = nguoihoc;
        this.diem = diem;
    }

    HocVien(int i, String a01, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public KhoaHoc getMaKH() {
        return maKH;
    }

    public void setMaKH(KhoaHoc maKH) {
        this.maKH = maKH;
    }

    public NguoiHoc getNguoihoc() {
        return nguoihoc;
    }

    public void setNguoihoc(NguoiHoc nguoihoc) {
        this.nguoihoc = nguoihoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "HocVien{" + "maHV=" + maHV + ", maKH=" + maKH + ", nguoihoc=" + nguoihoc + ", diem=" + diem + '}';
    }

    
    
}
