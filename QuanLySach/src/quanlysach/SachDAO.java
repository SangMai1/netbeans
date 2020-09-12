/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class SachDAO {
    List<Sach> ls = new ArrayList<>();
    public final String FILE_NAME = "sang1.txt";
    public int addSach(Sach s){
        ls.add(s);
        return 1;
    }
    public int count(){
        return ls.size();
    }
    public int find(int id){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Sach s = ls.get(i);
            if (s.getId() == id) {
                pos = i;
            }
        }
        return pos;
    }
    public int delSach(int id){
        int pos = find(id);
        if (pos >= 0) {
            ls.remove(pos);
        }
        return pos;
    }
    public Sach findSach(int id){
        int pos = find(id);
        if (pos >= 0) {
            return ls.get(pos);
        }
        return null;
    }
    public int editSach(Sach s){
        int pos = find(s.getId());
        if (pos >= 0) {
            ls.set(pos, s);
        }
        return pos;
    }
    public Sach getSach1(int index){
        if (index < 0) {
            index = 0;
        }
        if (index >= count()) {
            index = count() -1;
        }
        return ls.get(index);
    }
    public void saveFile(){
        try {
            FileOutputStream oos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream fos = new ObjectOutputStream(oos);
            fos.writeObject(oos);
        } catch (Exception e) {
            System.out.println("ERROR:"+e.toString());
        }
    }
    public void readFile(){
        try {
            FileInputStream res = new FileInputStream(FILE_NAME);
            ObjectInputStream dos = new ObjectInputStream(res);
            ls = (List) dos.readObject();
            dos.close();
        } catch (Exception e) {
            System.out.println("ERROR:"+e.toString());
        }
    }

    
}
