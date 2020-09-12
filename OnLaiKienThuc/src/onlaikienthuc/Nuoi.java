/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlaikienthuc;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Nuoi {
    private int id;
    private String name;
    private String ngaySinh;
    private String nghe;

    public Nuoi() {
    }

    public Nuoi(int id, String name, String ngaySinh, String nghe) {
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.nghe = nghe;
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

    public String getNghe() {
        return nghe;
    }

    public void setNghe(String nghe) {
        this.nghe = nghe;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        setId(sc.nextInt());
        System.out.println("Nhap name:");
        setName(sc.next());
        System.out.println("Nhap ngay sinh:");
        setNgaySinh(sc.next());
        System.out.println("Nhap nghe nghiep:");
        setNghe(sc.next());
    }
    public void output(){
        System.out.println("=>"+getId()+"-"+getName()+"-"+getNgaySinh()+"-"+getNghe());
    }
}
