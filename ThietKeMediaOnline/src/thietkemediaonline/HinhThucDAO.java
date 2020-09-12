/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thietkemediaonline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class HinhThucDAO {
    public static List<HinhThuc> lsht = new ArrayList<>();
    public int add(HinhThuc ht){
        lsht.add(ht);
        return 1;
    }
    public List<HinhThuc> getAllHinhThuc(){
        return lsht;
    }
}
