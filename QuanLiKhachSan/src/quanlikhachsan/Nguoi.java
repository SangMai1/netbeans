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
public class Nguoi {
     private String name;
    private String ngaySinh;
    private int CMND;

    public Nguoi() {
    }

    public Nguoi(String name, String ngaySinh, int CMND) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.CMND = CMND;
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

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho va ten:");
        setName(sc.nextLine());
        System.out.println("Ngay Sinh:");
        setNgaySinh(sc.next());
        System.out.println("CMND:");
        setCMND(sc.nextInt());
    }
    public void output(){
        System.out.println("=>"+getName()+"-"+getNgaySinh()+"-"+getCMND());
    }
}
