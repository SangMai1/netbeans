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
public class MuaHang {
    private String mamuahang;
    private HoaDon mahoadon;
    private SanPham masanpham;

    public MuaHang() {
    }

    public MuaHang(String mamuahang, HoaDon mahoadon, SanPham masanpham) {
        this.mamuahang = mamuahang;
        this.mahoadon = mahoadon;
        this.masanpham = masanpham;
    }

    public String getMamuahang() {
        return mamuahang;
    }

    public void setMamuahang(String mamuahang) {
        this.mamuahang = mamuahang;
    }

    public HoaDon getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(HoaDon mahoadon) {
        this.mahoadon = mahoadon;
    }

    public SanPham getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(SanPham masanpham) {
        this.masanpham = masanpham;
    }
   
}
