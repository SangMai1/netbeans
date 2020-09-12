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
public class EmployeeDAO {
    public static List<Employee> arr = new ArrayList<>();
    public int add(Employee ee){
        arr.add(ee);
        return 1;
    }
    public List<Employee> getAll(){
        return arr;
    }
    public Employee getByID(String id){
        for (Employee ee : arr) {
            if (ee.getId().equals(id)) {
                return ee;
            }
        }
        return null;
    }
    public int edit(Employee eeNew) {
        for (Employee ee : arr) {
            if (ee.getId().equals(eeNew.getId())) {
                ee.setName(eeNew.getName());
                ee.setGender(eeNew.isGender());
                return 1;
            }
        }
        return 0;
    }
    public int del(String id){
        Employee ee = getByID(id);
        if (ee != null) {
            arr.remove(ee);
            return 1;
        }
        return -1;
    }
}
