/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author SANG
 */
public class ObjectOutputExample {
    public static void main(String[] args) {
        try {
            FileOutputStream pos = new FileOutputStream("D:/netbean/file2.dat");
            ObjectOutputStream doc = new ObjectOutputStream(pos);
            Stock s[] = {
                new Stock(1, "CPU", 300, 5),
                new Stock(2, "RAM", 200, 3),
                new Stock(3, "AVG", 700, 1)
            };
            doc.writeObject(s);
            pos.close();
            doc.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file"+ex);
        }
    }
}
