/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap5;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class HCN {
    private int chieuDai;
    private int chieuRong;

    public HCN() {
    }

    public HCN(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        setChieuDai(sc.nextInt());
        System.out.println("Nhap chieu rong");
        setChieuRong(sc.nextInt());
    }
    public void output(){
        getChuvi();
        getDientich();
    }
    public void getChuvi(){
        int chuvi = (getChieuDai() + getChieuRong()) * 2;
         System.out.println("chu vi:"+chuvi);
    }
    public void getDientich(){
        int dientich = getChieuDai() * getChieuRong();
        System.out.println("dien tich: "+dientich);
    }
    public static void main(String[] args) {
        HCN h1 = new HCN();
        h1.input();
        h1.output();
    }
}
