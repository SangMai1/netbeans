/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_project;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author SANG
 */
public class DataInputExample {
    public static void main(String[] args) {
        try {
            FileInputStream fos = new FileInputStream("D:/netbean/file1.dat");
            DataInputStream red = new DataInputStream(fos);
            int n = red.readInt();
            double m = red.readDouble();
            fos.close();
            red.close();
            System.out.println("So nguyen"+n);
            System.out.println("So thuc"+m);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
