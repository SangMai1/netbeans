/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysachjava3;

/**
 *
 * @author SANG
 */
public class NhaXuatBan {
    private int manxb;
    private String tennxb;
    private String diachi;

    public NhaXuatBan() {
    }

    public NhaXuatBan(int manxb, String tennxb) {
        this.manxb = manxb;
        this.tennxb = tennxb;
    }

    
    
    public NhaXuatBan(int manxb, String tennxb, String diachi) {
        this.manxb = manxb;
        this.tennxb = tennxb;
        this.diachi = diachi;
    }


    public int getManxb() {
        return manxb;
    }

    public void setManxb(int manxb) {
        this.manxb = manxb;
    }

    public String getTennxb() {
        return tennxb;
    }

    public void setTennxb(String tennxb) {
        this.tennxb = tennxb;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return this.getTennxb();
    }
    
}
