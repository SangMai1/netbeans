/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhviendangnhap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class SinhVienDAO {
    List<SinhVien> ls = new ArrayList<>();
    public int add(SinhVien sv){
        ls.add(sv);
        return 1;
    }
    public int count(){
        return ls.size();
    }
    public List<SinhVien> getAllSinhVien(){
        return ls;
    }
    public SinhVien find(String id){
        for (SinhVien sv : ls) {
            if (sv.getMasv().equalsIgnoreCase(id)) {
                return sv;
            }
        }
        return null;
    }
    public int del(String id){
        SinhVien sv = find(id);
        if (sv != null) {
            ls.remove(sv);
            return 1;
        }
        return -1;
    }
    public SinhVien getAtPointSinhVien(int position){
        return ls.get(position);
    }
    public int edit(SinhVien svNew){
        for (SinhVien s : ls) {
            if (s.getMasv().equals(svNew.getMasv())) {
                s.setTensv(svNew.getTensv());
                s.setEmail(svNew.getEmail());
                s.setPhone(svNew.getPhone());
                s.setDender(svNew.isDender());
                s.setDiachi(svNew.getDiachi());
                s.setHinhanh(svNew.getHinhanh());
               return 1;
            }
        }
        return -1;
    }
    public List<SinhVien> getFind(String find){
        List<SinhVien> lsFind = new ArrayList<>();
        for (SinhVien sv : ls) {
            if (sv.getMasv().contains(find)) {
                lsFind.add(sv);
            }
            
        }
        return lsFind;
    }
}
