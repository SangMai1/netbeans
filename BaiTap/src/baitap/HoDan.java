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
public class HoDan extends Nguoi{
    private int songuoi;
    private String sonha;
    private String tenhogiadinh;

    public HoDan() {
    }

    public HoDan(int songuoi, String sonha, String tenhogiadinh, int id, String name, String ngaysinh, String nghe) {
        super(id, name, ngaysinh, nghe);
        this.songuoi = songuoi;
        this.sonha = sonha;
        this.tenhogiadinh = tenhogiadinh;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getTenhogiadinh() {
        return tenhogiadinh;
    }

    public void setTenhogiadinh(String tenhogiadinh) {
        this.tenhogiadinh = tenhogiadinh;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("So thanh vien trong gia dinh");
        setSonguoi(sc.nextInt());
        System.out.println("Ten ho gia dinh");
        setTenhogiadinh(sc.next());
        System.out.println("So nha");
        setSonha(sc.next());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getSonguoi()+"-"+getTenhogiadinh()+"-"+getSonha());
    }
    
    public static void main(String[] args) {
        HoDan hd = new HoDan();
        hd.input();
        hd.output();
    }
}
