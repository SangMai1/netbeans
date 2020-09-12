/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javafx.scene.effect.DisplacementMap;

/**
 *
 * @author SANG
 */
public class SanPhamDAO {
    public static List<SanPham> lsSP = new ArrayList<>();
    public int add(SanPham sp){
       lsSP.add(sp);
       return 1;
    }
    public List<SanPham> getAllSanPham(){
        return lsSP;
    }
    public int count(){
        return lsSP.size();
    }
    public int find(String masp){
        for (int i = 0; i < lsSP.size(); i++) {
            if (lsSP.get(i).getMasp().equalsIgnoreCase(masp)) {
                return i;
            }
        }
        return -1;
    }
    public int del(String masp){
        int pos = find(masp);
        if (pos >= 0) {
            lsSP.remove(pos);
            return pos;
        }
            return -1;
    }
    public List<SanPham> getFind(String find){
        List<SanPham> lsFind = new ArrayList<>();
        for (SanPham spm : lsSP) {
            if (spm.getMasp().contains(find)) {
                lsSP.add(spm);
            }
        }
        return lsFind;
    }
    public SanPham getPosition(int id){
        return lsSP.get(id);
    }
}
