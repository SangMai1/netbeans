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
public class Xemay extends PTGT{
    private String congsuat;

    public Xemay() {
    }

    public Xemay(String congsuat, String hangsanxxuat, int namsanxuat, int gia, String mau) {
        super(hangsanxxuat, namsanxuat, gia, mau);
        this.congsuat = congsuat;
    }

    public String getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(String congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Cong suat:");
        setCongsuat(sc.next());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getCongsuat());
    }
    
}
