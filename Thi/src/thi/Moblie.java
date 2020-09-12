/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Moblie extends Product{
   private double giaban;
   private int soluong;
   private String HangSX;

    public Moblie() {
    }

    public Moblie(double giaban, int soluong, String HangSX, int masp, String tensp) {
        super(masp, tensp);
        this.giaban = giaban;
        this.soluong = soluong;
        this.HangSX = HangSX;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String HangSX) {
        this.HangSX = HangSX;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
       System.out.println("Gia ban");
       setGiaban(sc.nextDouble());
       System.out.println("So luong");
       setSoluong(sc.nextInt());
       System.out.println("Hang san xuat");
       setHangSX(sc.next());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getGiaban()+"-"+getSoluong()+"-"+getHangSX()+"-" + money());
    }

   public double money(){
       return  getGiaban() * getSoluong();
   }
}
