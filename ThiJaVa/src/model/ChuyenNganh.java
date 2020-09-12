/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SANG
 */
public class ChuyenNganh {
    private String maCN;
    private String tenCN;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String maCN) {
        this.maCN = maCN;
    }

    
    
    public ChuyenNganh(String maCN, String tenCN) {
        this.maCN = maCN;
        this.tenCN = tenCN;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    @Override
    public String toString() {
        return this.getMaCN();
    }

    
    
}
