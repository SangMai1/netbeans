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
public class OTo extends PTGT{
    private int sochongoi;
    private String kieudongco;

    public OTo() {
    }

    public OTo(int sochongoi, String kieudongco, String hangsanxxuat, int namsanxuat, int gia, String mau) {
        super(hangsanxxuat, namsanxuat, gia, mau);
        this.sochongoi = sochongoi;
        this.kieudongco = kieudongco;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public void setKieudongco(String kieudongco) {
        this.kieudongco = kieudongco;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("So cho ngoi:");
        setSochongoi(sc.nextInt());
        System.out.println("Kieu dong co:");
        setKieudongco(sc.next());
    }

    @Override
    public void output() {
        super.output(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=>"+getSochongoi()+"-"+getKieudongco());
    }
    
}
