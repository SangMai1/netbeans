/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptiendien;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class BienLai extends KhachHang{
    private int id;
    private int chiSoCu;
    private int chiSoMoi;
    private int Tien;

    public BienLai() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getTien() {
        return (getChiSoMoi()-getChiSoCu()) * 750;
    }

    public void setTien(int Tien) {
        this.Tien = Tien;
    }

    public BienLai(int id, int chiSoCu, int chiSoMoi, int Tien, String hoVaTenChuHo, String soNha, String soCongTo) {
        super(hoVaTenChuHo, soNha, soCongTo);
        this.id = id;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.Tien = Tien;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        setId(sc.nextInt());
        System.out.println("Chi so cu:");
        setChiSoCu(sc.nextInt());
        System.out.println("Chi so moi:");
        setChiSoMoi(sc.nextInt());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getId()+"-"+getChiSoCu()+"-"+getChiSoMoi()+"-"+getTien());
    }
    
}
