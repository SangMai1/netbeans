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
public class SinhVien {
    private int id;
    private String name;
    private String ngaySinh;
    private String lop;
    private int MSV;

    public SinhVien() {
    }

    public SinhVien(int id, String name, String ngaySinh, String lop, int MSV) {
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.MSV = MSV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getMSV() {
        return MSV;
    }

    public void setMSV(int MSV) {
        this.MSV = MSV;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho va ten sinh vien:");
        setName(sc.nextLine());
        System.out.println("Ma sinh vien:");
        setMSV(sc.nextInt());
        System.out.println("Ngay sinh:");
        setNgaySinh(sc.next());
        System.out.println("Lop:");
        setLop(sc.next());
    }
    public void output(){
        System.out.println("=>"+getId()+"-"+getName()+"-"+getMSV()+"-"+getNgaySinh()+"-"+getLop());
    }
}
