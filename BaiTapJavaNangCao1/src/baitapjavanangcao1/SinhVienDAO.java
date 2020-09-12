/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjavanangcao1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author SANG
 */
public class SinhVienDAO {
    List<SinhVien> daosv = new ArrayList<>();
    public int addSinhVien(SinhVien sv){
        daosv.add(sv);
        return 1;
    }
    public int count(){
        return daosv.size();
    }
    public List<SinhVien> getAllSinhVien(){
        return daosv;
    }
    public SinhVien findSinhVien(String id){
        for (SinhVien sv : daosv) {
            if (sv.getId().equalsIgnoreCase(id)) {
                return sv;
            }
        }
        return null;
    }
    public int delSinhVien(String id){
        SinhVien sv = findSinhVien(id);
        if (sv != null) {
            daosv.remove(sv);
            return 1;
        }
        return -1;
    }
    public SinhVien getAtPointSinhVien(int position){
        return daosv.get(position);
    }
    public List<SinhVien> getFindSinhVien(String find){
        List<SinhVien> lsFind = new ArrayList<>();
        for (SinhVien sv : daosv) {
            if (sv.getId().contains(find)) {
            
                lsFind.add(sv);
            }
        }
        return lsFind;
    }
}
