/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class StudentDAO {

    //1. tim sinh vien theo id
    //2. tim sinh vien theo ten
    //3. in ra sinh vien co diem tb cao nhat
    //4. in ra cac sinh vien GIOI   
    //5. sua thong tin sinh vien theo id
    //6. xoa sinh vien theo id
    //7. tinh tbc diem tb sv the lop
    //8. in ra max tbc sv theo lop
    //9. in ds sv theo tung lop
    List<Student> ls = new ArrayList<>();

    public void inputStudent() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Web");
        System.out.println("2. UD");
        System.out.println("3. MOB");
        choice = sc.nextInt();
        Student st = null;
        switch (choice) {
            case 1:
                st = new StudentWeb();
                st.input();
                break;
            case 2:
                st = new StudentUD();
                st.input();
                break;
            case 3:
                st = new StudentMOB();
                st.input();
                break;
        }
        ls.add(st);
    }

    public void outputs() {
        for (Student st : ls) {
            st.output();
        }
    }

    public int findStudentId(int id) {
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.getId() == id) {
                pos = i;
            }
        }
        return pos;
    }

    public int findStudentName(String name) {
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.getName().equalsIgnoreCase(name)) {
                pos = i;
            }
        }
        return pos;
    }

    public void maxStudent() {
        double max = ls.get(0).avg();
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.avg() > max) {
                max = st.avg();
                pos = i;
            }
        }
        if (pos >= 0) {
            Student st = ls.get(pos);
            st.output();
        } else {
            System.out.println("k tim thay");
        }
    }

    public void studentGioi() {
        int pos = -1;
        for (int i = 0; i < ls.size(); i++) {
            Student st = ls.get(i);
            if (st.avg() >= 8) {
                pos = i;
                st.output();
            }
        }
    }

    public int updateStudent(int id) {
        int pos = findStudentId(id);
        if (pos >= 0) {
            Student st = ls.get(pos);
            st.input();
            ls.set(pos, st);
            return pos;
        }
        return pos;
    }

    public int delStudent(int id) {
        int pos = findStudentId(id);
        if (pos >= 0) {
            ls.remove(pos);
        }
        return pos;
    }

    public void listStudent() {
       List<Integer> Web = new ArrayList<>();
       List<Integer> UD = new ArrayList<>();
       List<Integer> MOB = new ArrayList<>();
       boolean check = true;
        for (int i = 0; i < ls.size(); i++) {
            check = ls.get(i) instanceof StudentWeb;
            if (check == true) {
                Web.add(i);
            } else {
                check = ls.get(i) instanceof StudentUD;
                if (check == true) {
                UD.add(i);
                } else {
                    MOB.add(i);
                }
            }
        }
        showClass(Web, "Web");
        showClass(UD, "UD");
        showClass(MOB, "MOB");
    }
    public void showClass(List<Integer> listInt, String name){
        System.out.println("Class: "+name);
        for (Integer integer : listInt) {
            ls.get(integer).output();
        }
    }
    public void maxAvgOfClass() {
        Integer count[] = new Integer[3];
        double mark[] = new double[3];
        for (int i = 0; i < 3; i++) {
            mark[i] = 0;
            count[i] = 0;
        }
        boolean checkWeb = true;
        for (Student l : ls) {
             checkWeb = l instanceof StudentWeb;
            if (checkWeb == true) {
                mark[0] += l.avg();
                ++count[0];
            } else {
                checkWeb = l instanceof StudentUD;
                if (checkWeb == true) {
                    mark[1] += l.avg();
                    ++count[1];
                } else {
                    mark[2] += l.avg();
                    ++count[2];
                }
            }
        }
        System.out.println("");
        System.out.println("Diem trung binh StudentWeb : "+mark[0]/count[0]);
        System.out.println("Diem trung binh StudentUD : "+mark[1]/count[1]);
        System.out.println("Diem trung binh StudentMOB : "+mark[2]/count[2]);
    }
    public void maxAvgSVClass(){
        Integer pos[] = new Integer[3];
        double max[] = new double[3];
        for(int i=0; i<3; i++){
            pos[i]=0;
            max[i]=-Double.MAX_VALUE;
        }
            boolean check = true;
        for (int i1=0; i1<ls.size(); i1++) {
             check = ls.get(i1) instanceof StudentWeb;
            if(check==true){
                if (max[0]<ls.get(i1).avg()){
                    pos[0]=i1;
                }
            }else{
                check= ls.get(i1) instanceof StudentUD;
                if(check==true){
                    if(max[1]<ls.get(i1).avg()){
                        pos[1]=i1;
                    }
                }else{
                    if (max[2]<ls.get(i1).avg()){
                        pos[2]=i1;
                    }
                }
            }
        }
        
        System.out.println("");
        System.out.println("Diem trung binh cao nhat StudentWeb"+ls.get(pos[0]).avg());
        System.out.println("Diem trung binh cao nhat StudentApp"+ls.get(pos[1]).avg());
        System.out.println("Diem trung binh cao nhat StudentMobile"+ls.get(pos[2]).avg());
        
    }
    public static void main(String[] args) {
        StudentDAO std = new StudentDAO();
        std.menu();
    }

    public void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.println("1. input");
            System.out.println("2. output");
            System.out.println("3. find Student id");
            System.out.println("4. find Student name");
            System.out.println("5. max student avg");
            System.out.println("6. List student gioi");
            System.out.println("7. Updata Student");
            System.out.println("8. Delete Student");
            System.out.println("9. Input List Student class");
            System.out.println("10. sum avg of class");
            System.out.println("11. max avg of class");
            System.out.println("ban chon?");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputStudent();
                    break;
                case 2:
                    outputs();
                    break;
                case 3:
                    System.out.println("Nhap id can tim:");
                    int pos = findStudentId(sc.nextInt());
                    if (pos < 0) {
                        System.out.println("k tim thay");
                    } else {
                        Student s = ls.get(pos);
                        s.output();
                    }
                    break;
                case 4:
                    System.out.println("Nhap ten can tim:");
                    int pos1 = findStudentName(sc.next());
                    if (pos1 < 0) {
                        System.out.println("k tim thay");
                    } else {
                        Student s = ls.get(pos1);
                        s.output();
                    }
                    break;
                case 5:
                    maxStudent();
                    break;
                case 6:
                    studentGioi();
                    break;
                case 7:
                    System.out.println("Nhap id can tim:");
                    int pos2 = updateStudent(sc.nextInt());
                    if (pos2 < 0) {
                        System.out.println("k tim thay");
                    } else {
                        Student s = ls.get(pos2);
                        s.output();
                    }
                    break;
                case 8:
                    System.out.println("Nhap id can xoa:");
                    int pos3 = delStudent(sc.nextInt());
                    if (pos3 < 0) {
                        System.out.println("k tim thay");
                    } else {
                        Student s = ls.get(pos3);
                        s.output();
                    }
                    break;
                case 9:
                    listStudent();
                    break;
                case 10:
                    maxAvgOfClass();
                    break;
                case 11:
                    maxAvgSVClass();
                    break;

            }
        }
    }
}
