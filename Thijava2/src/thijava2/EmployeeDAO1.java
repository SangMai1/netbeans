/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thijava2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class EmployeeDAO1 {
    List<Employee> ls = new ArrayList<>();
    public int add(Employee ee){
        ls.add(ee);
        return 1;
    }
    public List<Employee> getEmployees(){
        return ls;
    }
    public Employee find(String id){
        for (Employee e : ls) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }
    public int del(String id){
        Employee ee = find(id);
        if (ee != null) {
            ls.remove(ee);
            return 1;
        }
        return -1;
    }
    public int edit(Employee eeNew){
        for (Employee e : ls) {
            if (e.getId().equals(eeNew.getId())) {
                e.setName(eeNew.getName());
                e.setGender(eeNew.isGender());
                e.setBirthday(eeNew.getBirthday());
                e.setSalary(eeNew.getSalary());
                e.setDeparment(eeNew.getDeparment());
                return 1;
            }
        }
        return -1;
    }
    public Employee getAtPoint(int position){
        return ls.get(position);
    }
    public List<Employee> getfind(String find){
        List<Employee> lsFind = new ArrayList<>();
        for (Employee ee : ls) {
            if (ee.getName().contains(find)) {
                lsFind.add(ee);
            }
        }
        return lsFind;
    }
}
