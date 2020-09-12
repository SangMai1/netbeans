 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_employee;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class EmpoyeeDAO {
    public List<Employee> ls = new ArrayList<>();
    public int add(Employee ee){
        ls.add(ee);
        return 1;
    }
    public int count(){
        return ls.size();
    }
    public int findById(int id){
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Employee e = ls.get(i);
            if (e.getId() == id) {
                pos = i;
            }
        }
        return pos;
    }
    public int del(int id){
        int pos = findById(id);
        if (pos >= 0) {
            ls.remove(pos);
        }
        return pos;
    }
    public Employee getEmployee(int id){
        int pos = findById(id);
        if (pos >= 0) {
            return ls.get(pos);
        }
        return null;
    }
    public int edit(Employee ee){
        int pos = findById(ee.getId());
        if (pos >= 0) {
            ls.set(pos, ee);
        }
        return pos;
    }
    public Employee getEmployeeByInder(int index){
        if (index <0) {
            index = 0;
        }
        if (index >= count()) {
            index = count() -1;
        }
        return ls.get(index);
    }
    
}
