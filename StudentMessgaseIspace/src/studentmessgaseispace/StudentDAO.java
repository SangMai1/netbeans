/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmessgaseispace;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class StudentDAO {
    List<Student> ls = new ArrayList<>();
    public int add(Student model, String type){
        Student st = null;
        if (type.equalsIgnoreCase("UD")) {
            st = new  StudentUD();
            ls.add(model);
        } else {
            st = new StudentWeb();
            ls.add(model);
        }
        return 1;
    }
    public int getCount(){
        return ls.size();
    }
    public int find(int id){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.getId() == id) {
                pos = id;
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
    public int editStudent(Student st){
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
    public List<Student> getAllStudents(){
        return ls;
    }
    public List<StudentWeb> getFind(String find){
        List<StudentWeb> lsFind = new ArrayList<>();
          for (Student std : ls) {
              if (std.getName().contains(find)) {
                  ls.add(std);
              }
          }
          return lsFind;
    }
    public Student getPosition(int id){
        return ls.get(id);
    }

}
