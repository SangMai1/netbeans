/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Nguoi {

    /**
     * @param args the command line arguments
     */
    private int id;
    private String name;
    private String ngaysinh;
    private String nghe;

    public Nguoi() {
    }

    public Nguoi(int id, String name, String ngaysinh, String nghe) {
        this.id = id;
        this.name = name;
        this.ngaysinh = ngaysinh;
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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
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
        System.out.println("Nhap ho va ten");
        setName(sc.next());
        System.out.println("Nhap ngay sinh");
        setNgaysinh(sc.next());
        System.out.println("Nghe nghiep:");
        setNghe(sc.next());
    }
    public void output(){
        System.out.println("=>"+getId()+"-"+getName()+"-"+getNgaysinh()+"-"+getNghe());
    }
    
}
