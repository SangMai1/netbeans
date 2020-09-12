/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class LoaiSanPhamDAO {
    public static List<LoaiSanPham> lsloaiSP = new ArrayList<>();
    public int add(LoaiSanPham lsp){
        lsloaiSP.add(lsp);
        return 1;
    }
    public List<LoaiSanPham> getAllLoaiSP(){
        return lsloaiSP;
    }
    public LoaiSanPham findbyName(String name){
        for (LoaiSanPham lsp : lsloaiSP) {
            if (lsp.getTenSP().equalsIgnoreCase(name)) {
                return lsp;
            }
        }
        return null;
    }
}
