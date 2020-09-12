/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

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
    private String theloai;
    private String tang;

    public Sach() {
    }

    public Sach(int id, String tensach, String tacgia, String nxb, String theloai, String tang) {
        this.id = id;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nxb = nxb;
        this.theloai = theloai;
        this.tang = tang;
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

    public String isTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTang() {
        return tang;
    }

    public void setTang(String tang) {
        this.tang = tang;
    }
    
}
