/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * F
 *
 * @author SANG
 */
public class Main {

    List<KhuPho> kp = new ArrayList<>();

    public void input() {
        KhuPho dt = new KhuPho();
        dt.input();
        kp.add(dt);
    }

    public void output() {
        for (KhuPho ls : kp) {
            ls.output();
        }
    }

    public static void main(String[] args) {
        Main n = new Main();
        n.menu();
    }

    public void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            System.out.println("1.Ho Dan");
            System.out.println("2.Khu pho");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    output();
                    break;
            }
        }

    }
}
