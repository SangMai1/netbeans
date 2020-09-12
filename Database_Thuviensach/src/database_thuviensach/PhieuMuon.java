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
public class PhieuMuon extends Student implements Serializable {

    private String tensachcanmuon;
    private String idsachcanmuon;
    private String ngaymuon;
    private String ngaytra;

    public PhieuMuon() {
    }

    public PhieuMuon(String tensachcanmuon, String idsachcanmuon, String ngaymuon, String ngaytra, String id, String name, String email, String phone) {
        super(id, name, email, phone);
        this.tensachcanmuon = tensachcanmuon;
        this.idsachcanmuon = idsachcanmuon;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
    }

    public String getTensachcanmuon() {
        return tensachcanmuon;
    }

    public void setTensachcanmuon(String tensachcanmuon) {
        this.tensachcanmuon = tensachcanmuon;
    }

    public String getIdsachcanmuon() {
        return idsachcanmuon;
    }

    public void setIdsachcanmuon(String idsachcanmuon) {
        this.idsachcanmuon = idsachcanmuon;
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

    

    @Override
    public String toString() {
        return "Id sach can muon:" + this.idsachcanmuon + "Ten sach can muon:" + this.tensachcanmuon + "Ngay muon:" + this.ngaymuon + "Ngay tra:" + this.ngaytra;
    }

}
