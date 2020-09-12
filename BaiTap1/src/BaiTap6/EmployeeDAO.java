/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap6;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class EmployeeDAO {

    //khai bao mang Employee
    Employee arr[] = new Employee[100];
    int index = 0;

    //inputs
    public void inputs() {
        String tt = "y";
        Scanner sc = new Scanner(System.in);
        do {
            Employee ee = new Employee();
            ee.input();
            arr[index] = ee;
            index++;
            System.out.println("continue?(y/n)");
            tt = sc.next();
        } while (tt.equalsIgnoreCase("y"));
    }

    public void outputs() {
        for (int i = 0; i < 10; i++) {
            Employee ee = arr[i];
            ee.output();
        }
    }

    public void arrangement() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = i; j < index; j++) {
                if (arr[i].getSalary() > arr[j].getSalary()) {
                    Employee temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void dummyData() {
        index = 10;
        arr[0] = new Employee(0, "A0", 1000);
        arr[1] = new Employee(1, "A1", 9000);
        arr[2] = new Employee(2, "A2", 7000);
        arr[3] = new Employee(3, "A3", 10000);
        arr[4] = new Employee(4, "A4", 6000);
        arr[5] = new Employee(5, "A5", 8000);
        arr[6] = new Employee(6, "A6", 5000);
        arr[7] = new Employee(7, "A7", 3000);
        arr[8] = new Employee(8, "A8", 4000);
        arr[9] = new Employee(9, "A9", 2000);
    }

    public void findEmloyeeMaxSalary() {
        double max = arr[0].getSalaryAfterTax();
        int pos = 0;
        for (int i = 0; i < index; i++) {
            if (arr[i].getSalaryAfterTax() > max) {
                max = arr[i].getSalaryAfterTax();
                pos = i;
            }
        }
        System.out.println("max salary");
        arr[pos].output();
    }

    public int findEmployeeByName(String name) {
        int pos = -1;
        for (int i = 0; i < index; i++) {
            Employee ee = arr[i];
            if (ee.getName().contains(name)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        EmployeeDAO en = new EmployeeDAO();
        //en.inputs();
        en.dummyData();
        
        String findName = "A5";
        int pos = en.findEmployeeByName(findName);
        if(pos < 0){
             // System.out.println("k tim thay");
        } else {
            System.out.println("tim thay: ");
            en.arr[pos].output();
        }
        
        en.arrangement();
        en.findEmloyeeMaxSalary();
        en.outputs();

    }
}
