/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author SANG
 */
public class KhoaHoc {
    private int maKH;
    private ChuyenDe ChuyenDe;
    private Date ngayKhaiGiang;
    private float hocPhi;
    private int thoiLuong;
    private NhanVien nguoiTao;
    private Date ngayTao;
    private String ghiChu;

    public KhoaHoc() {
    }

    public KhoaHoc(int maKH) {
        this.maKH = maKH;
    }
    
    public KhoaHoc(int maKH, ChuyenDe ChuyenDe, Date ngayKhaiGiang, float hocPhi, int thoiLuong, NhanVien nguoiTao, Date ngayTao, String ghiChu) {
        this.maKH = maKH;
        this.ChuyenDe = ChuyenDe;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public ChuyenDe getChuyenDe() {
        return ChuyenDe;
    }

    public void setChuyenDe(ChuyenDe ChuyenDe) {
        this.ChuyenDe = ChuyenDe;
    }

    public Date getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(Date ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public NhanVien getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(NhanVien nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return this.getChuyenDe().getMaCD()+"("+this.getNgayKhaiGiang()+")";
    }

    
    
}
