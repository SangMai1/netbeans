/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_student;

import java.io.File;
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
public class StudentDAO {
    public static final String FILE_NAME = "student.txt";
    List<Student> ls = new ArrayList<>();
   
    public int addStudent(Student st){
        ls.add(st);
        return 1;
    }
    public int count(){
        return ls.size();
    }

    public int find(int id){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.getId() == id) {
                pos = i;
            }
        }
        return pos;
    }
    
    public int delStudent(int id){
        int pos = find(id);
        if (pos >= 0) {
            ls.remove(pos);
        }
        return pos;
    }
    public int edit(Student st){
        int pos = find(st.getId());
        if (pos >= 0) {
            ls.set(pos, st);
        }
        return pos;
    }
    public Student findStudent(int id){
        int pos = find(id);
        Student st = null;
        if (pos >= 0) {
            st = ls.get(pos);
        }
        return st;
    }
    public void saveFile(){
        try {
            FileOutputStream pos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(pos);
            oos.writeObject(ls);
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
    }
    public void readFile(){
        try {
            List ls = new ArrayList();
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream red = new ObjectInputStream(fis);
            ls =(List) red.readObject();
            red.close();
        } catch (Exception e) {
            System.out.println("Error"+e.toString());
        }
    }
}
