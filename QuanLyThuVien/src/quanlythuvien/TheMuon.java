/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class TheMuon extends SinhVien{
    private int sophieumuon;
    private String ngaymuon;
    private String hantra;
    private String sohieusach;
    private String Tensach;

    public TheMuon() {
    }

    public TheMuon(int sophieumuon, String ngaymuon, String hantra, String sohieusach, String Tensach) {
        this.sophieumuon = sophieumuon;
        this.ngaymuon = ngaymuon;
        this.hantra = hantra;
        this.sohieusach = sohieusach;
        this.Tensach = Tensach;
    }

    public int getSophieumuon() {
        return sophieumuon;
    }

    public void setSophieumuon(int sophieumuon) {
        this.sophieumuon = sophieumuon;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getHantra() {
        return hantra;
    }

    public void setHantra(String hantra) {
        this.hantra = hantra;
    }

    public String getSohieusach() {
        return sohieusach;
    }

    public void setSohieusach(String sohieusach) {
        this.sohieusach = sohieusach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String Tensach) {
        this.Tensach = Tensach;
    }
    

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("so phieu muon:");
        setSophieumuon(sc.nextInt());
        System.out.println("Ten sach:");
        setTensach(sc.next());
        System.out.println("Ngay muon:");
        setNgaymuon(sc.next());
        System.out.println("Han tra");
        setHantra(sc.next());
        System.out.println("so hieu sach");
        setSohieusach(sc.next());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getSophieumuon()+"-"+getTensach()+"-"+getNgaymuon()+"-"+getHantra()+"-"+getSohieusach());
    }
    
}
