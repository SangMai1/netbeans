/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class KhuPho extends HoDan{
    private int khuPho;

    public KhuPho() {
    }

    public KhuPho(int khuPho, int songuoi, String sonha, String tenhogiadinh, int id, String name, String ngaysinh, String nghe) {
        super(songuoi, sonha, tenhogiadinh, id, name, ngaysinh, nghe);
        this.khuPho = khuPho;
    }

    public int getKhuPho() {
        return khuPho;
    }

    public void setKhuPho(int khuPho) {
        this.khuPho = khuPho;
    }
    
}
