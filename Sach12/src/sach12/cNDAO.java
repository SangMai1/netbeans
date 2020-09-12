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
public class cNDAO {
    public static List<cN> ls = new ArrayList<>();
    public int add(cN c){
        ls.add(c);
        return 1;
    }
    public List<cN> getAllcN(){
        return ls;
    } 
}
