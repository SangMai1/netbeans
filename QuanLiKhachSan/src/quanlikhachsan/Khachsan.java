/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlikhachsan;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Khachsan extends Nguoi{
    private int songaytro;
    private String loaiphongtro;
    private int gia;
    private double tienphong;

    public Khachsan() {
    }

    public Khachsan(int songaytro, String loaiphongtro, int gia, double tienphong, String name, String ngaySinh, int CMND) {
        super(name, ngaySinh, CMND);
        this.songaytro = songaytro;
        this.loaiphongtro = loaiphongtro;
        this.gia = gia;
        this.tienphong = tienphong;
    }

    public int getSongaytro() {
        return songaytro;
    }

    public void setSongaytro(int songaytro) {
        this.songaytro = songaytro;
    }

    public String getLoaiphongtro() {
        return loaiphongtro;
    }

    public void setLoaiphongtro(String loaiphongtro) {
        this.loaiphongtro = loaiphongtro;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public double getTienphong() {
        return getSongaytro() * getGia();
    }

    public void setTienphong(double tienphong) {
        this.tienphong = tienphong;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("so ngay tro:");
        setSongaytro(sc.nextInt());
        System.out.println("Loai phong:");
        setLoaiphongtro(sc.next());
        System.out.println("Gia:");
        setGia(sc.nextInt());
  
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getSongaytro()+"-"+getLoaiphongtro()+"-"+getGia()+"-"+getTienphong());
    }
    
   
}
