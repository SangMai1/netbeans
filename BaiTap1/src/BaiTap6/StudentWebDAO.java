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
public class StudentWebDAO {
    //Sắp xếp sinh viên theo điểm trung bình tăng dần.
    //in ra sinh viên có điểm tb cao nhất.
    //tìm sinh viên với tên nhập từ bàn phím
    StudentWeb arr[] = new StudentWeb[100];
    int index = 0;
    public void inputs(){
        Scanner sc = new Scanner(System.in);
        String tt = "y";
        do {            
            StudentWeb st = new StudentWeb();
            st.input();
            arr[index] = st;
            index++;
            System.out.println("tiep tuc?(y/n)");
            tt = sc.next();
        } while (tt.equalsIgnoreCase("y"));

      }
    
    public void outputs(){
        for(int i = 0; i < 5; i++){
            StudentWeb stt = arr[i];
            stt.output();
        }
    }
   
    public void arrangement(){
        for(int i = 0; i < index - 1; i++){
            for(int j = i; j < index; j++){
                if(arr[i].avg1() > arr[j].avg1()){
                    StudentWeb temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public void test(){
        index = 5;
        arr[0] = new StudentWeb(0, "A0", 2, 3);
        arr[1] = new StudentWeb(1, "A1", 4, 8);
        arr[2] = new StudentWeb(2, "A2", 8, 9);
        arr[3] = new StudentWeb(3, "A3", 7, 7);
        arr[4] = new StudentWeb(4, "A4", 9, 9);
        
    }
    
    public void findStudentMaxAvg(){
        double max = arr[0].avg1();
        int pos = 0;
        for (int i = 0; i < index; i++) {
            if(arr[i].avg1() > max){
                max = arr[i].avg1();
                pos = i;
            }
        }
        System.out.println("Max Student");
        arr[pos].output();
    }
    
    public int findByStudentName(String name){
        int pos = -1;
        for (int i = 0; i < index; i++) {
            StudentWeb sw = arr[i];
            if(sw.getName().contains(name)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        StudentWebDAO std = new StudentWebDAO();
        //std.inputs();
        std.test();
        
        String finname = "A3";
        int pos = std.findByStudentName(finname);
        if (pos < 0) {
            System.out.println("k tim thay");
        } else {
            System.out.println("tim thay");
            std.arr[pos].output();
        }
        std.arrangement();
        std.findStudentMaxAvg();
        std.outputs();
    }
}