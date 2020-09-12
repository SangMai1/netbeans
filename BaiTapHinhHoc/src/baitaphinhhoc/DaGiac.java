/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaphinhhoc;

import java.util.Scanner;

/**
 *
 * @author SANG
 */
public class DaGiac {
    private int socanhdagiac;
    static int a[] = new int[100];

    public DaGiac() {
    }

    public DaGiac(int socanhdagiac) {
        this.socanhdagiac = socanhdagiac;
    }

    public int getSocanhdagiac() {
        return socanhdagiac;
    }

    public void setSocanhdagiac(int socanhdagiac) {
        this.socanhdagiac = socanhdagiac;
    }

    public static int[] getA() {
        return a;
    }

    public static void setA(int[] a) {
        DaGiac.a = a;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so canh cua da giac:");
        setSocanhdagiac(sc.nextInt());
        System.out.println("Chieu dai cac canh cua da giac:");
    }
}
