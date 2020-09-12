/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_demo;

import java.io.Serializable;

/**
 *
 * @author SANG
 */
public class sach implements Serializable{
    private int idsach;
    private String tensach;
    private String tacgia;
    private String NXB;
    private String theloai;

    public sach() {
        
    }

    public sach(int idsach, String tensach, String tacgia, String NXB, String theloai) {
        this.idsach = idsach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.NXB = NXB;
        this.theloai = theloai;
    }

    public int getIdsach() {
        return idsach;
    }

    public void setIdsach(int idsach) {
        this.idsach = idsach;
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

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    
}
