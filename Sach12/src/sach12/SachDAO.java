/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class SachDAO {
    List<Sach> ls = new ArrayList<>();
    public int add(Sach s){
        ls.add(s);
        return 1;
    }
    public int count(){
        return ls.size();
    }
    public List<Sach> getAllSach(){
        return ls;
    }
    public Sach getAtPoint(int position){
        return ls.get(position);
    }
    public Sach find(String id){
        for (Sach s : ls) {
            if (s.getMsach().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
    public int del(String id){
        Sach s = find(id);
        if (s != null) {
            ls.remove(s);
            return 1;
        }
        return -1;
    }
    public int edit(Sach sNew){
        for (Sach s : ls) {
            if (s.getMsach().equals(sNew.getMsach())) {
                s.setTensach(sNew.getTensach());
                s.setChuyennganh(sNew.getChuyennganh());
                s.setNgaynhap(sNew.getNgaynhap());
                s.setSoluong(sNew.getSoluong());
                s.setGiaban(sNew.getGiaban());
                s.setHinhanh(sNew.getHinhanh());
                return 1;
            }
        }
        return -1;
    }
    public Sach getAllSach123(int pos){
        return ls.get(pos);
    }
}
