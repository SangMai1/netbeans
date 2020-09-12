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
public class KhachHang {
    private String hoVaTenChuHo;
    private String soNha;
    private String soCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoVaTenChuHo, String soNha, String soCongTo) {
        this.hoVaTenChuHo = hoVaTenChuHo;
        this.soNha = soNha;
        this.soCongTo = soCongTo;
    }

    public String getHoVaTenChuHo() {
        return hoVaTenChuHo;
    }

    public void setHoVaTenChuHo(String hoVaTenChuHo) {
        this.hoVaTenChuHo = hoVaTenChuHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getSoCongTo() {
        return soCongTo;
    }

    public void setSoCongTo(String soCongTo) {
        this.soCongTo = soCongTo;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho va Ten chu ho:");
        setHoVaTenChuHo(sc.nextLine());
        sc = new Scanner(System.in);
        System.out.println("So nha:");
        setSoNha(sc.next());
        sc = new Scanner(System.in);
        System.out.println("Ma so conng to:");
        setSoCongTo(sc.next());
    }

    public void output(){
        System.out.println("=>"+getHoVaTenChuHo()+"-"+getSoNha()+"-"+getSoCongTo());
    }
   
}
