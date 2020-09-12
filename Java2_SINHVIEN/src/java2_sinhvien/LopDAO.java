/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_sinhvien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class LopDAO {
    List<Lop> lsp = new ArrayList<>();
    public LopDAO(){
        lsp.add(new Lop("1", "18I1"));
        lsp.add(new Lop("2", "18O1"));
        lsp.add(new Lop("3", "19C3"));
        lsp.add(new Lop("4", "20U4"));
    }
    public int add(Lop ls){
        lsp.add(ls);
        return 1;
    }
    public List<Lop> getAllLop(){
        return lsp;
    }
}
