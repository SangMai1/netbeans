/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapphuongtiengt;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Xetai extends PTGT{
    private String trongtai;

    public Xetai() {
    }

    public Xetai(String trongtai, String hangsanxxuat, int namsanxuat, int gia, String mau) {
        super(hangsanxxuat, namsanxuat, gia, mau);
        this.trongtai = trongtai;
    }

    public String getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(String trongtai) {
        this.trongtai = trongtai;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Trong tai:");
        setTrongtai(sc.next());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getTrongtai());
    }
    
}
