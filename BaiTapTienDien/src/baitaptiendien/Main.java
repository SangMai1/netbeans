/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptiendien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class Main {
    List<BienLai> bl = new ArrayList<>();
    public void inputs(){
        Scanner c = new Scanner(System.in);
        int check = 0;
        do {            
            BienLai lai = new BienLai();
            lai.input();
            bl.add(lai);
            System.out.println("Continue(1/0)?");
            check = c.nextInt();
        } while (check != 0);
    }
    public void outputs(){
        for (BienLai lb : bl) {
            lb.output();
        }
    }
    public static void main(String[] args) {
       Main m = new Main();
       m.menu();
    }
    public void menu(){
        while (true) {            
            Scanner sc = new Scanner(System.in);
            int chon = 0;
            System.out.println("1.Khach hang");
            System.out.println("2.Bien Lai");
            System.out.println("Lua chon:");
            chon = sc.nextInt();
            switch(chon){
                case 1: inputs(); break;
                case 2: outputs(); break;
            }
        }
    }
}
