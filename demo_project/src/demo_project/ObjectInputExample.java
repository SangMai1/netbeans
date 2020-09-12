/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author SANG
 */
public class ObjectInputExample {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            FileInputStream fos = new FileInputStream("D:/netbean/file2.dat");
            ObjectInputStream red = new ObjectInputStream(fos);
            Stock arr[] = (Stock[]) red.readObject();
            for (Stock s : arr) {
                System.out.println(s.toString());
            }
            fos.close();
            red.close();
        } catch (IOException ex) {
            System.out.println("Loi doc file"+ex);
        }
    }
}
