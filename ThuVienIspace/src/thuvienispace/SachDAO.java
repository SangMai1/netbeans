/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuvienispace;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class SachDAO {
    List<Sach> ls = new ArrayList<>();
    public int addSach(Sach s){
        ls.add(s);
        return 1;
    }
}
