/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach12;

/**
 *
 * @author SANG
 */
public class cN {
    private String macn;
    private String tencn;

    public cN() {
    }

    public cN(String macn, String tencn) {
        this.macn = macn;
        this.tencn = tencn;
    }

    public String getMacn() {
        return macn;
    }

    public void setMacn(String macn) {
        this.macn = macn;
    }

    public String getTencn() {
        return tencn;
    }

    public void setTencn(String tencn) {
        this.tencn = tencn;
    }

    @Override
    public String toString() {
        return this.tencn;
    }
}
