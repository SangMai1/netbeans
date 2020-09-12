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
public class LopDAO {
    List<Lop> daol = new ArrayList<>();
    public LopDAO(){
        daol.add(new Lop("1", "18I1"));
        daol.add(new Lop("2", "18O1"));
        daol.add(new Lop("3", "19C1"));
        daol.add(new Lop("4", "30I1"));
    }
    public int add(Lop l){
        daol.add(l);
        return 1;
    }
    public List<Lop> getAllClass(){
        return daol;
    }
}
