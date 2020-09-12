/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thietkemediaonline;

/**
 *
 * @author SANG
 */
public class Phim {
    private String nhaSanXuat;
    private String daoDien;

    public Phim() {
    }

    public Phim(String nhaSanXuat, String daoDien) {
        this.nhaSanXuat = nhaSanXuat;
        this.daoDien = daoDien;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getDaoDien() {
        return daoDien;
    }

    public void setDaoDien(String daoDien) {
        this.daoDien = daoDien;
    }
    
}
