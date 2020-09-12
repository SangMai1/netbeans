/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_employee;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class SanPhamDAO {
    public static final String FILE_NAME = "sanpham.txt";
    List<SanPham> lsSP = new ArrayList<>();
    public int add(SanPham sp){
        lsSP.add(sp);
        return 1;
    }
    
    public int count(){
        return lsSP.size();
    }
    
    public List<SanPham> getAllSanPham(){
        return lsSP;
    }

    public SanPham findByID(String id){
        for (SanPham sp : lsSP) {
            if (sp.getMaSP().equalsIgnoreCase(id)) {
                return sp;
            }
        }
        return null;
    }
    public int del(String id){
        SanPham sp = findByID(id);
        if (sp != null) {
            lsSP.remove(sp);
            return 1;
        }
        return -1;
    }
    public SanPham getSanPhamAtPoint(int position){
        return lsSP.get(position);
    }
    public int edit(SanPham spNew){
        for (SanPham sp : lsSP) {
            if (sp.getMaSP().equalsIgnoreCase(spNew.getMaSP())) {
                sp.setTenSP(spNew.getTenSP());
                sp.setNgayNhap(spNew.getNgayNhap());
                sp.setGia(spNew.getGia());
                sp.setSoLuong(spNew.getSoLuong());
                sp.setLoaiSP(spNew.getLoaiSP());
                return 1;
            }
        }
        return -1;
    }
    public void saveFile(){
        try {
            FileOutputData oos = new FileOutputData(FILE_NAME);
            ObjectOutputStream oso = new ObjectOutputStream(out);
        } catch (Exception e) {
            System.out.println("ERROR"+e.toString());
        }
//        try {
//            FileOutputStream fos = new FileOutputStream(filename);
//            ObjectOutputStream dos = new ObjectOutputStream(fos);
//            dos.writeObject(lsSP);
//        } catch (Exception e) {
//            System.out.println("ERROR"+e.toString());
//        }
    }
}
