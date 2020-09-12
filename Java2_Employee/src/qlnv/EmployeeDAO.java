/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SANG
 */
public class EmployeeDAO {
    List<Employee> daoe = new ArrayList<>();
    public int add(Employee ee){
        daoe.add(ee);
        return 1;
    }
    
    public List<Employee> getAllEmployee(){
        return daoe;
    }
    public Employee find(int id){
        for (Employee ee : daoe) {
            if (ee.getMaNV() == id) {
                return ee;
            }
        }
        return null;
    }
    public int del(int id){
        Employee ee = find(id);
        if (ee != null) {
            daoe.remove(ee);
            return 1;
        }
        return -1;
    }
    public int edit(Employee eeNew){
        for (Employee ee : daoe) {
            if (ee.getMaNV() == eeNew.getMaNV()) {
                ee.setTenNV(eeNew.getTenNV());
                ee.setNgaysinh(eeNew.getNgaysinh());
                ee.setGioiTinh(eeNew.isGioiTinh());
                ee.setPhongban(eeNew.getPhongban());
                ee.setHinhanh(eeNew.getHinhanh());
                return 1;
            }
        }
        return -1;
    }
    public Employee getAtPointEmployee(int position){
        return daoe.get(position);
    }
    public List<Employee> getAllFindEmployee(String find){
        List<Employee> lsFind = new ArrayList<>();
        for (Employee ee : daoe) {
            if (ee.getPhongban().contains(find)) {
                lsFind.add(ee);
            }
        }
        return lsFind;
    }
}
