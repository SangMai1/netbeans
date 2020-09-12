/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_demo;


import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class SachDAO {
    public static final String FILE_NAME = "sach111.txt"; 
    List<sach> ls = new ArrayList<>();
    public int addSach(sach s){
        ls.add(s);
        return 1;
    }
    public int count(){
        return ls.size();
    }
    public int find(int id){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            sach s = ls.get(i);
            if (s.getIdsach()== id) {
                pos = i;
            }
        }
        return pos;
    }
    public int del(int id){
        int pos = find(id);
        if (pos > 0) {
            ls.remove(pos);
        
        }
        return pos;
    }

    public sach getSachId(int id){
        int pos =  find(id);
        sach s = null;
        if (pos >= 0) {
            s = ls.get(pos);
        }
        return s;
    }
    
    public int update(sach s){
        int pos = find(s.getIdsach());
        if (pos >= 0) {
            ls.set(pos, s);
        }
        return pos;
    }
    public void saveFile(){
        try {
            FileOutputData oos = new FileOutputData(FILE_NAME);
            ObjectOutputStream pos = new ObjectOutputStream(out);
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
    }
    public void readAllFile(){
        try {
            List s = new ArrayList();
            FileInputStream doc = new FileInputStream(FILE_NAME);
            ObjectInputStream red = new ObjectInputStream(doc);
            s = (List) red.readObject();
            red.close();
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
    }
}
 
