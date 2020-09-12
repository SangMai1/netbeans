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
public class PTGT {
    private String hangsanxxuat;
    private int namsanxuat;
    private int gia;
    private String mau;

    public PTGT() {
    }

    public PTGT(String hangsanxxuat, int namsanxuat, int gia, String mau) {
        this.hangsanxxuat = hangsanxxuat;
        this.namsanxuat = namsanxuat;
        this.gia = gia;
        this.mau = mau;
    }

    public String getHangsanxxuat() {
        return hangsanxxuat;
    }

    public void setHangsanxxuat(String hangsanxxuat) {
        this.hangsanxxuat = hangsanxxuat;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hang san xuat:");
        setHangsanxxuat(sc.next());
        System.out.println("Nam san xuat:");
        setNamsanxuat(sc.nextInt());
        System.out.println("Gia:");
        setGia(sc.nextInt());
        System.out.println("Mau xe:");
        setMau(sc.next());
    }
    public void output(){
        System.out.println("=>"+getHangsanxxuat()+"-"+getNamsanxuat()+"-"+getGia()+"-"+getMau());
    }
}
