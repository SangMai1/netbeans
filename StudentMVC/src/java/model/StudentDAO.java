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
public class StudentDAO {
    public static List<Student> ls = new ArrayList<>();
    public int add(Student st){
        ls.add(st);
        return 1;
    }
    public List<Student> getAll(){
        return ls;
    }
}
