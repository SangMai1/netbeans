/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class LoaiSanPhamDAO {
    List<LoaiSanPham> lsSP = new ArrayList<>();
    
    public LoaiSanPhamDAO(){
        lsSP.add(new LoaiSanPham("1", "Sam Sung"));
        lsSP.add(new LoaiSanPham("2", "Apple"));
        lsSP.add(new LoaiSanPham("3", "Sony"));
        lsSP.add(new LoaiSanPham("4", "BPhone"));
    }
    
    public int add(LoaiSanPham sp){
        lsSP.add(sp);
        return 1;
    }
    
    public List<LoaiSanPham> getAllLoaiSP(){
        return lsSP;
    }
}
