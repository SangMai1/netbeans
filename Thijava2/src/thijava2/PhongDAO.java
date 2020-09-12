/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thijava2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class PhongDAO {
    public static List<Phong> ls = new ArrayList<>();
    public PhongDAO(){
        ls.add(new Phong("1", "GIAM DOC"));
        ls.add(new Phong("2", "NHAN SU"));
        ls.add(new Phong("3", "KE TOAN"));
        ls.add(new Phong("4", "HANH CHINH"));

    }
    public int add(Phong p){
        ls.add(p);
        return 1;
    }
    public List<Phong> getPhong(){
        return ls;
    }
}
