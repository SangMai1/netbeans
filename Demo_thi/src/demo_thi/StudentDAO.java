/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_thi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author SANG
 */
public class StudentDAO {

    List<StudentJava> st = new ArrayList<>();

    public void allStudent() {
        Scanner sc = new Scanner(System.in);
        String tt = "y";
        do {
            StudentJava stu = new StudentJava();
            stu.inputStudent();
            st.add(stu);
            System.out.println("continue(y/n)");
            tt = sc.next();
        } while (tt.equalsIgnoreCase("y"));
    }

    public void getAllStudent() {
        for (StudentJava studentJava : st) {
            studentJava.printStudent();
        }
    }

    public int findStudentByID(int id) {
        int pos = -1;
        for (int i = 0; i < st.size(); i++) {
            Student std = st.get(i);
            if (std.getId() == id) {
                pos = i;
            }
        }
        return pos;
    }

    public int deleteStudentID(int id) {
        int pos3 = findStudentByID(id);
        if (pos3 >= 0) {
            st.remove(pos3);
        }
        return pos3;

    }

    public void getArrangeStudentByAverage() {
        for (int i = 0; i < st.size()-1; i++) {
            for (int j = i; j < st.size(); j++) {
                StudentJava emplee;
                if (st.get(i).doAveradge() < st.get(j).doAveradge()) {
                    emplee = st.get(i);
                    st.set(i, st.get(j));
                    st.set(j, emplee);
                }
            }
        }
    }

    public void listStudentRemunerative(int n) {
        if(n > st.size()) {
            n = st.size();
        }
        List<StudentJava> dataSave = st;
        getArrangeStudentByAverage();
        for (int i = 0; i < n; i++) {
            if (st.get(i).doAveradge() >= 7) {
                st.get(i).printStudent();
            } else {
                break;
            }
        }
        
    }


    public void listStudentsNeedSupport(int point) {
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).doAveradge() <= point) {
                st.get(i).printStudent();
            }
        }
    }

    public void test() {
        st.add(new StudentJava(7, 8, 1, "a", 17, "dn"));
        st.add(new StudentJava(4, 5, 2, "b", 18, "qn"));
        st.add(new StudentJava(2, 10, 3, "c", 17, "qb"));
        st.add(new StudentJava(9, 2, 4, "d", 19, "sapa"));
        st.add(new StudentJava(1, 5, 5, "e", 15, "lao cai"));
        st.add(new StudentJava(2, 4, 6, "j", 29, "hue"));
        st.add(new StudentJava(6, 6, 7, "k", 26, "qt"));
        st.add(new StudentJava(1, 9, 8, "h", 21, "hcm"));
        st.add(new StudentJava(7, 6, 9, "l", 20, "dn"));
        st.add(new StudentJava(5, 8, 10, "o", 14, "qn"));
        st.add(new StudentJava(8, 8, 11, "q", 19, "qb"));
        st.add(new StudentJava(9, 8, 12, "p", 23, "dn"));
    }

    public static void main(String[] args) {
        StudentDAO stda = new StudentDAO();
        stda.menu();
    }

    public void menu() {
        while (true) {
            int choice = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Nhap Student");
            System.out.println("2.In ra Student");
            System.out.println("3.Tim kiem Student theo ID");
            System.out.println("4.Xoa Student theo ID");
            System.out.println("5.Sap xep");
            System.out.println("6.Danh sach sinh vien khen thuong");
            System.out.println("7.Can duoc ho tro");
            System.out.println("Lua chon");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    allStudent();
                    break;
                case 2:
                    test();
                    getAllStudent();

                    break;
                case 3:
                    System.out.println("Nhap id can tim");
                    int pos1 = findStudentByID(sc.nextInt());
                    if (pos1 < 0) {
                        System.out.println("k tim thay");
                    } else {
                        Student s = st.get(pos1);
                        s.printStudent();
                    }
                    break;
                case 4:
                    System.out.println("Nhap id can xoa");
                    int pos2 = deleteStudentID(sc.nextInt());
                    if (pos2 < 0) {
                        System.out.println("k tim thay");
            } else {
//                        Student s = st.get(pos2);
                        //test();
//                        s.printStudent();
                        for (StudentJava stjv : st) {
                            stjv.printStudent();
                        }
                    }
                    break;
                case 5:
                    getArrangeStudentByAverage();
                    getAllStudent();
                    break;
                case 6:
                    listStudentRemunerative(4);
                    break;
                case 7:
                    listStudentsNeedSupport(5);
                    break;
            }

        }
    }
}
