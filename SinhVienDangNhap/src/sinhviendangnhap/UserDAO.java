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
public class UserDAO {
    List<User> ls = new ArrayList<>();
    public UserDAO(){
        ls.add(new User("sang", "Sang@12345"));
        ls.add(new User("sang2", "S@ng12345"));
        ls.add(new User("sang3", "vanS@ng12345"));
    }
    public boolean checkdangnhap(String name, String pass){
        boolean check = false;
        for (int i = 0; i < ls.size(); i++) {
            User s = ls.get(i);
            if (s.getName().equals(name) && s.getPassword().equals(pass)) {
                check = true;
                break;
            }
        }
        return check;
    }
    
}
