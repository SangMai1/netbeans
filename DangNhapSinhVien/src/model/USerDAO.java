/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class USerDAO {
    List<USer> ls = new ArrayList<>();
    public  USerDAO(){
        ls.add(new USer("sang", "Sang@12345"));
        ls.add(new USer("sang1", "S@ng12345"));
        ls.add(new USer("sang2", "vanS@ng12345"));
        ls.add(new USer("sang3", "vanS@98765"));
    }
    public boolean checkLogin(String name, String pass){
        boolean check = false;
        
        for (int i = 0; i < ls.size(); i++) {
            USer u = ls.get(i);
            if (u.getUsername().equals(name) && u.getPassword().equals(pass)) {
                check = true;
                break;
            }
        }
        return check;
    }
}
