/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvienispace;

import java.io.Serializable;

/**
 *
 * @author SANG
 */
public class Sach implements Serializable{
    private int id;
    private String tensach;
    private String tacgia;
    private String nxb;
    private double giatien;
    private String ngaymuon;
    private String ngaytra;
    private String theloai;
    private String noidesach;

    public Sach() {
    }

    public Sach(int id, String tensach, String tacgia, String nxb, double giatien, String ngaymuon, String ngaytra, String theloai, String noidesach) {
        this.id = id;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nxb = nxb;
        this.giatien = giatien;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.theloai = theloai;
        this.noidesach = noidesach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNoidesach() {
        return noidesach;
    }

    public void setNoidesach(String noidesach) {
        this.noidesach = noidesach;
    }
    
}
